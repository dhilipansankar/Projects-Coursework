#include <unistd.h>
#include <string.h>
#include <stdio.h>

int main(void) {
  int pipefds[2];
  char buffer[5];

  pipe(pipefds);

  char *message = "Hello";

  printf("Writing message to pipe...\n");
  write(pipefds[1], message, 5);

  read(pipefds[0], buffer, 5);
  printf("Read message: %s\n", buffer); 

  return 0;
}