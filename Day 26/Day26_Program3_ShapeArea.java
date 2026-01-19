abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    double length = 10, breadth = 5;

    double area() {
        return length * breadth;
    }
}

class Circle extends Shape {
    double radius = 7;

    double area() {
        return 3.14 * radius * radius;
    }
}

class Day26_Program3_ShapeArea {
    public static void main(String[] args) {
        Shape s1 = new Rectangle();
        Shape s2 = new Circle();

        System.out.println("Rectangle Area = " + s1.area());
        System.out.println("Circle Area = " + s2.area());
    }
}
