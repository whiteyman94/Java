public class AbstractDemo{
	public static void main(String args[]){
		Salary s = new Salary("Mohn Mohtashim", "Dubling Ireland",3,3600.00);
		Employee e = new Salary("George W.", "Houston, TX", 43, 5000.00);

		System.out.println("Call mailCheck using Salary reference--");
		s.mailCheck();

		System.out.println("\n Call mailCheck using Employee reference--");
		e.mailCheck();
	}	
}
