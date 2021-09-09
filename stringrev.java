import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter a String");
       String n=s.nextLine();
       int l = n.length();
       for(int i = l-1;i>=0;i--)
       {
           System.out.print(n.charAt(i));
       }
     
    }
}
