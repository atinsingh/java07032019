public class Test {
    public static void main(String[] args) {
        Employee emp = new Employee(20,"Atin",1,20.0);
        System.out.println(emp.calculateMontlySalary());
        Manager manager = new Manager(20,"Vivek",2,20.0,500.0);
        System.out.println(manager.calculateMontlySalary());

        System.out.println(manager);
    }
}
