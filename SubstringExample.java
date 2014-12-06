public class Question5
{
	public static void main(String args[])
	{
	//Declare and initialise variables
	String s=new String("albert");
	String s1= s+ " einstein";
	s.concat(s1);
	System.out.println(s1);


    String substring = s1.substring(2,6);
    String rep1=s1.replace('n', 'e');
    String substring1 = rep1.substring(8,10);




    //To use substring

    System.out.print(substring);
    System.out.println(substring1);


	}
}
