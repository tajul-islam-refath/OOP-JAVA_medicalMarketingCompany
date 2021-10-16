
package medicalMarketingCompany;

/**
 *
 * @author Md Rifat
 */
public abstract class Employee implements SalaryCalculation {
    private String name;
    private String employeeID;
    private String NID;
    
    @Override
    public abstract double calculationSalary();
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setEmployeeId(String employeeID){
        this.employeeID = employeeID;
    }
    
    public String getEmployeeID(){
        return employeeID;
    }

    public String getNID() {
        return NID;
    }

    public void setNID(String NID) {
        this.NID = NID;
    }
    
    public void paymentInfo(){};
     
  
}
