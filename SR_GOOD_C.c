#include <stdio.h>

char* generateReport() {
    return "Report content";
}

void saveToFile(const char* content) {
    printf("Saving to file: %s\n", content);
}

void sendByEmail(const char* content) {
    printf("Sending email: %s\n", content);
}

int main() {
    const char* report = generateReport();
    saveToFile(report);
    sendByEmail(report);
    return 0;
}
