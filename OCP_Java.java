// Base interface
public interface Shape {
    void draw();
}

// First implementation
public class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Second implementation
public class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Renderer - does not need modification to support new shapes
public class ShapeRenderer {
    public void render(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        renderer.render(circle);
        renderer.render(rectangle);
    }
}
