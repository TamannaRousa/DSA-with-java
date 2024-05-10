import java.util.*;
public class array_subarray {
    public static void printSubarrays(int num[]) {
        int n = num.length;
        for( int i =0;i<n;i++){
            int start = i;
            for(int j=i;j<n;j++){
                int end = j;
                 for(int k = start ; k<=end;k++){
                    
                    System.out.print(num[k]+" ");
                 }
                 System.out.println();

            }
           
            System.out.println();
            
        }

        
    }
    public static void main(String[] args) {
        int num[] = { 1,2,3,4};
        System.out.println("All possible sub-arrays are:");
        printSubarrays(num);
    }
    
}

