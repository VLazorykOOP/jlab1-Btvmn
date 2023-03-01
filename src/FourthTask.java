import java.util.*;

public class FourthTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введіть текст: ");
        String text = input.nextLine().toLowerCase(); // переводимо текст до нижнього регістру
        System.out.print("Введіть символ: ");
        char ch = input.next().toLowerCase().charAt(0); // переводимо символ до нижнього регістру

        String[] words = text.split("[\\s,.!?]+"); // розділяємо текст на слова

        // знаходимо максимальну кількість входжень символу в слова
        int maxCount = 0;
        List<String> maxCountWords = new ArrayList<>();
        for (String word : words) {
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ch) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxCountWords.clear(); // очищуємо список слів з максимальною кількістю входжень символу
            }
            if (count == maxCount) {
                maxCountWords.add(word); // додаємо слово до списку, якщо містить символ максимальну кількість разів
            }
        }

        System.out.println("Слова, що містять символ '" + ch + "' " + maxCount + " разів: " + maxCountWords);
    }
}

