 public class arrayPairs {
        public static void pairs(int numbers[]) {
            int totalPairs = 0;
            int n = numbers.length;
    
            for(int i = 0 ; i< n;i++){
                int curr = numbers[i];
                for(int j=i+1 ; j<n;j++){
                    System.out.print("(" + i + "," + numbers[j] + ")");
                    totalPairs ++;
                }
                System.out.println();
            }
            System.out.println("total pairs : " +totalPairs);
            
        }
        public static void main(String[] args) {
            int numbers[] = {5,3,2,1,6,4};
            pairs(numbers); 
    
        }
    }
    

