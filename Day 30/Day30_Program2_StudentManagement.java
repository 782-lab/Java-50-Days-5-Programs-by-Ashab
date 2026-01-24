class Student {
    private int roll;
    private String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void display() {
        System.out.println("Roll = " + roll);
        System.out.println("Name = " + name);
    }
}

class Day30_Program2_StudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Ashab");
        Student s2 = new Student(102, "Rahul");

        s1.display();
        s2.display();
    }
}
