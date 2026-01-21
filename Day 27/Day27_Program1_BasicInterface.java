interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Day27_Program1_BasicInterface {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
