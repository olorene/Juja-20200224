package ua.com.juja.secondModuleRestart.Recursion;

/**
 * Дано натуральное число n. Выведите все числа от 1 до n.
 */
public class TaskA {
    public static void main(String[] args) {
        TaskA taskA = new TaskA();
        taskA.solution(5);
    }

    public void solution(int n) {
        if (n <= 0) {
            return;
        }
        solution(n-1);
        System.out.println(n);
    }
}
