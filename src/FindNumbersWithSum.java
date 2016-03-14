import java.util.ArrayList;

/**
 * Created by toryang on 16/3/14.
 */

/**
 * 题目描述:
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
 *
 * 输出描述:
 * 值小的那个先输出
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> findNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (array.length == 0){
            return list;
        }
        int start=0, end=array.length-1;
        int temp = Integer.MAX_VALUE;

        while (start < end){
            if (array[start] + array[end] == sum){
                if (temp > array[start]*array[end]){
                    list.clear();
                    list.add(array[start]);
                    list.add(array[end]);
                    temp = array[start]*array[end];
                }
                start++;
                end--;
            }else if (array[start] + array[end]  < sum){
                start++;
            }else {
                end--;
            }

        }
        return list;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        for (int i : new FindNumbersWithSum().findNumbersWithSum(array,10))
            System.out.println(i);
    }
}
