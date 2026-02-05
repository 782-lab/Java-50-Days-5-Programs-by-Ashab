import java.util.Stack;

class Day36_Program4_StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack Elements: " + stack);

        System.out.println("Popped Element: " + stack.pop());
    }
}
