package task1;

import java.util.*;

public class Names {

    public static void printNameWithoutDuplicate(List<String> strings) {
        Set<String> listNames = new HashSet<>(strings);
        System.out.println(listNames);
    }

    public static void printListReverse(List<String> strings) {
        List<String> reverse = new ArrayList<>();

        for (int i = strings.size() - 1; i >= 0; i--) {
            reverse.add(strings.get(i));
        }
        System.out.println(reverse);
    }

    public static void changeElementInList(List<String> strings, String stringToBeReplaced, String stringSubstitute) {
        for (int i = 0; i <= strings.size() - 1; i++) {
            if (strings.get(i).equals(stringToBeReplaced)) {
                strings.set(i, stringSubstitute);
            }
        }
        System.out.println(strings);
    }
}
