package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> coolNumbers = new ArrayList<>(CoolNumbers.generateCoolNumbers());
        ArrayList<String> sortCoolNumbers = new ArrayList<>(coolNumbers);
        Collections.sort(sortCoolNumbers);

        long start1 = System.nanoTime();
        CoolNumbers.bruteForceSearchInList(coolNumbers, "А133ЕК199");
        System.out.println(System.nanoTime() - start1);

        long start2 = System.nanoTime();
        CoolNumbers.binarySearchInList(sortCoolNumbers, "А133ЕК199");
        System.out.println(System.nanoTime() - start2);

        HashSet<String> coolNumbersHashSet = new HashSet<>(coolNumbers);
        long start3 = System.nanoTime();
        CoolNumbers.searchInHashSet(coolNumbersHashSet, "А133ЕК199");
        System.out.println(System.nanoTime() - start3);

        TreeSet<String> coolNumbersTreeSet = new TreeSet<>(coolNumbers);
        long start4 = System.nanoTime();
        CoolNumbers.searchInTreeSet(coolNumbersTreeSet, "А133ЕК199");
        System.out.println(System.nanoTime() - start4);
    }
}
