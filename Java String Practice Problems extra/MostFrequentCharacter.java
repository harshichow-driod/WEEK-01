import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {

    public static char findMostFrequentChar(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        char mostFrequentChar = str.charAt(0);
        int maxCount = 1;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return mostFrequentChar;
    }

    public static void main(String[] args) {
        String str = "success";
        char result = findMostFrequentChar(str);
        System.out.println("Most Frequent Character: '" + result + "'");
    }
}

