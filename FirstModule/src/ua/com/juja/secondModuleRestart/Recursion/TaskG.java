package ua.com.juja.secondModuleRestart.Recursion;

/**
 * Дано натуральное число N. Выведите все его цифры по одной,
 * в обычном порядке, разделяя их пробелами или новыми строками.
 *
 * При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
 * Разрешена только рекурсия и целочисленная арифметика.
 *
 * Ввод
 * 179
 * Вывод
 * 1 7 9
 */
public class TaskG {
    public static void main(String[] args) {
        TaskG.f(179);
    }
    public static void f(int n) {
        if (n == 0) {
            System.out.println();
            return;
        }
        f(n / 10 );
        System.out.print(n % 10 + " ");
    }
}
