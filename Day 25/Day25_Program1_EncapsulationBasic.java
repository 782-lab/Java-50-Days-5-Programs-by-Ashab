class Student {
    private int roll;

    public void setRoll(int r) {
        roll = r;
    }

    public int getRoll() {
        return roll;
    }
}

class Day25_Program1_EncapsulationBasic {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRoll(101);

        System.out.println("Roll Number = " + s.getRoll());
    }
}
