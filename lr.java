import java.util.Scanner;

public class lr {
     public static void main(String args[]){
        int i,j;
        Scanner sc = new Scanner(System.in);
      System.out.println("enter the number:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int d;
        d=sc.nextInt();
        d=d%n;
        int temp[]=new int[d];
        for(i=0;i<d;i++){
           temp[i]=a[i];
        }
         for(i=d;i<n;i++){
           a[i-d]=a[i];
        }
          for(i=n-d;i<n;i++){
            a[i]=temp[i-(n-d)];
        }
        System.out.println("array");
          for(i=0;i<n;i++){
             System.out.print(a[i]+" ");
        }
        

    }

}
