import java.util.List;
import java.util.ArrayList;

class Day39_Program4_WildcardExample {

    static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        printList(list);
    }
}
