import java.util.Scanner;

public class ReverseString {
    public static String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse();
            reversed.append(sb.toString()).append(" ");
        }
        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String sentence = scanner.nextLine();

        String reversedSentence = reverseSentence(sentence);
        String reversedWords = reverseWords(sentence);

        System.out.println("Hasil reverse kalimat : " + reversedSentence);
        System.out.println("Hasil kalimat yang di reverse perkata : " + reversedWords);
    }
}
