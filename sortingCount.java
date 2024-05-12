public class sortingCount {
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
             largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];//this is for +ve numbers that include 0 as+1
        //frequency count
        for(int  i = 0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i<=count.length;i++){
            while(count[i] > 0){
                arr[j] =i;
                j++;
                count[i]--;
            }
        }

    }
}

