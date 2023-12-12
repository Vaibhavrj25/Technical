import java.util.Scanner;
public class fibseries {
    public static void main(String args[]){
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int fib1=0,fib2=1,fib3;
        System.out.print("The fibonacci series is:"+fib1+" "+fib2);
        for(int i=1;i<n;i++)
        {
            fib3=fib1+fib2;
            fib1=fib2;
            fib2=fib3;
            System.out.print(" "+fib3);
        }
        
    }
}
