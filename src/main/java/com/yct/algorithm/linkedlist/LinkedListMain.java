package com.yct.algorithm.linkedlist;

import static com.yct.algorithm.linkedlist.SimpleLinketListNode.*;

/**
 * @author yangChengTao
 * @date 2024-06-07 11:17:02
 */
public class LinkedListMain {

    public static void main(String[] args) throws Exception {
        Integer[] data = {1, 2, 3, 4, 5};
        SimpleLinketListNode simpleLinketListNode = init(data);

//        SimpleLinketListNode node = get(simpleLinketListNode, 3);
//        System.out.println(node);

//        SimpleLinketListNode listNode = insertHead(simpleLinketListNode, 0);
//        System.out.println(listNode);

        SimpleLinketListNode listNode = insertLast(simpleLinketListNode, 6);
        System.out.println(listNode);
    }

}
