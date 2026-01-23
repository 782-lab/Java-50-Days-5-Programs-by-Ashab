class Student {
    int roll;

    Student(int roll) {
        this.roll = roll;
    }

    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.roll == s.roll;
    }
}

class Day29_Program2_EqualsMethod {
    public static void main(String[] args) {
        Student s1 = new Student(101);
        Student s2 = new Student(101);

        if (s1.equals(s2)) {
            System.out.println("Objects are Equal");
        } else {
            System.out.println("Objects are NOT Equal");
        }
    }
}
