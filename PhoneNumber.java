import java.util.Scanner;
   public class ExamExample
   {
     public static void main( String [] args )
     {
        String number, inter, op, remaining; // Create Strings
        Scanner scan = new Scanner( System.in ); // Create a scanner
        System.out.print( "Enter an Irish mobile phone number > " );
        number = scan.nextLine(); // Read in number
        while(number.length()!= 12) // Check if number is not of length 12
        {
         System.out.print( "Enter an Irish mobile phone number > " );
         number = scan.nextLine();
        }
        System.out.println("You entered " + number);
        inter = number.substring(0,3);
        System.out.println("The international code is " + inter);
        op = number.substring(3,5);
        System.out.println("The operator code is " + op);
        remaining = number.substring(5);
        System.out.println("The number is " + remaining );
        System.out.println("The complete number is (" + inter + ") " + op + " " + remaining);
     }
   }
