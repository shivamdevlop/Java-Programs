import java.util.Scanner; 
public class netsalary{ 
public static void main(String args[]) { 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter Employee Name: "); 
String employeeName = sc.nextLine(); 
System.out.print("Enter Basic Salary: "); 
double basicSalary = sc.nextDouble(); 
double dearnessAllowance = basicSalary * 30 / 100; 
double houseRentAllowance = basicSalary * 12.5 / 100; 
double providentFund = basicSalary * 10 / 100; 
double grossSalary = basicSalary + dearnessAllowance + houseRentAllowance; 
double netSalary = grossSalary - providentFund; 
System.out.println("\nEmployee Name : " + employeeName); 
System.out.println("Gross Salary : Rs. " + grossSalary); 
System.out.println("Net Salary   : Rs. " + netSalary); 
  } 
}