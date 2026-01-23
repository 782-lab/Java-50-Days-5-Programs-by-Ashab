class Student {
    int roll;

    Student(int roll) {
        this.roll = roll;
    }

    public int hashCode() {
        return roll;
    }
}

class Day29_Program3_HashCode {
    public static void main(String[] args) {
        Student s1 = new Student(101);
        Student s2 = new Student(101);

        System.out.println("HashCode s1 = " + s1.hashCode());
        System.out.println("HashCode s2 = " + s2.hashCode());
    }
}
