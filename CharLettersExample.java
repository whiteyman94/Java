public class Question6
{
	public static void main(String args[])
	{
	//Declare and initialise variables
	String s1=new String ("I drink tea");
	char letter = '\u0000';

	//Print out each word on a separate line
	   for(int i = 0; i<s1.length(); i++)
        {

            letter = s1.charAt(i);
            if(letter==' ')
            {
                System.out.println();
            }
            else
            {
                System.out.print(letter);
            }

        }
        System.out.println();
	}
}
