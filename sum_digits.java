
    import java.util.Scanner;

    public class sum_digits {
        public static int sumOfDigits(int n){
        int sum=0;
        int r;
        while(n>0){
            r=n%10;
            sum = (Integer)sum +r ;  //Type casting is used to add the remainder
            n=n/10;
        }
        return sum;
    
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number:");
            int n= sc.nextInt();
            int sum = sumOfDigits(n);
            System.out.println("The sum of the digits of " + n + " is " + sum);
        }
    }
       

