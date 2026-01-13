class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

class Day22_Program4_ThisKeyword {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Rahul");
        e.display();
    }
}
