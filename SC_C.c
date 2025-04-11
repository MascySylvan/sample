#include <stdio.h>
#include <string.h>

// Concern: Data
typedef struct {
    char name[50];
} User;

// Concern: Logic
int isValid(User user) {
    return strlen(user.name) > 0;
}

// Concern: Output
void printUser(User user) {
    printf("User: %s\n", user.name);
}

int main() {
    User user = { "Bob" };
    if (isValid(user)) {
        printUser(user);
    }
    return 0;
}
