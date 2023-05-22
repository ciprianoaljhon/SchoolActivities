import java.util.Scanner;
class Employee{ // 1st class
	String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
class FullTimeEmployee extends Employee{ // 2nd Class
	double monthlySalary;
	
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
}
class PartTimeEmployee extends Employee{ //3rd class
	double ratePerHour;
	int hoursWorked;
	double wage;
	
	public void setWage(double ratePerHour, int hoursWorked) {
		this.wage = ratePerHour * hoursWorked;
	}
	public double getWage() {
		return wage;
	}
}
/* The instruction given was "TheRunEmployee class should contain the main method
 * and will be used to execute the program".
 * That's why I named the file RunEmployee ^^
*/
public class RunEmployee { //4th class
	public static void main(String[] args) {
		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		employee.setName(sc.nextLine());
		System.out.println("Press F if Full Time Employee and P if Part Time Employee");
		char partTimeOrFullTime = sc.nextLine().toUpperCase().charAt(0);
		/* I used uppercase method on the scanner so I wouldn't need to...
		* compare lowercase letter on if else statement. So it doesn't matter
		* what case user enter as it will be converted to upper case
		*/
		if (partTimeOrFullTime == 'F') {
			FullTimeEmployee fullTimeEmployeeOne = new FullTimeEmployee();
			/* I already got the Employee Name and stored it on employee object earlier 
			 * so I just need to set it on the fullTimeEmployeeOne so 
			 * we can display / print it.
			 * */
			fullTimeEmployeeOne.setName(employee.getName());
			System.out.println("Type your Monthly Salary: ");
			fullTimeEmployeeOne.setMonthlySalary(sc.nextDouble());
			System.out.println("Name: " + fullTimeEmployeeOne.getName());
			System.out.println("Monthly Salary: " + fullTimeEmployeeOne.getMonthlySalary());
		} else if (partTimeOrFullTime == 'P'){
			PartTimeEmployee partTimeEmployeeOne = new PartTimeEmployee();
			System.out.println("Enter rate per hour and no. of hours worked separated by space.");
			System.out.println("Sample: 125.50 8" );
			partTimeEmployeeOne.setWage(sc.nextDouble(), sc.nextInt());
			partTimeEmployeeOne.setName(employee.getName());
			System.out.println("Name: " + partTimeEmployeeOne.getName());
			System.out.printf("Wage: " + "%.2f", partTimeEmployeeOne.getWage());
		}
		sc.close();
	}
}
