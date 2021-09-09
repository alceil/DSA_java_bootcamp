import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
   double r;
    Scanner input  = new Scanner(System.in);
    System.out.println("Enter the radius of the circle");
    r = input.nextDouble();
    System.out.println("area of circle "+(22*r*r)/7);
    }
}
