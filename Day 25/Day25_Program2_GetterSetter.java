class Employee {
    private String name;
    private double salary;

    public void setName(String n) {
        name = n;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class Day25_Program2_GetterSetter {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Ashab");
        e.setSalary(50000);

        System.out.println("Name   = " + e.getName());
        System.out.println("Salary = " + e.getSalary());
    }
}
