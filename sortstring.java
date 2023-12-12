import java.util.Scanner;
import java.util.*;

public class sortstring {
    
    public static void main(String args[]){
        int i;
        Scanner sc = new Scanner(System.in);
        String str[]=new String[4];
        System.out.println("Enter the Strings");
        for(i=0;i<4;i++){
           str[i]=sc.next(); 
        }
        Arrays.sort(str);
        System.out.println("the sorted Strings are:");
        for(i=0;i<4;i++){
           System.out.println(str[i]);
        }
    }
}