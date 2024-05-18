public class binary_search {
        public static int Search(int numbers[],int key) {
            int start = 0 ; 
            int end = numbers.length - 1;
    
            while(start <= end){
                int mid = (start+end)/2;
    
                //comparison
                if(mid  == key){
                    return mid ; 
                }
                else if(numbers[mid] > key){
                    mid = mid +1 ;//right
                }
                else {
                    mid = mid -1; // left
                }
            
            }
            return -1;
        }
        public static void main(String[] args) {
            int [] numbers={5,6,7,111};
            int key = 111;
            System.out.println("The number  is : " + Search(numbers ,key));
        }
        
    }
    