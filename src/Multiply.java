/**
 * Created by toryang on 16/3/15.
 */

/**
 * 题目描述:
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 */
public class Multiply {

    public int[] multiply(int[] A) {
        int length = A.length;
        int[] B = new int[length];
        if (length == 0){
            return B;
        }

        int[] before = new int[length];
        int[] after = new int[length];
        before[0] = 1;
        after[0] = 1;
        for (int i=0;i<length;i++){
            if (i>0){
                before[i] = A[i-1]*before[i-1];
            }
            if (i<length-1){
                after[i+1] = after[i]*A[length-i-1];
            }
        }

        for (int i=0;i<length;i++)
            B[i] = before[i]*after[length-i-1];

        return B;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6};
        for (int i:new Multiply().multiply(A)){
            System.out.print(i+" ");
        }
    }
}
