package Data.Structures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LinkedListMergeTest {
    private LinkedList testList1;
    private LinkedList testList2;

    @Before
    public void init() {

        testList1 = new LinkedList();
        testList2 = new LinkedList();
    }

    @Test
    public void emptyInitiatedLists() {
        assertNull("Empty linked list head should be null", testList1.head);
        assertEquals("Empty linked list size should be zero", 0, testList1.getSize());

        assertNull("Empty linked list head should be null", testList2.head);
        assertEquals("Empty linked list size should be zero", 0, testList2.getSize());
    }

    @Test (expected = IllegalArgumentException.class)
    public void callMergeOnEmptyLists() {
        LinkedList.mergeLists(testList1, testList2);
    }

    @Test
    public void secondListEmpty() {
        testList2.append(1);
        LinkedList result = LinkedList.mergeLists(testList1, testList2);
        assertEquals("result should be size of 1", 1, result.getSize());
    }

    @Test
    public void firstListShorter() {
        testList1.append(1);
        testList1.append(2); //1, 2

        testList2.append(3);
        testList2.append(4);
        testList2.append(5);//3, 4, 5
        LinkedList result = LinkedList.mergeLists(testList1, testList2);

        assertEquals("size should be 5", 5, result.getSize());

        assertEquals("order should be 1, 3, 2, 4, 5", "[1, 3, 2, 4, 5]", result.print().toString());

    }

    @Test
    public void secondListShorter() {
        testList1.append(1);
        testList1.append(2);
        testList1.append(3);
        testList1.append(4);//1, 2, 3, 4
        testList2.append(5);

        LinkedList result = LinkedList.mergeLists(testList1, testList2);

        assertEquals("size should be 5", 5, result.getSize());
        System.out.println(result.print());
        assertEquals("order should be 1, 4, 2, 5, 3", "[1, 5, 2, 3, 4]", result.print().toString());

    }
}
