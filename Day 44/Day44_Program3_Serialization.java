import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}

class Day44_Program3_Serialization {
    public static void main(String[] args) {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream("student.ser"))) {

            Student s = new Student(101, "Ashab");
            oos.writeObject(s);

            System.out.println("Object serialized");

        } catch (Exception e) {
            System.out.println("Error during serialization");
        }
    }
}

