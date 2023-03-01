public class SecondTask {
    public static void main(String[] args) {
        double[] A = {1.2, 3.4, 2.3, 5.6, 4.7, 6.8}; // приклад масиву A
        int n = A.length / 2;
        double sum = 0.0;
        double mean = 0.0;

        // обчислюємо середнє арифметичне значення чисел A(1), ..., A(n)
        for (int i = 0; i < n; i++) {
            mean += A[i];
        }
        mean /= n;

        // проходимось по елементам A(n+1), ..., A(2n) і обчислюємо суму тих елементів,
        // які перевищують середнє арифметичне
        for (int i = n; i < A.length; i++) {
            if (A[i] > mean) {
                sum += A[i];
            }
        }

        System.out.println("Сума чисел, які перевищують середнє арифметичне: " + sum);
    }
}