import java.io.*;
import java.util.*;

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
        int max = findMax(arr);
     System.out.println("MAx ="+max);

       
  }
  public static int findMax(int arr[]){
    int max = 0;
   for(int i=0 ;i<arr.length;i++)
    {
    if (arr[i] > max)
    {
      max = arr[i];
    }
      
    }

    return max;
  }
}