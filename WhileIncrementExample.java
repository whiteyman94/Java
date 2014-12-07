/* Algorithm
 *
 *1. declare the variables
 *2. start from the number 2
 *3. use a loop operation to get all the even numbers up to 100
 *4	. print these numbers each on the next line
 */
 public class Loop1
 {
 	public static void main(String args[])
 	{
 		//declare variables
 		int count=2;

 		//start the count
 		while (count<=100)
 		{
 		System.out.println("count is " + count);
 		count=count + 2;
 		}
 	}
 }
