package edu.isu.cs.cs3308.structures.impl;

import edu.isu.cs.cs3308.structures.List;
import edu.isu.cs.cs3308.structures.Node;

public class DoublyLinkedList<E> implements List<E> {

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        SentinelNode frontNode = new SentinelNode();
        SentinelNode backNode = new SentinelNode();

        head = frontNode;
        tail = backNode;
        size = 0;
    }

    /**
     * @return first element in the list or null if the list is empty.
     */
    @Override
    public E first() {
        return null;
    }

    /**
     * @return last element in the list or null if the list is empty.
     */
    @Override
    public E last() {
        return null;
    }

    /**
     * Adds the provided element to the end of the list, only if the element is
     * not null.
     *
     * @param element Element to be added to the end of the list.
     */
    @Override
    public void addLast(E element) {

    }

    /**
     * Adds the provided element to the front of the list, only if the element
     * is not null.
     *
     * @param element Element to be added to the front of the list.
     */
    @Override
    public void addFirst(E element) {

    }

    /**
     * Removes the element at the front of the list.
     *
     * @return Element at the front of the list, or null if the list is empty.
     */
    @Override
    public E removeFirst() {
        return null;
    }

    /**
     * Removes the element at the end of the list.
     *
     * @return Element at the end of the list, or null if the list is empty.
     */
    @Override
    public E removeLast() {
        return null;
    }

    /**
     * Inserts the given element into the list at the provided index. The
     * element will not be inserted if either the element provided is null or if
     * the index provided is less than 0. If the index is greater than or equal
     * to the current size of the list, the element will be added to the end of
     * the list.
     *
     * @param element Element to be added (as long as it is not null).
     * @param index   Index in the list where the element is to be inserted.
     */
    @Override
    public void insert(E element, int index) {

    }

    /**
     * Removes the element at the given index and returns the value.
     *
     * @param index Index of the element to remove
     * @return The value of the element at the given index, or null if the index
     * is greater than or equal to the size of the list or less than 0.
     */
    @Override
    public E remove(int index) {
        return null;
    }

    /**
     * Retrieves the value at the specified index. Will return null if the index
     * provided is less than 0 or greater than or equal to the current size of
     * the list.
     *
     * @param index Index of the value to be retrieved.
     * @return Element at the given index, or null if the index is less than 0
     * or greater than or equal to the list size.
     */
    @Override
    public E get(int index) {
        return null;
    }

    /**
     * @return The current size of the list. Note that 0 is returned for an
     * empty list.
     */
    @Override
    public int size() {
        return 0;
    }

    /**
     * @return true if there are no items currently stored in the list, false
     * otherwise.
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * Prints the contents of the list each item on its own line
     */
    @Override
    public void printList() {

    }

    /**
     * Locates a given element in the list and returns the index of that element.
     *
     * @param element
     */
    @Override
    public int indexOf(E element) {
        return 0;
    }

    /**
     * Represents the data container used in a node-based list.
     */
    protected class DataNode implements Node {
        E data;
        Node next;
        Node prev;

        DataNode(E data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public Node next(){ return next; }

        @Override
        public Node prev() { return prev; }
    }

    /**
     * Represents the end caps of a node-based list.
     */
    protected class SentinelNode implements Node {
        Node next;
        Node prev;

        SentinelNode() {
            next = null;
            prev = null;
        }

        @Override
        public Node next() { return next; }

        @Override
        public Node prev() { return prev; }
    }
}
