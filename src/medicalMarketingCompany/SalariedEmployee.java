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
public class SalariedEmployee extends Employee {
    private int monthlySalary;
    protected final String type = "Salaried Employee";

    @Override
    public double calculationSalary() {
        return monthlySalary;
    }
    
    public int getMonthlySalary(){  
        return monthlySalary;
    }
    
    public void setMonthlySalary(int monthlySalary){
        this.monthlySalary = monthlySalary;
    }
    
    @Override
   public void paymentInfo(){
       System.out.println("Employee Name : "+ getName());
       System.out.println("Employee ID : "+ getEmployeeID());
       System.out.println("Employee Type : "+ this.type);
       System.out.println("Payed Ammount : "+ calculationSalary());
   }
 
    
}
