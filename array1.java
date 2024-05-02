public class array1 {
    public static void update(int marks[]) { // defining an array in a function arguement
        for(int i =0;i<marks.length;i++){
            marks[i] = marks[i] +1;
        }
        
    }
    public static void main(String[] args) {
        int marks[] = {98,93,92,91,77};
        update(marks);

        //printing updated marks
        for( int i =0;i<marks.length;i++){
            System.out.println(marks[i] + " ");
        }
        System.out.println();
    }
    
}
