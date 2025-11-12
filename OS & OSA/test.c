#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

void create_process_tree(int level, int max_levels) {
    if (level > max_levels) {
        return;
    }

    pid_t pid;
    printf("Process PID: %d, Parent PID: %d, Level: %d\n", getpid(), getppid(), level);

    if (level < max_levels) {
        pid = fork();
        if (pid == -1) {
            perror("fork failed");
            exit(EXIT_FAILURE);
        } else if (pid == 0) { // Child process
            create_process_tree(level + 1, max_levels);
            exit(EXIT_SUCCESS); // Child process terminates after creating its own children
        } else { // Parent process
            wait(NULL); // Wait for the child to complete
        }
    }
}

int main() {
    int max_levels = 3; // Define the depth of the process tree
    printf("Starting process tree creation...\n");
    create_process_tree(1, max_levels);
    printf("Main process (PID: %d) finished.\n", getpid());
    return 0;
}
