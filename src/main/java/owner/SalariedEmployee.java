package owner;

public class SalariedEmployee extends Employee {

    public SalariedEmployee(String name,double salary) {
        super(name);
        this.salary = salary;
    }

    private double salary;

    public double getSalary() {
        return salary;
    }


    @Override
    public void calculatePay() {
        System.out.println(this.getSalary());
    }


    @Override
    public void introduceWorker() {
        System.out.println(this.getName());
    }
}
