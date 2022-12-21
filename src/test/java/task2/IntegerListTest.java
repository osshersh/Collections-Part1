package task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListTest {

    IntegerList integerList;

    @BeforeEach
    public void initialList() {
        integerList = new IntegerList(2);
    }

    @Test
    void shouldReturnListSize() {
        integerList.add(3);
        integerList.add(4);

        assertEquals(2, integerList.size());
    }

    @Test
    void shouldReturnProperWhenListIsEmpty() {
        assertTrue(integerList.isEmpty());
    }

    @Test
    void shouldSayWhenListAddElement() {
        integerList.add(4);
        int value = integerList.get(0);

        assertEquals(4, value);
    }

    @Test
    void shouldReturnProperWhenListGetIndexValue() {
        integerList.add(4);
        integerList.add(45);

        assertEquals(45, integerList.get(1));
    }

    @Test
    void shouldSayWhenMayToChoiceIndexToAddValue() {
        integerList = new IntegerList(4);
        integerList.add(0, 100);
        integerList.add(1, 200);
        integerList.add(2, 300);
        integerList.add(3, 400);

        assertEquals(300, integerList.get(2));
    }

    @Test
    void shouldSayWhenMayRemoveIndex() {
        integerList.add(100);
        integerList.add(200);
        integerList.remove(1);

        assertEquals(1, integerList.size());
    }
}