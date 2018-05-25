import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sherlock {

    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        
         int k = in.nextInt();
        
        for(int i=0; i<k; i++){
            
            int n = in.nextInt();
            
            int[] arr = new int[n];
            
            for(int j=0; j<n; j++){
                
                arr[j] = in.nextInt();
            }
            System.out.println(decision(arr));
        }
    }
    
    public static String decision(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        
        
        int curr = 0;
        for(int j=0; j<arr.length; j++){
        
            if(curr == sum - arr[j]-curr){
                return "YES";
            }
            curr += arr[j];
        }
         return "NO";
    }
}