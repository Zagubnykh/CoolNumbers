package practice;

import java.util.*;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {
        ArrayList<String> lettersList =
                new ArrayList<>(List.of("А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"));
        ArrayList<String> numberList =
                new ArrayList<>(List.of("000", "111", "222", "333", "444", "555", "666", "777", "888", "999"));
        ArrayList<String> coolNumbers = new ArrayList<>();
        while (coolNumbers.size() < 2_000_000) {
            Collections.shuffle(lettersList);
            String firstLetter = lettersList.get(0);
            String secondLetter = lettersList.get(1);
            String thirdLetter = lettersList.get(2);
            Collections.shuffle(numberList);
            String number = numberList.get(0);
            String strRegion = "";
            int region = (int) (1 + Math.random() * 199);
            if (region < 10) {
                strRegion = "0" + String.valueOf(region);
            } else {
                strRegion = String.valueOf(region);
            }
            String coolNumber = firstLetter + number + secondLetter + thirdLetter + strRegion;
            if (!numberList.contains(coolNumber)) {
                coolNumbers.add(coolNumber);
            }
        }
        return coolNumbers;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        return list.contains(number);
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        int index = Collections.binarySearch(sortedList, number);
        if (index >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        return treeSet.contains(number);
    }

}
