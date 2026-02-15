import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Day44_Program4_Deserialization {
    public static void main(String[] args) {

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("student.ser"))) {

            Student s = (Student) ois.readObject();

            System.out.println("Roll: " + s.roll);
            System.out.println("Name: " + s.name);

        } catch (Exception e) {
            System.out.println("Error during deserialization");
        }
    }
}
