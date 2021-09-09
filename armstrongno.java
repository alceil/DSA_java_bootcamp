import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter the  number");
       int n=s.nextInt();
       int num=n;
       int r,sum =0;
       while(num!=0)
       {
           r=num % 10;
           sum = sum +r*r*r;
           num=num/10;
           
       }
       if(sum==n)
       {
            System.out.println("It is armstrong"); 
       }else{
             System.out.println("It is not armstrong");  
       }
     
    }
}
