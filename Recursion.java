public class Recursion {
    public static void printBinStrings(int n, String str, int lastPlace ) {
        //base case
        if(n==0){//end of string
            System.out.println(str);  
            return;
        }
        //main
        printBinStrings(n-1, str+"0", 0);//0 can append anywhere so no condition for 0 and lastplace become 0 on putting 0 for next one
        if(lastPlace == 0){
            printBinStrings(n-1, str+"1", 1);
        }
    }
        public static void main(String[] args) {
            printBinStrings(3, "", 0);
            
        }
    }
