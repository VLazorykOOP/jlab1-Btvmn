import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть текст: ");
        String text = input.nextLine().toLowerCase(); // переводимо текст до нижнього регістру
        System.out.print("Введіть символ: ");
        char ch = input.next().toLowerCase().charAt(0); // переводимо символ до нижнього регістру

        String[] words = text.split("\\W+"); // розділяємо текст на слова

        // знаходимо максимальну кількість входжень символу в слова
        int maxCount = 0;
        for (String word : words) {
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ch) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }

        // друкуємо всі слова, що містять символ максимальну кількість разів
        System.out.print("Слова, що містять символ '" + ch + "' " + maxCount + " разів: ");
        for (String word : words) {
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ch) {
                    count++;
                }
            }
            if (count == maxCount) {
                System.out.print(word + " ");
            }
        }
    }
}
