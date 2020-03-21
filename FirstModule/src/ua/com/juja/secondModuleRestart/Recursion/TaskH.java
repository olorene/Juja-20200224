package ua.com.juja.secondModuleRestart.Recursion;

import javax.sound.midi.Soundbank;

/**
 * Дано натуральное число n>1. Проверьте, является ли оно простым.
 * Программа должна вывести слово YES, если число простое и NO, если число составное.
 * Алгоритм должен иметь сложность O(√n).
 *
 * Ввод
 * 2
 * Вывод
 * YES
 *
 * Ввод
 * 4
 * Вывод
 * NO
 */
public class TaskH {
    static int var = 2;

    public static void main(String[] args) {
        TaskH.f(8);
    }

    public static void f(int n) {
        if (n == 1) {
            System.out.println("NO");
        }
        if (n > 1) {
            if (n % var != 0) {
                var += 1;
                f(n);
            } else if (n % var == 0) {
                if (n == var) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
