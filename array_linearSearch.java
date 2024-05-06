public class array_linearSearch {
        public static int LinearSearch(int numbers[] , int key) {
           
            for(int i= 0 ; i< numbers.length;i++){
                if (numbers[i] == key){
                    return i;
                }
            }
            return -1;
        }
    
        public  static void main(String[] args) {
            int numbers[] = {11,2,323,10,111,1,19};
            int key = 111;
            int index = LinearSearch(numbers,key);
            
            if(index != -1){
                System.out.println("Number is found at Index : " + index);
            }
            else{
                System.out.println("Number is not Found");
            }        
    }
}

