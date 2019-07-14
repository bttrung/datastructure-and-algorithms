package datastructure;

import java.util.HashSet;
import java.util.Set;

public class MyLinkedList {
    int val;
    MyLinkedList next;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
    }

    public MyLinkedList(int val) {
        this.val = val;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index < 0) {
            return -1;
        }

        MyLinkedList nextByIndex = findByIndex(index);
        if (nextByIndex == null) {
            return -1;
        }

        return nextByIndex.val;

    }

    private MyLinkedList findByIndex(int index) {
        if (index < 0) {
            return null;
        }
        if (index == 0) {
            return next;
        }

        int count = 0;
        MyLinkedList node = next;
        while (count < index && node != null) {
            node = node.next;
            count++;
        }

        return node;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        MyLinkedList next = new MyLinkedList(val);
        next.next = this.next;
        this.next = next;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        MyLinkedList last = new MyLinkedList(val);
        MyLinkedList currLast = findLastNode();
        currLast.next = last;
    }

    private MyLinkedList findLastNode() {
        MyLinkedList last = this.next;
        while (last.next != null) {
            last = last.next;
        }
        return last;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        MyLinkedList before = index <= 0 ? this : findByIndex(index - 1);
        if (before != null) {
            MyLinkedList tobeAdded = new MyLinkedList(val);
            MyLinkedList after = before.next;
            before.next = tobeAdded;
            tobeAdded.next = after;
        }

    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        MyLinkedList before = index == 0 ? this : findByIndex(index - 1);
        MyLinkedList after = findByIndex(index + 1);
        if (before != null) {
            before.next = after;
        }
    }

    /**
     * Given a linked list, determine if it has a cycle in it.
     */
    public boolean hasCycle(MyLinkedList head) {
        if (head == null) {
            return false;
        }
        Set<MyLinkedList> storage = new HashSet<>();
        storage.add(head);
        while (head.next != null) {
            if (storage.contains(head.next)) {
                return true;
            } else {
                storage.add(head.next);
            }
            head.next = head.next.next;
        }
        return false;
    }

    /**
     * Two points technique
     * Given a linked list, determine if it has a cycle in it.
     */
    public boolean hasCycleTwoPointTechnique(MyLinkedList head) {
        if (head == null) {
            return false;
        }
        MyLinkedList slow = head.next;
        MyLinkedList fast = head.next.next;

        while (slow != fast) {
            if (slow == null || fast == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public MyLinkedList detectCycle(MyLinkedList head) {
        if (head == null) {
            return null;
        }
        Set<MyLinkedList> storage = new HashSet<>();
        storage.add(head);
        while (head.next != null) {
            if (storage.contains(head.next)) {
                return head.next;
            } else {
                storage.add(head.next);
            }
            head.next = head.next.next;
        }
        return null;
    }

}
