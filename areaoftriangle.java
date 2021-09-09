import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner input  = new Scanner(System.in);
    System.out.println("Enter the breadth of the triangle");
    double b = input.nextDouble();
    System.out.println("Enter the height of the triangle");
    double h = input.nextDouble();
    System.out.println("area of triangele "+ .5*b*h);
    }
}
