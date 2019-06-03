package Data.Structures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    private LinkedList testList;
    @Before
    public void init() {
        testList = new LinkedList();
    }

    @Test
    public void emptyInitiatedList() {
        assertNull("Empty linked list head should be null", testList.head);
        assertEquals("Empty linked list size should be zero", 0, testList.getSize());
    }

    @Test
    public void insertOneIntoNewList() {
        emptyInitiatedList();
        testList.insert(1);
        assertSame("One node with value of 1 is inserted and should be head", 1,
                testList.getHeadData());
        assertSame("Size of list with one value should be one", 1, testList.getSize());
        assertTrue("Value of 1 is in list", testList.includes(1));
        assertFalse("2 is not in list", testList.includes(2));
    }

    @Test
    public void insertThreeValue() {
        emptyInitiatedList();
        testList.insert(1);
        testList.insert(2);
        testList.insert(3);

        assertEquals("Added three values; size should be 3", 3, testList.getSize());
        assertEquals("ArrayList should return 3, 2, 1", "[3, 2, 1]", testList.print().toString());
    }

    @Test
    public void returnEmptyList() {
    emptyInitiatedList();
    assertEquals("Empty list", "[]", testList.print().toString());
    }

    @Test
    public void appendToEmptyList() {
        emptyInitiatedList();
        assertNull("Empty list should be null", testList.head );
        testList.append(1);
        assertEquals("Added 1 value to empty list, should have 1 element with value 1", 1,
                testList.getHeadData());
    }

    @Test
    public void appendToOneElementList() {
        testList.append(2);
        assertEquals("Tail element should be 2", 2,
                testList.getTailData());
        assertEquals("Head element should be 2", 2,
                testList.getHeadData());
    }

    @Test
    public void appendToNotEmptyList() {
        testList.append(1);
        testList.append(2);
        assertEquals("Tail element should be 2", 2,
                testList.getTailData());
    }

    @Test (expected = IllegalArgumentException.class)
    public void insertBeforeEmptyList() {
        emptyInitiatedList();
        testList.insertBefore(1, 2);
    }

    @Test
    public void insertBeforeListWithOneElement() {
        emptyInitiatedList();
        testList.append(1);
        testList.insertBefore(1, 2);
        assertEquals("Search for and insert before element with data of 1 in list",
                2, testList.getHeadData());
    }

    @Test
    public void insertBeforeListWithManyElementsAndBeforeLastElement() {
        emptyInitiatedList();
        testList.append(1);
        testList.append(2);
        testList.insertBefore(2, 3);
        assertEquals("List should be [1, 3, 2]", "[1, 3, 2]", testList.print().toString());
        assertEquals("Size should be 3", 3, testList.getSize());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {

        testList.append(1);
        testList.append(2);
        testList.insertBefore(5, 3);
        testList.insertBefore(5, 3);

    }

    @Test (expected = IllegalArgumentException.class)
    public void insertAfterWithEmptyList(){
        emptyInitiatedList();
        assertEquals("Size should be 0 for empty list", 0, testList.getSize());

        testList.insertAfter(1, 2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void insertAfterWithOneElementList() {
        emptyInitiatedList();
        testList.insert(1);
        testList.insertAfter(1, 2);
        assertEquals("size should be 2", 2, testList.getSize());
        assertEquals("tail data should hold 2", 2, testList.getTailData());
        assertEquals("Print should show [1, 2]", "[1, 2]", testList.print().toString());

        assertEquals("Size should be 2 after adding an element to one element list", 2,
                testList.getSize());

        testList.insertAfter(9, 6);

    }

    @Test (expected = IllegalArgumentException.class)
    public void insertAfterWithManyElements() {
        emptyInitiatedList();
        testList.insert(1);
        testList.insert(2);
        testList.insert(3);

        testList.insertAfter(3, 0);
        testList.insertAfter(1, 0);

        assertEquals("Size should be 5 after the tests run",
                5, testList.getSize());
        assertEquals("Should be print [3, 0, 2, 1, 0]", "[3, 0, 2, 1, 0]",
                testList.print().toString());

        testList.insertAfter(99, 1);

    }
}