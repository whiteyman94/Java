
/**
 * Write a description of class Egg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Egg
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("How many eggs do u have> ");
        int eggs=input.nextInt(); 
        int gross=144;int group=12;
        int count1=0;int count2=0;int count=eggs;
        while(eggs!=0)
        {
            count1=eggs/gross;
            eggs=eggs%gross;
            System.out.print(count1+" gross(s)");
          if(eggs!=0)
          {
              count2=eggs/group;
              eggs=eggs%group;
              System.out.print(count2+" group(s) ");
          }
         if(eggs!=0)
         {
             System.out.print(eggs+" single eggs(s)");
          }
        }
        
    }
  
}
