class Box<T> {
    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

class Day39_Program1_GenericClass {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);
        System.out.println("Integer Value = " + intBox.getValue());

        Box<String> strBox = new Box<>();
        strBox.setValue("Java");
        System.out.println("String Value = " + strBox.getValue());
    }
}
