class Student {
    String name;
    int roll;

    Student() {
        name = "Unknown";
        roll = 0;
    }

    Student(String n, int r) {
        name = n;
        roll = r;
    }

    void show() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
}

class Day22_Program3_ConstructorOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Ashab", 102);

        s1.show();
        s2.show();
    }
}
