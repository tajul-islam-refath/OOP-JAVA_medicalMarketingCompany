/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalMarketingCompany;

/**
 *
 * @author Md Rifat
 */
public class SalaryCommissionedEmployee extends CommissionedEmployee {
    private double monthlySalary;
    protected final String type = "Salary Commissioned Employee";
    
    @Override
    public double calculationSalary() {
         return sellamount*(percantage/100) + monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    
          @Override
   public void paymentInfo(){
       System.out.println("Employee Name : "+ getName());
       System.out.println("Employee ID : "+ getEmployeeID());
       System.out.println("Employee Type : "+ type);
       System.out.println("Payed Ammount : "+ calculationSalary());
      
   }
    
}
