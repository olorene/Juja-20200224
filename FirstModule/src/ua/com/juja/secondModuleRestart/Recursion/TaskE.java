package ua.com.juja.secondModuleRestart.Recursion;

/**
 * Дано натуральное число N. Вычислите сумму его цифр.
 *
 * При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
 *
 * Ввод
 * 179
 * Вывод
 * 17
 */
public class TaskE {
    public static void main(String[] args) {
        TaskE.f(123);
    }

    public static void f(int n) {
        f(n, 0);
    }
    public static void f(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }

        f(n / 10, sum + n % 10);

    }
}
