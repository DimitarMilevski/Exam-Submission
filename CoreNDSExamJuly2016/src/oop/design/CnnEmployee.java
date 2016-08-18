package oop.design;

import java.util.Scanner;

public class CnnEmployee {

	/**
	 * CnnEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 * <p>
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 **/
	public static void main(String[] args) {

		EmployeeInfo employee = new EmployeeInfo ();
		Scanner input = new Scanner(System.in);


		//employee1.setEmployeeID();

		System.out.print("What is your name: ");
		String name = input.nextLine();

		System.out.print("Are you currently employed by " + employee.companyName + " (yes / no) ? ");
		String in = input.nextLine();

		if (in.matches("yes") || in.matches("YES")) {
			System.out.print("What is your employee ID ? ");
			int id = input.nextInt();


			System.out.print("What is your salary ? ");
			double salary = input.nextDouble();

			System.out.println("What is your work performance for the last year: Outstanding,Exceeds Expectations,\n " +
					" Meets Expectations , Needs Improvement or Does Not Meet Expectations ?");
			Scanner key = new Scanner(System.in);
			String performance = key.nextLine();
			System.out.println("Your bonus is : " + performance);
			double bonus = employee.calculateEmployeBonus(salary, performance.toLowerCase());
			System.out.println("Your bonus is : " + bonus);
			employee.setEmployeeBonus(bonus);

			double finalSalary = employee.calculateSalary(salary, bonus);
			employee.calculateSalary(finalSalary,bonus);

			EmployeeInfo employee1 = new EmployeeInfo(name, id,finalSalary );

			System.out.println (employee1.employeeName() +","+ employee1.employeeId()+", "+ finalSalary);
		}
//		if (in == "no" || in == "NO")
//			employee.setEmployeeID();
//		System.out.println("Your employee id is; " + employee.employeeId());


		String location = input.nextLine();
		employee.setEmployeeLocation(location);


		System.out.print("What is the possition you are applying for. \nAvailable possitions are "
				+ " CEO, Tester, Developer, and BA : ");
		String pos = input.nextLine();

		employee.setEmployeePosition(pos);
//		try {
//			System.out.println("Desired starting salary: ");
//			double salary = input.nextDouble();
//			employee1.setEmployeeSalary(salary);
//		} catch (Exception ex) {
//			System.out.println("You vahe to enter numerical sumbols for desired salary");
//		}
//		System.out.println("Name:" + employee1.getEmployeeName()
//				+ ", Location: " + employee1.getEmployeeLocation()
//				+", Applying for: " + employee1.getEmployeePosition()
//				+", Desired salary " + employee1.calculateSalary());
//
//		System.out.println(employee1.employeeDuties(pos));
//		System.out.println("Your employee ID will be: " + employee1.getEmployeeID());

		System.out.print("If you sign a contract for 5 years we will raise you salary by 10% each year"
				+ " Yes/No : ");

		String answer;
		Scanner y = new Scanner(System.in);
		answer = y.nextLine();


//		if (new String(answer).equals("yes") || new String(answer).equals("Yes")){
//
//			System.out.println("Your salary for the " + 1 + " year will be "
//					+ employee1.calculateSalary());
//			for (int i = 2 ; i<= 5 ; i++){
//				System.out.println("Your salary for the " + i + " year will be "
//						+ employee1.raiseSalary(10));
//			}
//		}
//		else System.out.println("5 year contract not accepted!");
//
//		System.out.println("Your application was accepted!");

	}

}
