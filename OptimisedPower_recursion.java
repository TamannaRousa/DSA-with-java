public class OptimisedPower_recursion {
    public static int optimisedPower(int a, int n) {
        if(n==0){
         return 1;
        } 
 
     //int halfPowerSq = optimisedPower(a, n/2) * optimisedPower(a, n/2);//even --> two times func call hence O(n)
       int halfPower = optimisedPower(a, n/2);// here func called only once hence TC reduces to O(log n)
       int halfPowerSq = halfPower * halfPower;
 
        //odd
        if(n % 2 !=0){
         halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
     }
}
