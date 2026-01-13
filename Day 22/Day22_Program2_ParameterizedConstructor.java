class Student {
    String name;
    int roll;

    Student(String n, int r) {
        name = n;
        roll = r;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}

class Day22_Program2_ParameterizedConstructor {
    public static void main(String[] args) {
        Student s = new Student("Ashab", 101);
        s.display();
    }
}
