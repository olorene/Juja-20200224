package ua.com.juja.secondModuleRestart.Recursion;

/**
 * Даны два целых числа A и В (каждое в отдельной строке). Выведите все числа от A до B включительно,
 * в порядке возрастания, если A < B, или в порядке убывания в противном случае.
 */
public class TaskB {
    public static void main(String[] args) {
        TaskB.solution(5, 1);
    }
    public static void solution(int a, int b) {
        if (a == b) {
            System.out.println(a);
            return;
        }
        if (a > b) {
            System.out.println(a);
            solution(a - 1, b);
        } else {
            solution(a, b - 1);
            System.out.println(b);
        }
    }
}
