class Student {
    int roll;

    Student(int roll) {
        this.roll = roll; // this refers to current object
    }

    void show() {
        System.out.println("Roll Number = " + roll);
    }
}

class Day28_Program1_ThisKeyword {
    public static void main(String[] args) {
        Student s = new Student(101);
        s.show();
    }
}
