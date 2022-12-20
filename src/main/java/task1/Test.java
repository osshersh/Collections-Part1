package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Katarzyna", "Tymon", "Tadeus", "Anna", "Karolina", "Dorota", "Piotr");
        System.out.println(names);
        System.out.println();
        Names.printNameWithoutDuplicate(names);
        System.out.println();
        Names.printListReverse(names);
        System.out.println();
        Names.changeElementInList(names, "Anna", "Joanna");


    }
}
