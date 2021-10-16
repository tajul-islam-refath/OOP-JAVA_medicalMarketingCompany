
package medicalMarketingCompany;

import java.util.Scanner;

/**
 *
 * @author Md Rifat
 */
public class MedicalMarketingCompany {
   public static void main(String [] args){
//       Scanner sc = new Scanner(System.in);
       
       //SalariedEmployee
       SalariedEmployee employee = new SalariedEmployee();
       employee.setName("Tajul Islam Refath");
       employee.setEmployeeId("192-16-447");
       employee.setNID("12387654");
       employee.setMonthlySalary(5000);
       Payment pay = new Payment(employee.getEmployeeID(), employee.type, employee.calculationSalary());
       pay.makePayment();
       System.out.println();
       
       
       //HorlyPaidEmployee
       HorlyPaidEmployee employeeOne = new HorlyPaidEmployee();
       employeeOne.setName("Sadia aktar");
       employeeOne.setEmployeeId("192-16-444");
       employeeOne.setNID("64789456321");
       employeeOne.setHoursWorked(40);
       employeeOne.setHourlyrate(200);
       Payment pay2 = new Payment(employeeOne.getEmployeeID(), employeeOne.type, employeeOne.calculationSalary());
       pay2.makePayment();
       System.out.println();
       
       //CommissionedEmployee
       CommissionedEmployee employeeTwo = new CommissionedEmployee();
       employeeTwo.setName("Hasan");
       employeeTwo.setEmployeeId("192-16-446");
       employeeTwo.setNID("9871256356");
       employeeTwo.setSellamount(50000);
       employeeTwo.setPercantage(10);
       Payment pay3 = new Payment(employeeTwo.getEmployeeID(), employeeTwo.type, employeeTwo.calculationSalary());
       pay3.makePayment();
       System.out.println();
       
       //SalaryCommissionedEmployee
       SalaryCommissionedEmployee employeeThree = new SalaryCommissionedEmployee();
       employeeThree.setName("Kazi Prova");
       employeeThree.setEmployeeId("192-16-458");
       employeeThree.setNID("1234578456");
       employeeThree.setMonthlySalary(5000);
       employeeThree.setSellamount(30000);
       employeeThree.setPercantage(10);
       Payment pay4 = new Payment(employeeThree.getEmployeeID(), employeeThree.type, employeeThree.calculationSalary());
       pay4.makePayment();
   }
}
