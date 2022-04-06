package owner;
// main
public class Payday {
    public static void main(String[] args) {

        IPayable salariedPerson1 = new SalariedEmployee("Berry", 200000);
        IPayable salariedPerson2 = new SalariedEmployee("Bob", 90000);
        IPayable hourlyEmployee1 = new HourlyEmployee("Joe", 40, 30);
        IPayable entrepreneur1 = new Entrepreneur("Chris", 1000000);

        IPayable[] employees = {salariedPerson1, salariedPerson2, hourlyEmployee1};
        issueBadge(employees);

        IPayable[] people = {salariedPerson1, salariedPerson2, hourlyEmployee1, entrepreneur1};
        printPay(people);

    }

    public static void issueBadge(IPayable[] employees) {
        for (IPayable e : employees) {
         e.introduceWorker();
        }
    }

    public static void printPay(IPayable[] people) {
        for (IPayable p : people) {
             p.calculatePay();
        }
    }

}



