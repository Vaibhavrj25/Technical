import java.util.Scanner;

public class lrotateD {
    public static void main(String args[]){
        int i,j,d;
        Scanner sc = new Scanner(System.in);
      System.out.println("enter the number:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the array:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the no of shifts:");   
    d=sc.nextInt();
    d=d%n;
    for(int k=0;k<d;k++){
    int v=a[0];
    for(i=1;i<n;i++){
        a[i-1]=a[i];
    }
    a[n-1]=v;
  
}
System.out.println("the left shifted array:");
for(i=0;i<n;i++){
   System.out.print(a[i]+" ");
    }
}
}
