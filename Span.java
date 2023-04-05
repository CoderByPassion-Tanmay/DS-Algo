import java.io.*;
import java.util.*;
// import java.util.Integer.MAX_VALUE;

// Span of Array  
public class Span{

  public static void main(String[] args) throws Exception {
    // write your code here
    System.out.println("terrrr");
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int arr[] = new int[a];

    for(int i=0 ;i<arr.length;i++)
    {
    arr[i] = sc.nextInt();
    }
         findMaxMin(arr);
     // System.out.println("MAx ="+max);

       
  }
  public static void findMaxMin(int arr[]){
    int max = Integer.MIN_VALUE;
    int min =Integer.MAX_VALUE ;
    
   for(int i=0 ;i<arr.length;i++)
    {
    if (arr[i] > max)
    {
      max = arr[i];
    }
     if(arr[i] < min){
      min =arr[i];
    }
      
    }
System.out.println("max => "+max+"min => "+min);
    // return max;
  }
}