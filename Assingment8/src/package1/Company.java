package package1;

class Employee{
	int empId;
	String name;
	Employee(int empId,String name){
		this.empId = empId;
		this.name = name;
	}
}

class Manager extends Employee{
	int salary;
	Manager(int empId,String name,int salary){
		super(empId,name);
		this.salary = salary;
	}
}

class SalesManager extends Manager{
	int commission;
	SalesManager(int empId,String name,int salary,int commission){
		super(empId,name,salary);
		this.commission = commission;
	}
	
}

public class Company {
	public static void main(String[] args) {
		SalesManager sm = new SalesManager(1,"arjun",500000,10000); 
		System.out.println("Emp ID :"+sm.empId);
		System.out.println("Emp Name :"+sm.name);
		System.out.println("Emp Salary :"+sm.salary);
		System.out.println("Emp Commission :"+sm.commission);
		
	}
}
