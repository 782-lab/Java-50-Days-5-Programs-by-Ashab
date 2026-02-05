import java.util.ArrayList;

class Day36_Program1_ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("ArrayList Elements:");
        for (String lang : list) {
            System.out.println(lang);
        }
    }
}
