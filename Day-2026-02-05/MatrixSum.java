public class MatrixSum {
    public static void main(String[] args){
        int[][] mat = {{1,2},{3,4}};
        int sum=0;
        for(int i=0;i<mat.length;i++)
            for(int j=0;j<mat[0].length;j++)
                sum+=mat[i][j];
        System.out.println("Sum: "+sum);
    }
}