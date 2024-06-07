package com.yct.algorithm.linkedlist;

/**
 * 单链表
 *
 * @author yangChengTao
 * @date 2024-06-07 10:56:49
 */
public class SimpleLinketListNode {

    public Object val;

    public SimpleLinketListNode next;

    public static SimpleLinketListNode init(Object[] data) {
        if (data == null || data.length == 0) {
            return null;
        }

        SimpleLinketListNode head = new SimpleLinketListNode(data[0]);
        SimpleLinketListNode cur = head;
        for (int i = 1; i < data.length; i++) {
            cur.next = new SimpleLinketListNode(data[i]);
            cur = cur.next;
        }
        return head;
    }

    public static SimpleLinketListNode get(SimpleLinketListNode nodeList, Object data) throws Exception {
        if (nodeList == null) {
            throw new Exception("node list is empty");
        }

        for (SimpleLinketListNode p = nodeList; p != null; p = p.next) {
            if (p.val.equals(data)) {
                return p;
            }
        }
        return null;
    }

    public static SimpleLinketListNode insertHead(SimpleLinketListNode nodeList, Object data) throws Exception {
        if (nodeList == null) {
            throw new Exception("node list is empty");
        }

        SimpleLinketListNode head = new SimpleLinketListNode(data);
        head.next = nodeList;
        return head;
    }

    public static SimpleLinketListNode insertLast(SimpleLinketListNode nodeList, Object data) throws Exception {
        if (nodeList == null) {
            throw new Exception("node list is empty");
        }

        SimpleLinketListNode node = new SimpleLinketListNode(data);
        for (SimpleLinketListNode p = nodeList; ; p = p.next) {
            if (p.next == null) {
                // last node
                p.next = node;
                break;
            }
        }

        return nodeList;
    }


    public SimpleLinketListNode(Object val) {
        this.val = val;
    }

    public Object getVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }

    public SimpleLinketListNode getNext() {
        return next;
    }

    public void setNext(SimpleLinketListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{")
                .append("\"val\":").append(val)
                .append(", \"next\":").append(next)
                .append('}');
        return sb.toString();
    }
}
