/**
 * Created by toryang on 16/3/15.
 */

import java.util.ArrayList;

/**
 * 题目描述:
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 *
 * 输出描述:
 * 如果当前字符流没有存在出现一次的字符，返回#字符。
 */
public class FirstApperanceOnce {
    ArrayList<Character> list = new ArrayList<Character>();
    int[] counts = new int[128];
    //Insert one char from stringstream
    public void Insert(char ch) {
        if(counts[(int)ch] ==0){
            list.add(ch);
        }else if(list.contains(ch)){
            list.remove((Character)ch);
        }
        counts[(int)ch] = counts[(int)ch]+1;


    }
    //return the first appearence once char in current stringstream
    public char firstAppearingOnce() {
        return list.isEmpty()?'#':list.get(0);
    }
}

