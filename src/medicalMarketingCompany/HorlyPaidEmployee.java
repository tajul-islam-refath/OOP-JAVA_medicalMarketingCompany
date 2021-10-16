
package medicalMarketingCompany;

/**
 *
 * @author Md Rifat
 */
public class HorlyPaidEmployee extends Employee {
    private double hoursWorked;
    private double hourlyrate;
    protected final String type = "Horly Paid Employee";

    @Override
    public double calculationSalary() {
        return hoursWorked*hourlyrate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyrate() {
        return hourlyrate;
    }

    public void setHourlyrate(double hourlyrate) {
        this.hourlyrate = hourlyrate;
    }
    
       @Override
   public void paymentInfo(){
       System.out.println("Employee Name : "+ getName());
       System.out.println("Employee ID : "+ getEmployeeID());
       System.out.println("Employee Type : "+ type);
       System.out.println("Payed Ammount : "+ calculationSalary());
   }
    
    
    
}
