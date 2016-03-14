/**
 * Created by toryang on 16/3/14.
 */

/**
 * 题目描述:
 * 每年六一儿童节,NowCoder都会准备一些小礼物去看望孤儿院的小朋友,今年亦是如此。
 * HF作为NowCoder的资深元老,自然也准备了一些小游戏。其中,有个游戏是这样的:
 * 首先,让小朋友们围成一个大圈。
 * 然后,他随机指定一个数m,让编号为0的小朋友开始报数。
 * 每次喊到m的那个小朋友要出列唱首歌,然后可以在礼品箱中任意的挑选礼物,并且不再回到圈中,
 * 从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友,可以不用表演,
 * 并且拿到NowCoder名贵的“名侦探柯南”典藏版(名额有限哦!!^_^)。请你试着想下,哪个小朋友会得到这份礼品呢？
 *
 */
public class LastRemaining {
    /**
     * 解法一:
     * 使用链表的方法,定义一个循环链表;
     * @param n
     * @param m
     * @return
     */
    public int LastRemaining_Solution(int n, int m) {
        Node header = new Node(0);
        Node pointer = header;
        for (int i=1;i<n;i++){
            pointer.next = new Node(i);
            pointer = pointer.next;
        }
        pointer.next = header;
        while (pointer != pointer.next){
            for (int i=0;i<m-1;i++){
                pointer = pointer.next;
            }
            pointer.next = pointer.next.next;
        }
        return pointer.next.no;
    }

    public static void main(String[] args) {
        System.out.println(new LastRemaining().LastRemaining_Solution(5,2));
    }
}
