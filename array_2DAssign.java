
public class array_2DAssign {
    public static void numbers(int matrix[][]) {
        int count =0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==7){
                    count++;
                }
            }
         }
        System.out.println(count);   
    }

    public static void sumOfSecond(int[][] matrix) {
        int sum=0;
        for(int i=0;i<matrix[0].length;i++){
            sum+=matrix[1][i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
       int matrix[][] ={{1,4,8},
                        {11,4,3},
                        {2,2,3}};
        sumOfSecond(matrix);
    }
}