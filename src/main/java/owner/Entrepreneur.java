package owner;

public class Entrepreneur extends Person implements IPayable{

    //Entrepreneurs have an income
    public Entrepreneur(String name, double income) {
        super(name);
        this.income = income;
    }

    private double income;

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public void calculatePay() {
        System.out.println(this.getIncome());
    }


    @Override
    public void introduceWorker() {
        System.out.println(this.getName());

    }
}
