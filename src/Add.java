/**
 * Created by toryang on 16/3/14.
 */

/**
 * 题目描述:
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class Add {

    public int add(int num1,int num2) {
        int Sum, Carry;
        do
        {
            Sum = num2 ^ num1;
            Carry = (num1 & num2) << 1;
            num2 = Carry;
            num1 = Sum;
        } while (num2 != 0);

        return num1;
    }
}
