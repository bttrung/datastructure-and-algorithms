package datastructure;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MyLinkedListTest {

    @Test
    public void testLinkedListHasCycle() {
        MyLinkedList list0 = new MyLinkedList(3);
        MyLinkedList list1 = new MyLinkedList(2);
        MyLinkedList list2 = new MyLinkedList(0);
        MyLinkedList list3 = new MyLinkedList(-1);
        list0.next = list1;
        list1.next = list2;
        list2.next = list3;
        list3.next = list1;

        boolean hasCycle = list0.hasCycle(list0);
        assertTrue(hasCycle);
    }

    @Test
    public void testLinkedListHasNoCycle() {
        MyLinkedList list0 = new MyLinkedList(3);
        MyLinkedList list1 = new MyLinkedList(2);
        MyLinkedList list2 = new MyLinkedList(0);
        MyLinkedList list3 = new MyLinkedList(-1);
        list0.next = list1;
        list1.next = list2;
        list2.next = list3;

        boolean hasCycle = list0.hasCycle(list0);
        assertFalse(hasCycle);
    }
}
