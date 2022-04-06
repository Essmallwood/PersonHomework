package owner;

public class HourlyEmployee extends Employee{

    public HourlyEmployee(String name,double hoursWorked,double hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    private double hourlyRate;
    private double hoursWorked;

    public double getHourlyRate() {
        return hourlyRate;
    }


    public double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public void calculatePay() {
        System.out.println(this.getHourlyRate()*this.getHoursWorked());
    }

    @Override
    public void introduceWorker() {
        System.out.println(this.getName());
    }
}
