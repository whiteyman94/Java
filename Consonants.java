public class Question4
{
	public static void main(String args[])
	{
	//Declare and initialise variables
	String s1=new String("halo");
	int vowels=0 , consonants=0;

	//Find out if word contains vowel
	for(int i=0;i<s1.length();i++)
	{
	char c=s1.charAt(i);
	if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')

	{
	vowels=vowels+1;

	}
    else
    {

    consonants=consonants+1;
    }

	}
	System.out.println("the number of consonants in the word halo are "+consonants);
	System.out.println("the number of consonants in the word halo are "+vowels);
	}
	}




