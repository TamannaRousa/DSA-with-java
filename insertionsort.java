public class insertionsort {
        public static void bubble(int arr[]) {
            for(int i=0;i<arr.length;i++){
                int swap=0;
                for(int j=0;j<arr.length - i-1;j++){
                    if(arr[j]<arr[j+1]){
                       int temp = arr[j];
                       arr[j]=arr[j+1];
                       arr[j+1]=arr[j];
                       swap++;
                    }
                }
                    System.out.print(swap+" ");  
                }
            }
}
