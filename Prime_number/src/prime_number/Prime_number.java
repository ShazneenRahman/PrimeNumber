/*
 Check if an inputted number is a prime number or not
 */
package prime_number;
import java.util.Scanner;
public class Prime_number {

    public static void main(String[] args) {
       Scanner no = new Scanner(System.in);
       System.out.println("Input a number to check if it is prime or not: ");
       int num = no.nextInt();
       int half = num/2;
       int i, flag = 0;
       if(num==0||num==1)
       {
           System.out.println("This number is not a prime number");
       }
       else
       {
           for(i=2;i<=half;i++)
           {
               if(num%i==0)
               {
                   System.out.println("The number is not a prime number.");
                   flag=1;
                   break;
               }
               
           }
           if(flag==0)
           {
               System.out.println("This number is a prime number.");
           }
       }
    }
    
}
