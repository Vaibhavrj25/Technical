import java.util.Scanner;
public class patter1 {
    public static void main(String args[]) {
        
    
    System.out.println("Enter the number:");
    Scanner sc = new Scanner(System.in);
   int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=i;j<=n;j++){
        System.out.print("v");
     }
     System.out.println("");
    }
}
}