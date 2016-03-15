/**
 * Created by toryang on 16/3/15.
 */

import java.util.Arrays;

/**
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。
 * 请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是重复的数字2或者3。
 */
public class Duplicate {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        duplication[0]=-1;
        if(length == 0){
            return false;
        }
        Arrays.sort(numbers);
        boolean flag = false;
        for (int i=0;i<length-1;i++){
            if (numbers[i] == numbers[i+1]){
                duplication[0] = numbers[i];
                flag = true;
                i++;
                return flag;

            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] value = {2,4,3,1,4};
        int[] duplication = new int[value.length/2];
        System.out.println(new Duplicate().duplicate(value,value.length,duplication));
    }
}
