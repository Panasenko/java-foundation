package Lesson4;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        /**
         *  Предложения анограммы. Проверка должна пройти успешно
         */

        String firstAnagram = "Аз есмь строка, живу я, мерой остр.";
        String secondAnagram = "За семь морей ростка я  вижу рост.";


        /**
         *  Предложения c ошибкой. Проверка должна пройти неуспешно
         */

//        String firstAnagram = "Аз есмь строка, живу я, мерой остр.";
//        String secondAnagram = "За семь морей ротка я вижу рост.";

        System.out.println(new Anagram().start(firstAnagram, secondAnagram));

    }

    private String start(String firstA, String secondA) {

        if (comparisonAnagram(firstA, secondA)) {
            return "Совпадает! Предложение \"" + firstA + "\" является анограммой предложения \"" + secondA + "\"";
        }

        return "Не совпадает! Предложение \"" + firstA + "\" не является анограммой предложения \"" + secondA + "\"";

    }

    private boolean comparisonAnagram(String firstA, String secondA) {

        String firstAnagram = textToArray(firstA);
        String secondAnagram = textToArray(secondA);

        if (firstAnagram.length() != secondAnagram.length()) {
            return false;
        }
        return firstAnagram.equals(secondAnagram);
    }

    private String textToArray(String anagram) {

        char[] charArray = anagram.toLowerCase().toCharArray();

        Arrays.sort(charArray);

        return buildString(charArray);
    }

    private String buildString(char[] charArray) {

        StringBuilder str = new StringBuilder(charArray.length);

        for (char letter : charArray) {
            if (Character.isLetter(letter)) {
                str.append(letter);
            }
        }

        return str.toString();
    }
}
