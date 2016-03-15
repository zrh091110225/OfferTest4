/**
 * Created by toryang on 16/3/15.
 */

import java.util.ArrayList;

/**
 * 题目描述:
 * 一个链表中包含环，请找出该链表的环的入口结点。
 */
public class EnteryOfLoop {

    /**
     * 方法一:
     * 使用两个相邻的指针,断开每次的之前的节点,当前面的指针指向null时,后面的指针即为环的入口结点;
     * @param pHead
     * @return
     */
    public Node EntryNodeOfLoop(Node pHead) {
        if(pHead.next == null){
            return null;
        }
        Node front = pHead.next;
        Node behind = pHead;
        while (front != null){
            behind.next = null;
            behind = front;
            front = front.next;
        }
        return behind;
    }

    /**
     * list,遍历链表,将每个Node都存入List,如果list中存在Node,则该节点为环中的入口;
     * @param pHead
     * @return
     */
    public Node solutionWithList(Node pHead){
        ArrayList <Node> list=new ArrayList<Node>();
        list.add(pHead);
        Node curnode=pHead.next;
        if(curnode==null){
            return null;
        }
        while(!list.contains(curnode)){
            list.add(curnode);
            curnode=curnode.next;
        }
        return curnode;
    }
}

