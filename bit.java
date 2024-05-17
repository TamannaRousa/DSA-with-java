public class bit {
        public static void main(String[] args) {
            System.out.println(16&3);
            System.out.println(5|6);
            System.out.println(5^6);//XOR diff bit ->1 sa,e->0
            System.out.println(~5);// it is giving -6 as msb changes to 1 by adding one(to check which -ve no formed then find 2's compl  hence +ve to -ve) but the answer shoukd be 3 ,,,,binary 1's complement [~] not of 6
            //MSB=0 Number +ve MSB=1 Number -ve
            System.out.println(~0);//-1 not 1 -->>>> 000000+1  MSB tells the no is + or -
            System.out.println(16<<2);//<< binary left shift  mmumber will shift to left by 2 spaces and empty space will be 0 16*2^2 = 16*4=64
            System.out.println(6>>1);//move to right empty by 0 and remove one got out [6/2^1 = 3]
            //ODD number-->LSB = 1 , EVEN Number ---> LSB = 0
            //AND number with 1 gives LSB 1 /0 easily find even and out
        }
}
