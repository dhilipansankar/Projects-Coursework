#include <stdio.h>
#include <stdlib.h> // Required for exit()
#include <unistd.h> // Required for getpid()

int main() {
    printf("Process (PID: %d) is about to perform some task.\n", getpid());

    // Simulate some task
    printf("Process (PID: %d) has completed its task.\n", getpid());

    // Terminate the process
    printf("Process (PID: %d) is now exiting.\n", getpid());
    exit(0); // Exit with a status of 0 (success)

    // This line will not be reached
    printf("This message will not be printed.\n");

    return 0; // This return statement is effectively unreachable after exit()
}
