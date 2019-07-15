import java.util.ArrayList;
import java.util.List;

public class Generate {
    /*
    杨辉三角
    给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
     */
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            System.out.println(triangle);
        }

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for(int row=1; row<numRows; row++) {
            List<Integer> list = new ArrayList<>();
            List<Integer> pre = triangle.get(row-1);
            list.add(1);
            for(int i=1; i<row; i++) {
                list.add(pre.get(i)+pre.get(i-1));
            }
            list.add(1);
            triangle.add(list);
        }
        System.out.println(triangle);
    }
}
