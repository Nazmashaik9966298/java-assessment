package Assessments;
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Subclass: Circle
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Subclass: Square
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

// Main
class Main {
    public static void main(String[] args) {
        Shape shape;
        shape = new Circle();
        shape.draw();
        shape = new Square();
        shape.draw();
    }
}




