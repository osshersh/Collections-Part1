package task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OwnLinkedListTest {
    OwnLinkedList<String> ownLinkedList;

    @BeforeEach
    void initList() {
        ownLinkedList = new OwnLinkedList<>();
        ownLinkedList.addNodeToTail("first");
        ownLinkedList.addNodeToTail("second");
        ownLinkedList.addNodeToTail("third");

    }

    @Test
    void shouldDeleteNodeByIndex() {
        ownLinkedList.deleteNode(1);
        assertEquals(2, ownLinkedList.getSize());
    }

    @Test
    void shouldAddNodeToTail() {
        ownLinkedList.addNodeToTail("fourth");
        String string = ownLinkedList.get(3);
        assertEquals("fourth", string);
    }

    @Test
    void shouldAddNodeByIndex() {
        ownLinkedList.addNodeAny(1, "test");
        String test = ownLinkedList.get(1);
        assertEquals("test", test);
    }

    @Test
    void shouldReturnListSize() {
        assertEquals(3, ownLinkedList.getSize());
    }
}