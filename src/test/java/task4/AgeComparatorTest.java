package task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AgeComparatorTest {

    AgeComparator ageComparator;
    HeightComparator heightComparator;
    WeightComparator weightComparator;
    List<Person> peoples;

    @BeforeEach
    void init() {
        peoples = new ArrayList<>();
        ageComparator = new AgeComparator();
        heightComparator = new HeightComparator();
        weightComparator = new WeightComparator();

        Person person1 = new Person("Ivan", "Ivanov", 34, 178, 85);
        Person person2 = new Person("Mark", "Nowrot", 24, 180, 78);
        Person person3 = new Person("Jack", "Carter", 40, 150, 67);
        Person person4 = new Person("John", "Cena", 67, 176, 86);

        peoples.add(person1);
        peoples.add(person2);
        peoples.add(person3);
        peoples.add(person4);
    }

    @Test
    void shouldReturnYoungestPerson() {
        peoples.sort(ageComparator);
        String youngest = peoples.get(0).getName();
        assertEquals("Mark", youngest);
    }

    @Test
    void shouldReturnSmallestPerson() {
        peoples.sort(heightComparator);
        String smallest = peoples.get(0).getName();
        assertEquals("Jack", smallest);
    }

    @Test
    void shouldReturnHeaviestPerson() {
        peoples.sort(weightComparator);
        String heaviest = peoples.get(0).getName();
        assertEquals("John", heaviest);
    }
}