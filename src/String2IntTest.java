/**
 * Created by toryang on 16/3/15.
 */

/**
 * 题目描述:
 * 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
 */
public class String2IntTest {
    public int StrToInt(String str) {
        if (str.length()==0 || str.equals("")){
            return 0;
        }
        char symble = str.charAt(0);
        int result = 0;
        if (symble >= '0' && symble <= '9'){
            result += symble - '0';
        }else if (!(symble == '-' || symble == '+')){
            return 0;
        }
        for (int i=1;i<str.length();i++){
            if (str.charAt(i)>='0' && str.charAt(i)<='9'){
                int value = str.charAt(i)-'0';
                result = result*10 + value;
            }else {
                return 0;
            }
        }

        return str.charAt(0)=='-'?-result:result;
    }

    public static void main(String[] args) {
        String2IntTest string2IntTest = new String2IntTest();
        System.out.println(string2IntTest.StrToInt("-1234567"));
    }

}
