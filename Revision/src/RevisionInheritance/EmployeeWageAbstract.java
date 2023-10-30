package RevisionInheritance;

import java.util.Scanner;

abstract class EmployeeA {
	int employeeId;
	String employeeName;
	int total_duration;
	public void inputEmployeeInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter EmployeeId: ");
        employeeId = scanner.nextInt();

        System.out.print("Enter EmployeeName: ");
        scanner.nextLine();  // Consume the newline character
        employeeName = scanner.nextLine();

        System.out.print("Total duration: ");
        total_duration = scanner.nextInt();
    }
	public abstract float wagesCalculation();
}

class CompanyA extends EmployeeA {
	protected long companyid = 11231232;
	String companyname = "Cao_Khanh";
	float wages_per_hour = 40;
	int no_of_weeks = 4;
	@Override
	public float wagesCalculation()
	{
		return ( super.total_duration * wages_per_hour * no_of_weeks);
	}
}



public class EmployeeWageAbstract {
	public static void main(String[] args) {
		CompanyA company = new CompanyA();
        company.inputEmployeeInfo();
		System.out.println("EmployeeId: "+ company.employeeId);
		System.out.println("EmployeeName: "+company.employeeName);
		
		float total=company.wagesCalculation();
		System.out.println("Wage: "+total);
	}
}
