package oop.design;

public  class EmployeeInfo extends EmployeeAbstract implements Employee {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to CnnEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName = "Microsoft Corporation";
	private String name, location,department,position;
	private double salary,bonus;
	private int employeeId;
	private static final double FEDERAL_TAX_WITHHOLDING_RATE = 0.20;
	private static final double STATE_TAX_WITHHOLDING_RATE = 0.09;

	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(){
		this.name = "";
		this.salary = 0.0;
		this.employeeId = 0;

		}
	public EmployeeInfo(int employeeId){
		this.employeeId = employeeId;

	}
    public EmployeeInfo(String name, int employeeId){
    	this.name = name;
		this.employeeId = employeeId;

		}
	public EmployeeInfo(String name, int employeeId, double salary) {
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static double calculateEmployeBonus(double salary ,String performance){
		double bonus=0.0;

		switch (performance)
		{
			case (" Outstanding "):
				if (salary >= 30000 && salary <= 60000){
					bonus = salary*0.1;
					return bonus;
				}else if (salary >60000 && salary <= 90000 ) {
					bonus = salary * 0.08;
					return bonus;
				}else if (salary >90000 ) {
					bonus = salary * 0.07;
					return bonus;
				}
				//("Outstanding");
				break;
			case ("Exceeds Expectations"):
				if (salary >= 30000 && salary <= 60000){
					bonus = salary*0.1;
					return bonus;
			}
				else if (salary >60000 && salary <= 90000 ){
					bonus = salary*0.07;
				return bonus;
				}
				else if (salary >90000 ){
					bonus = salary*0.06;
					return bonus;}
			//("Exceeds Expectations");
				break;
			case ("Meets Expectations"):
				if (salary >= 30000 && salary <= 60000){
					bonus = salary*0.9;
					return bonus;}
				else if (salary >60000 && salary <= 90000 ){
					bonus = salary*0.05;
					return bonus;}
				else if (salary >90000 ){
					bonus = salary*0.04;
					return bonus;}
				//("Meets Expectations");
				break;
			case ("Needs Improvement"):
				if (salary >= 30000 && salary <= 60000){
					bonus = salary*0.8;
					return bonus;}
				else if (salary >60000 && salary <= 90000 ){
					bonus = salary*0.04;
					return bonus;}
				else if (salary >90000 ){
					bonus = salary*0.04;
					return bonus;}
				//("Needs Improvement");
				break;
			case("Does Not Meet Expectations "):
				bonus = salary;
				return bonus;
				// ("Does Not Meet Expectations ");


		}
		return bonus;
	}

	public void setEmployeeBonus(double bonus){
		this.bonus = bonus;
	}




	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static double calculateEmployePension(double salary, int yearsInTheCompany){
		 double pension=0;
		if (yearsInTheCompany <= 2)
			pension = salary*0.05 - (FEDERAL_TAX_WITHHOLDING_RATE*salary + STATE_TAX_WITHHOLDING_RATE*salary);
		if (yearsInTheCompany >=2 && yearsInTheCompany <=8)
			pension = salary*0.15- (FEDERAL_TAX_WITHHOLDING_RATE*salary + STATE_TAX_WITHHOLDING_RATE*salary);
		if (yearsInTheCompany > 8 )
			pension = salary*0.8 - (FEDERAL_TAX_WITHHOLDING_RATE*salary + STATE_TAX_WITHHOLDING_RATE*salary);

		return pension;
	}
	public void setEmployeeID(){
		this.employeeId = 100;
		employeeId ++;
	}
	public int employeeId(){
		 return employeeId;
	}
	public void setEmployeeName(String name) {
		this.name = name;
	}

	public String employeeName(){
		return name;
	}
	public void assignDepartment(String department){
		this.department = department;
	}
	public String getDepartment(){
		return department;
	}
	public double calculateSalary(double salary, double bonus){
		salary += bonus;
		return salary;
	}
	public void benefitLayout(){

	}
	public void setEmployeeLocation(String location){
		this.location = location;

	}
	public String getEmployeeLocation(){
		return location;
	}
	public void setEmployeePosition(String position){
		this.position = position;
	}
	public String getEmployeePosition(){
		return position;
	}


}
