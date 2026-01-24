class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void showSalary() {
        System.out.println(name + " Salary = " + salary);
    }
}

class Day30_Program3_EmployeePayroll {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Ashab", 50000);
        Employee e2 = new Employee(2, "Aman", 45000);

        e1.showSalary();
        e2.showSalary();
    }
}
