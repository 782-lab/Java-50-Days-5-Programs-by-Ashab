interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Day27_Program5_Drawable {
    public static void main(String[] args) {
        Drawable d1 = new Rectangle();
        Drawable d2 = new Circle();

        d1.draw();
        d2.draw();
    }
}
