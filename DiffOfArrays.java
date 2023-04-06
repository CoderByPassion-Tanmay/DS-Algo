import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc =new Scanner(System.in);
 int n1 = sc.nextInt();
    int arr1[] = new int[n1];
    
    for(int i=0 ;i<arr1.length;i++)
    {
        arr1[i] = sc.nextInt();
    }
    
 int n2 = sc.nextInt();
    int arr2[] = new int[n2];
    
    for(int i=0 ;i<arr2.length;i++)
    {
        arr2[i] = sc.nextInt();
    }
    
    int res[] = substraction(arr1,arr2);
    System.out.println("asn");
      for(int i=0 ;i<res.length;i++)
    {
       System.out.print(res[i] + " ");
    }
    
    
 }
 public static int[] substraction(int arr1[],int arr2[])
 {
     int i=arr1.length-1;
     int j=arr2.length-1;
     int k=arr2.length-1;
     int carry =0;
     int res[] = new int[arr2.length];
     while(i>= 0 && j>=0)
     {
         int ans = arr2[j] - arr1[i]- carry;
        //  int b =arr2[j];
        // System.out.print(ans);
        if(ans <0)
        {
            ans =ans+ 10;
            carry = 1;
        }
        res[k] =ans;
        
        i--;
        j--;
        k--;
         
     }
     while(j > -1){
         int c =arr2[j] - carry;
         if(c<0)
         {
             c=c+10;
             carry=1;
         }
     res[k] = c;
     j--;
     k--;
         
     }
     
     return res;
 }

}