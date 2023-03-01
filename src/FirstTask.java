import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Обчислення виразу для дійсних чисел
        System.out.println("1. Calculate (a / (b^2 - 2)) + (b / (a^2 + 2))");
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        double result1 = a / (Math.pow(b, 2) - 2) + b / (Math.pow(a, 2) + 2);
        System.out.println("Result: " + result1);

        // Обчислення виразу для цілих чисел з перетворенням в дійсні числа
        System.out.println("2. Convert int to double and calculate");
        System.out.print("Enter a: ");
        int intA = scanner.nextInt();
        System.out.print("Enter b: ");
        int intB = scanner.nextInt();
        double doubleA = (double) intA; // перетворення цілого числа у дійсне
        double doubleB = (double) intB;
        double result2 = doubleA / (Math.pow(doubleB, 2) - 2) + doubleB / (Math.pow(doubleA, 2) + 2);
        System.out.println("Result: " + result2);

        // Обчислення виразу для дійсних чисел з перетворенням в ціле число
        System.out.println("3. Convert double to int and calculate");
        System.out.print("Enter a: ");
        double a3 = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b3 = scanner.nextDouble();
        int result3 = (int) (a3 / (Math.pow(b3, 2) - 2) + b3 / (Math.pow(a3, 2) + 2)); // перетворення дійсного числа у ціле
        System.out.println("Result: " + result3);
    }
}