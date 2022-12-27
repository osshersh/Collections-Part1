package task4;

import java.util.Comparator;

public class WeightComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o2.getWeight() - o1.getWeight();
    }
}
