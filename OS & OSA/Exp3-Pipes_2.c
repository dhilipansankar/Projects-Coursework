#include <unistd.h>
#include <sys/wait.h>
#include <stdio.h>
#include <stdlib.h>

int main(void) {
  int pipefds[2];
  char buffer[5];

  if(pipe(pipefds) == -1) {s
    perror("pipe"); 
    exit(1);
  }  

  pid_t pid = fork();

  if (pid == 0) { // Child process
    char *message = "Ping";
    close(pipefds[0]); // Close unused read end

    write(pipefds[1], message, 5); // Write message to pipe
    printf("Child sent: %s\n", message); 

  } else { // Parent process
    wait(NULL); 
    close(pipefds[1]); // Close unused write end

    read(pipefds[0], buffer, 5); // Read message from pipe
    printf("Parent received: %s\n", buffer);
  }

  return 0;
}