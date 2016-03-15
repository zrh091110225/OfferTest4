/**
 * Created by toryang on 16/3/15.
 */

/**
 * 题目描述:
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class DeleteDuplication {

    public Node delete(Node pHead){
        if (pHead == null)
            return null;
        Node node = new Node(0);
        node.next = pHead;
        Node pre = node;
        Node p = pHead;
        while (p!= null && p.next != null){
            if (p.no == p.next.no){
                int temp = p.no;
                while (p != null &&p.no == temp){
                    p = p.next;
                }
                pre.next = p;
            }else {
                pre = p;
                p = p.next;
            }
        }
        return node.next;

    }
}
