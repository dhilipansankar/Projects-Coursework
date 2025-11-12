#include <unistd.h>
#include <sys/wait.h>
#include <stdio.h>
#include <stdlib.h>

int main(void) {
  int pipefds1[2];
  int pipefds2[2];
  char buffer[30];
  pid_t pid;

  // Create the pipes
  if (pipe(pipefds1) == -1) {
    perror("pipe");
    exit(1);
  }
  if (pipe(pipefds2) == -1) {
    perror("pipe");
    exit(1);
  }

  // Fork a child process
  pid = fork();
  if (pid == -1) {
    perror("fork");
    exit(1);
  }

  if (pid == 0) { // STEP 6: Child process || Will Close unused ends of the pipes
    close(pipefds1[1]); 
    close(pipefds2[0]); 

    // Read two messages from the parent
    read(pipefds1[0], buffer, sizeof(buffer));
    printf("Child received: %s\n", buffer);
    read(pipefds1[0], buffer, sizeof(buffer));
    printf("Child received: %s\n", buffer);

    // Close the read end of the first pipe
    close(pipefds1[0]);

    // Write two messages to the parent
    char *msg_to_parent_1 = "Hello Parent 1";
    char *msg_to_parent_2 = "Hello Parent 2";
    write(pipefds2[1], msg_to_parent_1, sizeof("Hello Parent 1"));
    printf("Child sent: %s\n", msg_to_parent_1);
    write(pipefds2[1], msg_to_parent_2, sizeof("Hello Parent 2"));
    printf("Child sent: %s\n", msg_to_parent_2);

    // Close the write end of the second pipe
    close(pipefds2[1]);

  } else { // Parent process || lose unused ends of the pipes
    close(pipefds1[0]); 
    close(pipefds2[1]); 

    // Write two messages to the child
    char *msg_to_child_1 = "Hello Child 1";
    char *msg_to_child_2 = "Hello Child 2";
    write(pipefds1[1], msg_to_child_1, sizeof("Hello Child 1"));
    printf("Parent sent: %s\n", msg_to_child_1);
    write(pipefds1[1], msg_to_child_2, sizeof("Hello Child 2"));
    printf("Parent sent: %s\n", msg_to_child_2);
    
    // Close the write end of the first pipe
    close(pipefds1[1]);

    // Read two messages from the child
    read(pipefds2[0], buffer, sizeof(buffer));
    printf("Parent received: %s\n", buffer);
    read(pipefds2[0], buffer, sizeof(buffer));
    printf("Parent received: %s\n", buffer);

    // Close the read end of the second pipe
    close(pipefds2[0]);

    // Wait for the child process to finish
    wait(NULL);
  }

  return 0;
}
