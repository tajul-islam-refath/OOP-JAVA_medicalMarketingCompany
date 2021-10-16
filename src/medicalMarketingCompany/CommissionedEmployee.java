
package medicalMarketingCompany;

/**
 *
 * @author Md Rifat
 */
public class CommissionedEmployee extends Employee {
    protected double sellamount;
    protected double percantage;
    protected final String type = "Commissioned Employee";

    @Override
    public double calculationSalary() {
         return sellamount*(percantage/100);
    }

    public double getSellamount() {
        return sellamount;
    }

    public void setSellamount(double sellamount) {
        this.sellamount = sellamount;
    }

    public double getPercantage() {
        return percantage;
    }

    public void setPercantage(double percantage) {
        this.percantage = percantage;
    }
    
        @Override
   public void paymentInfo(){
       System.out.println("Employee Name : "+ getName());
       System.out.println("Employee ID : "+ getEmployeeID());
       System.out.println("Employee Type : "+ type);
       System.out.println("Payed Ammount : "+ calculationSalary());
      
   }
    
    
    
}
