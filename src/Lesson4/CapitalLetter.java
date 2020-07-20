package Lesson4;

public class CapitalLetter {

    public static void main(String[] args) {
        String text = "Истина - это то, что выдерживает проверку опытом. Эйнштейн А.";
        System.out.println(new CapitalLetter().splitText(text));
    }

    private String splitText(String text) {

        String[] spText = text.split("\\s");
        String result = "";

        for (int i = 0; i < spText.length; i++) {
            result += wordUpperCase(spText[i]) + " ";
        }

        return result;
    }


    private String wordUpperCase(String word) {

        char[] w = word.toCharArray();

        if (Character.isLetter(w[0])) {
            w[0] = Character.toUpperCase(w[0]);
        }

        return new String(w);

    }
}
