import java.util.*;
public class array_largestnumber{
    public static int LargestNumber(int numbers[]) {
         int largest = Integer.MIN_VALUE; // - infinity
         int smallest = Integer.MAX_VALUE; //   + infinity

         for(int i = 0; i<numbers.length ; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
         }
         System.out.println(smallest);
         return largest;

        
    }
    public static void main(String[] args) {
        int numbers[] = { 12,33,42,54,33,111,11};
        System.out.print("The largest number is: " +LargestNumber(numbers));
    }
}
