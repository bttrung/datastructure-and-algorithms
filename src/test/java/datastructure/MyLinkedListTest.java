package datastructure;

import org.junit.Test;

import static org.junit.Assert.*;

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

    @Test
    public void testLinkedListHasCycle2PointsTechnique() {
        MyLinkedList list0 = new MyLinkedList(3);
        MyLinkedList list1 = new MyLinkedList(2);
        MyLinkedList list2 = new MyLinkedList(0);
        MyLinkedList list3 = new MyLinkedList(-1);
        list0.next = list1;
        list1.next = list2;
        list2.next = list3;
        list3.next = list1;

        boolean hasCycle = list0.hasCycleTwoPointTechnique(list0);
        assertTrue(hasCycle);
    }

    @Test
    public void testLinkedListHasNoCycle2PTechnique() {
        MyLinkedList list0 = new MyLinkedList(3);
        MyLinkedList list1 = new MyLinkedList(2);
        MyLinkedList list2 = new MyLinkedList(0);
        MyLinkedList list3 = new MyLinkedList(-1);
        list0.next = list1;
        list1.next = list2;
        list2.next = list3;

        boolean hasCycle = list0.hasCycleTwoPointTechnique(list0);
        assertFalse(hasCycle);
    }

    @Test
    public void testDetectCycle() {
        MyLinkedList list0 = new MyLinkedList(-1);
        MyLinkedList list1 = new MyLinkedList(-7);
        MyLinkedList list2 = new MyLinkedList(7);
        MyLinkedList list3 = new MyLinkedList(-4);
        MyLinkedList list4 = new MyLinkedList(19);
        MyLinkedList list5 = new MyLinkedList(6);
        MyLinkedList list6 = new MyLinkedList(-9);
        MyLinkedList list7 = new MyLinkedList(-5);
        MyLinkedList list8 = new MyLinkedList(-2);
        MyLinkedList list9 = new MyLinkedList(-5);
        list0.next = list1;
        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
        list4.next = list5;
        list5.next = list6;
        list6.next = list7;
        list7.next = list8;
        list8.next = list9;
        list9.next = list6;

        MyLinkedList hasCycle = list0.detectCycle(list0);
        assertEquals(hasCycle, list6);
    }
}
