public class Eg
{
	public static void main(String arg[])
	{
	//declare and initialise variables
	int num=55687;
	int num1=num;
	int digit=0;
	int count=0;

    // while loop statement
    while(num1>9)
    {

    digit=num1%10;
    num1=num1/10;
    System.out.println(digit);
    count++ ;
    }
    System.out.println(num1);
	}
}
