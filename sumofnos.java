import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
        System.out.println("Enter the input number");
        int sum = 0;
        while(true)
        {
          int n = s.nextInt();
          sum = sum + n;
          if(n==0)
          {
              System.out.println("Sum of all numbers " + sum);
              break;
          }
          
        }

    }
}
