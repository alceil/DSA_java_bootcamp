import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
 Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the area of base:");
         double base=s.nextDouble();
         System.out.println("Enter the height:");
         double height=s.nextDouble();
         
 
          
          double  area=base*height ;
      System.out.println("Volume Of Prism is: " + area);  
    }
}
