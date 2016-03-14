/**
 * Created by toryang on 16/3/14.
 */

/**
 * 题目描述:
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 */
public class LeftRotate {
    public String LeftRotateString(String str,int n) {
        if (str.length()<=0){
            return "";
        }


        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i=0;i<n;i++){
            sb.append(chars[i]);
        }
        for (int i=n ; i<chars.length ; i++){
            sb2.append(chars[i]);
        }
        sb2.append(sb);
        return sb2.toString();
    }

    /**
     * 解题思路:
     * 举例:abcXYZdef
     * 先将字符串分割成两部分,abc和XYZdef.
     * 分别将abc和XYZdef反转得到字符串"cbafedZYX",再将所得到的字符串整体反转得到XYZdefabc;
     * @param str
     * @param n
     * @return
     */
    public String leftRoate(String str ,int n){
        if (str.length()<=0){
            return "";
        }

        char[] chars = str.toCharArray();
        reverseString(chars,0,n-1);
        reverseString(chars,n,chars.length-1);
        reverseString(chars,0,chars.length-1);
        return String.valueOf(chars);

    }

    public void reverseString(char[] str,int from,int to){
        while (from <= to){
            char t = str[from];
            str[from] = str[to];
            str[to] = t;
            from++;
            to--;
        }

    }


    public static void main(String[] args) {
        String s="abcXYZdef";
        System.out.println(new LeftRotate().leftRoate(s,3));
    }
}
