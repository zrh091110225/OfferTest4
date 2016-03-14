/**
 * Created by toryang on 16/3/14.
 */

/**
 * 题目描述:
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class Sum {

    /**
     * 只能用递归的方法;
     * 当n==0的时候,不执行sum+=sum(n-1)),返回sum值为0;终止继续递归,当n>0的时候继续执行递归;
     * @param n
     * @return
     */
    public int sum(int n){
        int sum = n;
        boolean ans = (n>0)&&((sum+=sum(n-1))>0);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Sum().sum(100));
    }

}
