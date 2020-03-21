package ua.com.juja.secondModuleRestart.Recursion;

/**
 * Дано натуральное число N. Выведите слово YES, если число N является
 * точной степенью двойки, или слово NO в противном случае.
 *
 * Операцией возведения в степень пользоваться нельзя!
 *
 * Ввод
 * 8
 * Вывод
 * YES
 *
 * Ввод
 * 3
 * Вывод
 * No
 */
public class TaskD {
    public static void main(String[] args) {
        TaskD.f(81);

    }

    public static void f(double n) {
        System.out.println("Print N - " + n);
        if (n == 1) {
            System.out.println("YES");
            return;
        }
        if (n < 1) {
            System.out.println("NO");
            return;
        }
        f(n / 2);
    }
}
