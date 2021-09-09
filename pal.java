import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter a number");
       int n=s.nextInt();
       int rev=0;
       int num = n;
       while(num!=0)
       {
           int r = num % 10;
           rev=rev*10 + r;
           num=num/10;
       }
       System.out.println(rev);
       if(n==rev)
       {
           System.out.println("its a pallindrome");
       }else{
           System.out.println("it is not a pallindrome");
       }
    }
}
