package RevisionInheritance;

import java.util.Scanner;

class Employee {
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
}

class Company extends Employee {
	protected long companyid = 11231232;
	String companyname = "Cao_Khanh";
	float wages_per_hour = 40;
	int no_of_weeks = 4;
	public float wagesCaculation(Employee employee)
	{
		return ( employee.total_duration * wages_per_hour * no_of_weeks);
	}
}



public class EmployeeWage {
	public static void main(String[] args) {
		Employee employee = new Employee();
        employee.inputEmployeeInfo();
		System.out.println("EmployeeId: "+ employee.employeeId);
		System.out.println("EmployeeName: "+employee.employeeName);
		Company company = new Company();
		float total=company.wagesCaculation(employee);
		System.out.println("Wage: "+total);
	}
}
