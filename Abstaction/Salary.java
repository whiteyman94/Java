public class Salary extends Employee{
	private double salary;
	public Salary(String name, String address, int number, double salary){
		super(name,address,number);
		setSalary(salary);
	}
	public void mailCheck(){
		System.out.println("Within mailCheck of salary class");
		System.out.println("Mailing check to " + getName() + " with slaray " + salary);
	}
	public double getSalary(){
		return salary;
	}
	public void setSalary(double newSalary){
		if(newSalary >= 0.0){
			salary = newSalary;
		}
	}
	public double computePay(){
		System.out.println("Computing slaray pay for " + getName());
		return salary/52;
	}
}
