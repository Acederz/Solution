public class DominantIndex {
    /*
    至少是其他数字两倍的最大数
    在一个给定的数组nums中，总是存在一个最大元素 。

    查找数组中的最大元素是否至少是数组中每个其他数字的两倍。

    如果是，则返回最大元素的索引，否则返回-1。
     */
    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 0};
        if(nums==null || nums.length>50)
            System.out.println("-1");
        if(nums.length == 1)
            System.out.println("0");
        int max=0,second=0,index=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>max) {
                second = max;
                max = nums[i];
                index = i;
            } else {
                if (nums[i] > second)
                    second = nums[i];
            }
        }
        if(max >= second*2) {
            System.out.println(index);
        } else {
            System.out.println("-1");
        }
    }
}
