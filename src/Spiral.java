import java.util.ArrayList;
import java.util.List;

class Spiral {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int spiral = 1;
        int top =0,bottom = matrix.length-1,left = 0,right = matrix[0].length-1;
        for(int k=1;k<=2*matrix.length-1;k++){
//            int top =0,bottom = matrix.length-1,left = 0,right = matrix[0].length-1;
            if(spiral ==1){
                for(int i=left;i<=right;i++){
                    list.add(matrix[top][i]);
                }
                top++;
                spiral = 2;
            }
            if(spiral ==2){
                for(int i=top;i<=bottom;i++){
                    list.add(matrix[i][right]);
                }
                right--;
                spiral = 3;
            }
            if(spiral ==3){
                for(int i=right;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
                spiral = 4;
                bottom--;
            }
            if(spiral ==4){
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                spiral = 1;
                left++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
//        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int matrix [][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
}