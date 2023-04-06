import java.io.*;
import java.util.*;

public class Reverse{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
public static void swap(int arr[],int i ,int j)
{
    int a =arr[i];
    arr[i]= arr[j];
    arr[j] = a;
    
}
  public static void reverse(int[] a){
    // write your code here
    int i=0;
    int j=a.length -1;
    while(i<j)
    {
       swap(a,i,j); 
      i++;
      j--;
    }
  }

public static void main(String[] args) throws Exception {
   

    // int n = Integer.parseInt(br.readLine());
Scanner sc = new Scanner(System.in);
  int n =sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = sc.nextInt();
    }

    reverse(a);
    display(a);
 }

}