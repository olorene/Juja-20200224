package ua.com.juja.secondModuleRestart.Recursion;

/**
 *В теории вычислимости важную роль играет функция Аккермана A(m,n), определенная следующим образом:
 *
 *          n+1             m=0
 * A(m,n)={ A(m−1,1)        m>0,n=0
 *          A(m−1,A(m,n−1)) m>0,n>0
 *
 *Даны два целых неотрицательных числа m и n, каждое в отдельной строке. Выведите A(m,n).
 *
 *Ввод
 * 2
 * 2
 *
 * Вывод
 * 7
 *
 */
public class TaskC {
    public static void main(String[] args) {
        System.out.println(TaskC.solution(3, 2));
    }
    public static int solution(int m, int n) {
        if (m < 0 && n < 0) {
            return 0;
        }
        if (m == 0) {
            return n + 1;
        }
        if (m > 0 && n == 0) {
            return solution(m - 1, 1);
        }
        if (m > 0 && n > 0) {
            return solution(m - 1, solution(m, n - 1));
        }
        return -1;
    }
}
