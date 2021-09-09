import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
   int a,b;
    Scanner input  = new Scanner(System.in);
    a = input.nextInt();
    b = input.nextInt();
    if(a>b)
    {
    System.out.println(a+"is the largest");
    
    }
    else{
            System.out.println(b+"is the largest");
    }

    }
}
