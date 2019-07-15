import java.util.Arrays;

public class PlusOne {
    /*
    加一
    给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

    最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。

    你可以假设除了整数 0 之外，这个整数不会以零开头。
     */
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        Boolean flg = true;
        for(int i = digits.length-1; i>=0; i--) {
            digits[i]++;
            digits[i] = digits[i]%10;
            if(digits[i] !=0) {
                flg = false;
                System.out.println(Arrays.toString(digits));
                break;
            }
        }
        if(flg) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
            System.out.println(Arrays.toString(digits));
        }
    }
}
