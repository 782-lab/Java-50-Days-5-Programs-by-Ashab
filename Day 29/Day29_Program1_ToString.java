class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public String toString() {
        return "Roll: " + roll + ", Name: " + name;
    }
}

class Day29_Program1_ToString {
    public static void main(String[] args) {
        Student s = new Student(101, "Ashab");
        System.out.println(s); // internally calls toString()
    }
}

