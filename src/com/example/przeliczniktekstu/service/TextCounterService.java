package com.example.przeliczniktekstu.service;

public class TextCounterService {
    public int countCharsWithoutSpaces(String content) {
        return content.replaceAll(" ", "").length();
    }

    public int countWords(String content) {
        return content.split(" ").length;
    }

    public boolean isPalindrome(String content) {
        char[] chars = content.toCharArray();
        int firstChar = 0;
        int lastChar = chars.length - 1;

        while (lastChar > firstChar) {
            if (chars[firstChar] != chars[lastChar]) {
                return false;
            }
            ++firstChar;
            --lastChar;
        }
        return true;
    }
}