class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Day24_Program2_RuntimePolymorphism {
    public static void main(String[] args) {
        Shape s = new Circle(); // runtime binding
        s.draw();
    }
}
