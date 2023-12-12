import java.util.Scanner;

public class pat5 {
    
    public static void main(String args[]){
        int i,j;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int s=n;
        for(i=1;i<=n;i++){
            for(j=1;j<=s;j++){
                System.out.print("*");
            }
             for(j=1;j<=i*2-2;j++){
                System.out.print(" ");
            }
           
             for(j=1;j<=s;j++){
                System.out.print("*");
            }
            System.out.println(" ");
            s--;
        }
        s=n;
         for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
             for(j=1;j<=(n-i)*2;j++){
                System.out.print(" ");
            }

           
             for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
            s--;
        }
    
}
}
