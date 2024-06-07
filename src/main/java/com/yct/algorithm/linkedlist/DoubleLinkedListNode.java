package com.yct.algorithm.linkedlist;

/**
 * 双链表
 *
 * @author yangChengTao
 * @date 2024-06-07 10:59:53
 */
public class DoubleLinkedListNode<E> {

    public E val;

    public DoubleLinkedListNode<E> next;

    public DoubleLinkedListNode<E> prev;

    public DoubleLinkedListNode(E val, DoubleLinkedListNode<E> next, DoubleLinkedListNode<E> prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }

    public E getVal() {
        return val;
    }

    public void setVal(E val) {
        this.val = val;
    }

    public DoubleLinkedListNode<E> getNext() {
        return next;
    }

    public void setNext(DoubleLinkedListNode<E> next) {
        this.next = next;
    }

    public DoubleLinkedListNode<E> getPrev() {
        return prev;
    }

    public void setPrev(DoubleLinkedListNode<E> prev) {
        this.prev = prev;
    }
}
