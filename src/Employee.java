public class Employee extends Person {
    private int empId;
    private double hourlyRate;

    public Employee(int age, String name, int empId, double hourlyRate) {
        super(age, name); // super means your parent
                        // we are calling constructor of Person class
        this.empId = empId;
        this.hourlyRate = hourlyRate;
    }

    public int getEmpId() {
        return empId;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double calculateMontlySalary(){
        // 21 in month, 8 hour day
        return 21*8*this.hourlyRate;
    }
}
