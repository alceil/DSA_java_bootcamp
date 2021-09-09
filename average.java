import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter number of terms");
       int n=s.nextInt();
       int sum = 0;
       for(int i=1;i<=n;i++)
       {
           sum = sum + i;
       }
       System.out.println("Average: "+ sum/n);
    }
}
