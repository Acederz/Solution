import java.util.Arrays;

public class FindDiagonalOrder {
    /*
    对角线遍历
    给定一个含有 M x N 个元素的矩阵（M 行，N 列），请以对角线遍历的顺序返回这个矩阵中的所有元素，对角线遍历如下图所示。
     */
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        if (matrix.length==0||matrix[0].length==0)
            System.out.println("");
        int col=matrix.length;  //最大行
        int row=matrix[0].length; //最大列
        int nums=col*row;  //新数组容量
        int m=0,n=0;
        int res[]=new int[nums];
        boolean flag=true;
        for(int i=0;i<nums;i++){
            res[i]=matrix[m][n];
            if(flag){
                m-=1; n+=1;
            }else{
                m+=1; n-=1;
            }
            if(m>=col){
                n+=2; m-=1;
                flag=true;
            }else if(n>=row){
                m+=2; n-=1;
                flag=false;
            }
            if(m<0){
                m=0; flag=false;
            }else if(n<0){
                n=0; flag=true;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
