class Employee {
    int id;
    String name;
    double salary;

    void show() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Day21_Program2_EmployeeClass {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.id = 1;
        e.name = "Rahul";
        e.salary = 45000;

        e.show();
    }
}
