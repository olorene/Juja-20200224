package ua.com.juja.secondModuleRestart.Recursion;

/**
 * Дано натуральное число N. Выведите все его цифры по одной, в обратном порядке,
 * разделяя их пробелами или новыми строками.
 *
 * При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
 * Разрешена только рекурсия и целочисленная арифметика.
 *
 * Ввод
 * 179
 * Вывод
 * 9 7 1
 */
public class TaskF {
    public static void main(String[] args) {
        TaskF.f(179);
    }
    public static void f(int n) {
        if (n == 0) {
            System.out.println();
            return;
        }
        System.out.print(n % 10 + " ");
        f(n / 10);
    }
}
