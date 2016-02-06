package other;

import java.util.*;

class ReversedStringRemoval {

    public static void main(String[] args) {
        List<String> listA = new ArrayList<String>(Arrays.asList("loop", "hello", "time", "smart", "world", "smart"));
        List<String> listB = new ArrayList<String>(Arrays.asList("pool", "emit", "aloha", "emit", "trams"));

        removeReversed(listA, listB);

        System.out.println("List A : " + listA);
        System.out.println("List B : " + listB);
    }

    public static void removeReversed(Collection<String> listA, Collection<String> listB) {
        Set<String> reversedStrings = new HashSet<>();

        for (String s : listA) {
            reversedStrings.add(new StringBuilder(s).reverse().toString());
        }

        for (String s : listB) {
            reversedStrings.add(new StringBuilder(s).reverse().toString());
        }

        listA.removeAll(reversedStrings);
        listB.removeAll(reversedStrings);
    }

}