import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter values");
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int gcd = 1;
	    for(int i =1;i<=a&&i<=b;i++)
	    {
	        if(a%2==0&& b%2==0)
	        {
	            gcd = i;
	        }
	    }
	    System.out.println("gcd"+gcd);
    }
}
