import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
        System.out.println("Enter the input number");
        int n = s.nextInt();
        int count = n;
        int fact=1;
        while(count!=0)
        {
            fact=fact*count;
            count--;
        }
        System.out.println("Factorial "+ fact);

    }
}
