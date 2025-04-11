#include <stdio.h>

// Define a function pointer type
typedef void (*DrawFunction)();

typedef struct {
    DrawFunction draw;
} Shape;

// Implement draw functions
void drawCircle() {
    printf("Drawing a Circle\n");
}

void drawRectangle() {
    printf("Drawing a Rectangle\n");
}

// Render any shape
void renderShape(Shape shape) {
    shape.draw();
}

int main() {
    Shape circle = { drawCircle };
    Shape rectangle = { drawRectangle };

    renderShape(circle);
    renderShape(rectangle);

    return 0;
}
