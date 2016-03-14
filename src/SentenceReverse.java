/**
 * Created by toryang on 16/3/14.
 */

import java.util.ArrayList;

/**
 * 题目描述:
 * 牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
 * 同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。例如，“student. a am I”。
 * 后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。
 * Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 *
 */
public class SentenceReverse {

    /**
     * 解题思路:
     * 解题分为两步，
     * 第一步：反转整个句子；
     * 第二步，按照空格，反转单词；
     */
    LeftRotate leftRotate = new LeftRotate();

    public String ReverseSentence(String str) {

        char[] chars = str.toCharArray();
        leftRotate.reverseString(chars,0,chars.length-1);
        System.out.println(String.valueOf(chars));
        int last = 0;
        for (int i=0;i<chars.length;i++){
            if (chars[i]==' ') {
                leftRotate.reverseString(chars,last,i-1);
                last = i+1;
            }
            if (i == chars.length-1){
                leftRotate.reverseString(chars,last,i);
            }
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println(new SentenceReverse().ReverseSentence("Wonderful"));
    }

}
