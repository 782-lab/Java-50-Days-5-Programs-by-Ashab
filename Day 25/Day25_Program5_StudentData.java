class Student {
    private String name;
    private int marks;

    public void setName(String n) {
        name = n;
    }

    public void setMarks(int m) {
        if (m >= 0 && m <= 100) {
            marks = m;
        } else {
            System.out.println("Invalid Marks");
        }
    }

    public void display() {
        System.out.println("Name  = " + name);
        System.out.println("Marks= " + marks);
    }
}

class Day25_Program5_StudentData {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Ashab");
        s.setMarks(88);

        s.display();
    }
}
