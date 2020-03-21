package ua.com.juja.secondModuleRestart.Recursion;

/**
 * Дано натуральное число n>1.
 * Выведите все простые делители этого числа в порядке неубывания с учетом кратности.
 * Алгоритм должен иметь сложность O(√n).
 *
 * Ввод
 * 18
 * Вывод
 * 2 3 3
 */
public class TaskI {
    public static void main(String[] args) {
        TaskI.f(6);
    }
    public static void f(int n) {
        f(n, 2);
    }

    public static void f(int n, int divider) {
        // k- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (divider > n / 2) {
            System.out.print(n + " ");
            return;
        }
        // Шаг рекурсии / рекурсивное условие
        if (n % divider == 0) {
            System.out.print(divider + " ");
            f(n / divider, divider);
        } // Шаг рекурсии / рекурсивное условие
        else {
            f(n, ++divider);
        }
    }


}
