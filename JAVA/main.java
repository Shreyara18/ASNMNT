import java.util.*;

public class main {

    public static void main(String[] args) {
        // A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Collections.shuffle(list);
        System.out.println("Shuffled Array: " + Arrays.toString(list.toArray()));

        // B. Enter a Roman Number as input and convert it to an integer. (ex IX = 9)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Numeral: ");
        String romanNumeral = scanner.nextLine().trim().toUpperCase();
        int result = romanToInteger(romanNumeral);
        System.out.println("Integer value: " + result);

        // C. Check if the input is pangram or not.
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();
        boolean isPangram = checkPangram(sentence);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static int romanToInteger(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int value = romanValues.get(ch);
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            prevValue = value;
        }
        return result;
    }

    public static boolean checkPangram(String str) {
        if (str.length() < 26) {
            return false;
        }

        boolean[] mark = new boolean[26];
        int index;

        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
            } else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            } else {
                continue;
            }
            mark[index] = true;
        }

        for (int i = 0; i < 26; i++) {
            if (!mark[i]) {
                return false;
            }
        }

        return true;
    }
}
