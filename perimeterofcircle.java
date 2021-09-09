import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
 Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the radius:");
         
	 double r= s.nextDouble();
         
	 double  c=(22*2*r)/7 ;
      
	 System.out.println("Perimeter of Circle is: " +c);    
    }
}
