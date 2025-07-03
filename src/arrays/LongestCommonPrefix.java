package arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] input = ArrayUtils.getSampleStrings();
        String longestCommonPrefix = "";
        String currentSubStr;
        int highestCount = 0;
        Map<String, Integer> charMap = new HashMap<>();

        if(input.length == 1) {
            longestCommonPrefix = input[0];
        } else {

            //Strictly in all strings
            for (int i = 0; i < input.length; i++) {
                if (!input[i].isEmpty()) {
                    for (int j = 0; j < input[i].length(); j++) {
                        currentSubStr = input[i].substring(0, j + 1);
                        if (i == 0) {
                            charMap.put(currentSubStr, charMap.getOrDefault(currentSubStr, 0) + 1);
                        } else {
                            if (j == 0 && !charMap.containsKey(currentSubStr)) {
                                longestCommonPrefix = "";
                                break;
                            } else if (charMap.containsKey(currentSubStr)) {
                                charMap.put(currentSubStr, charMap.getOrDefault(currentSubStr, 0) + 1);
                                if (highestCount <= charMap.get(currentSubStr) && charMap.get(currentSubStr) > 1) {
                                    highestCount = charMap.get(currentSubStr);
                                    longestCommonPrefix = currentSubStr;
                                }
                            }
                        }
                    }
                } else {
                    longestCommonPrefix = "";
                    break;
                }
                if(i > 0 && longestCommonPrefix.isEmpty()) {
                    break;
                }
            }

            System.out.println(charMap);
            System.out.println("Longest Common Prefix is: " + longestCommonPrefix);

            //Not strictly in all strings
            for (String s : input) {
                for (int j = 0; j < s.length(); j++) {
                    currentSubStr = s.substring(0, j + 1);
                    charMap.put(currentSubStr, charMap.getOrDefault(currentSubStr, 0) + 1);
                    if (highestCount <= charMap.get(currentSubStr) && charMap.get(currentSubStr) > 1) {
                        highestCount = charMap.get(currentSubStr);
                        longestCommonPrefix = currentSubStr;
                    }
                }
            }
        }

        System.out.println(charMap);
        System.out.println("Longest Common Prefix is: " + longestCommonPrefix);
    }
}
