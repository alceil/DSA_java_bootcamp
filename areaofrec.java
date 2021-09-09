import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner input  = new Scanner(System.in);
    System.out.println("Enter the length of the rectangle");
    double l = input.nextDouble();
    System.out.println("Enter the breadth of the rectangle");
    double b = input.nextDouble();
    System.out.println("area of rectangle "+l*b);
    }
}
