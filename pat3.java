
import java.util.*;
public class pat3 {
    public static void main(String args[]){
        int i,j;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int spaces=n;
        for(i=1;i<=n;i++){

            for(j=0;j<i;j++)
                System.out.print("*");
        
        
             for(j=0;j<2*spaces-2;j++)
                System.out.print(" ");
        
            //    for(j=0;j<spaces-1;j++)
            //     System.out.print(" ");
        

            for(j=0;j<i;j++)
                System.out.print("*");
        
        System.out.print(" ");

         System.out.println("");
         spaces--;
    }
}
 }

