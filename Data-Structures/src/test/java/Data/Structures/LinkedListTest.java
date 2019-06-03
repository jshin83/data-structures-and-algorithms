package Data.Structures;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        testList.insert(1);
        assertSame("One node with value of 1 is inserted and should be head", 1,
                testList.getHeadData());
        assertSame("Size of list with one value should be one", 1, testList.getSize());
        assertTrue("Value of 1 is in list", testList.includes(1));
        assertFalse("2 is not in list", testList.includes(2));
    }

    @Test
    public void insertThreeValue() {
        testList.insert(1);
        testList.insert(2);
        testList.insert(3);
        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(2);
        result.add(3);

        assertEquals("Added three values; size should be 3", 3, testList.getSize());
        assertEquals("ArrayList should return three", "[1, 2, 3]", result.toString());
    }

    @Test
    public void returnEmptyList() {
        assertEquals("Empty list", "[]", testList.print().toString());
    }
}