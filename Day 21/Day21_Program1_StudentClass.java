class Student {
    String name;
    int roll;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}

class Day21_Program1_StudentClass 
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.name = "Ashab";
        s1.roll = 101;

        s1.display();
    }
}
