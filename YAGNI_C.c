#include <stdio.h>

typedef struct {
    char name[50];
    int age;
    // Just in case we need it later
    int id;
} Person;

void saveToDatabase(Person p) {
    // No database yet, but leaving a stub for future
    printf("Saving to DB...\n");
}
------------------------------------------------------------------

#include <stdio.h>

typedef struct {
    char name[50];
    int age;
} Person;
