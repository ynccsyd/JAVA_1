import java.util.Scanner;

public class LetterCapitalizer {
    public static String LetterCapitalize(String str) {
        String result = "";
        String[] toArray = str.split(" ");

        for (int i = 0; i < toArray.length; i++) {
            char[] wordString = toArray[i].toCharArray();
            wordString[0] = Character.toUpperCase(wordString[0]);
            result += new String(wordString) + " ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(LetterCapitalize(s.nextLine()));
    }
}
