public class Manager extends Employee {
    private double bonus;

    public Manager(int age, String name, int empId, double hourlyRate, double bonus) {
        super(age, name, empId, hourlyRate);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculateMontlySalary() {
       return super.calculateMontlySalary()+bonus;
    }

//    @Override
//    public String toString() {
//        return "I am awesome Manager";
//    }


}
