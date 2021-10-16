
package medicalMarketingCompany;
import java.util.*;
/**
 *
 * @author Md Rifat
 */
public class Payment {
    private final String employeeID;
    private final String employeeType;
    private final double paidAmount; 
    Date d1 = new Date();
    
    public Payment(String employeeID,String employeeType , double paidAmount ){
        this.employeeID = employeeID;
        this.employeeType = employeeType;
        this.paidAmount = paidAmount;
        
    }
    
    
    public void makePayment(){
        System.out.println("Employee ID : "+employeeID);
        System.out.println("Employee Type : "+ employeeType);
        System.out.println("Ammount Paid : "+ paidAmount);
        System.out.println("PayedAt : "+ d1);     
    }
}
