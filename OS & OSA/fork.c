#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {
    pid_t pid1, pid2;

    printf("Parent process (PID: %d) starts.\n", getpid());

    // Create the first child
    pid1 = fork();

    if (pid1 < 0) {
        perror("Fork failed for child 1");
        exit(1);
    } else if (pid1 == 0) {
        // Code for the first child process
        printf("First child process (PID: %d, Parent PID: %d) created.\n", getpid(), getppid());

        // Create the second child from the first child
        pid2 = fork();

        if (pid2 < 0) {
            perror("Fork failed for child 2");
            exit(1);
        } else if (pid2 == 0) {
            // Code for the second child process
            printf("Second child process (PID: %d, Parent PID: %d) created.\n", getpid(), getppid());
            sleep(2); // Simulate some work
            printf("Second child process (PID: %d) exiting.\n", getpid());
            exit(0); // Terminate the second child
        } else {
            // Code for the first child (parent of second child)
            waitpid(pid2, NULL, 0); // Wait for the second child to finish
            printf("First child process (PID: %d) exiting.\n", getpid());
            exit(0); // Terminate the first child
        }
    } else {
        // Code for the parent process
        waitpid(pid1, NULL, 0); // Wait for the first child to finish
        printf("Parent process (PID: %d) exiting.\n", getpid());
        exit(0); // Terminate the parent
    }

    return 0;
}
