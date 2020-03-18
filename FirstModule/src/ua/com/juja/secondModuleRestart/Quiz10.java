package ua.com.juja.secondModuleRestart;

public class Quiz10 {


    private static void f1(int n) {
        System.out.print(n);
        if (n < 7) {
            f1(2 * n);
        }
    }

    private static void f2(int n) {
        if (n < 7) {
            System.out.print(n);
            f2(2 * n);
        }
    }

    private static void f3(int n) {
        if (n < 7) {
            f3(2 * n);
        }
        System.out.print(n);
    }
    private static void f4(int n) {
        if (n < 7) {
            f4(2 * n);
            System.out.print(n);
        }
    }
    private static void f5(int n) {
        System.out.print(n);
        if (n < 7) {
            f5(2 * n);
        }
        System.out.print(n);
    }
    private static void f6(int n) {
        System.out.print(n);
        if (n < 7) {
            f6(2 * n);
            System.out.print(n);
        }
    }
    private static void f7(int n) {
        if (n < 7) {
            System.out.print(n);
            f7(2 * n);
        }
        System.out.print(n);
    }
    private static void f8(int n) {
        if (n < 7) {
            System.out.print(n);
            f8(2 * n);
            System.out.print(n);
        }
    }
    private static int fibonachi1(int n) {
        int result;
        if (n == 0 || n == 1) {
            result = n;
        } else {
            result = fibonachi1(n - 2) + fibonachi1(n - 1);
        }
        System.out.print(n);
        return result;
    }

    private static int fibonachi2(int n) {
        System.out.print(n);
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonachi2(n - 2) + fibonachi2(n - 1);
        }
    }
    private static int fibonachi3(int n) {
        System.out.print(n);
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonachi3(n - 1) + fibonachi3(n - 2);
        }
    }
    private static int fibonachi4(int n) {
        int result;
        if (n == 0 || n == 1) {
            result = n;
        } else {
            result = fibonachi4(n - 1) + fibonachi4(n - 2);
        }
        System.out.print(n);
        return result;
    }
    private static boolean f20(int k) {
        System.out.print("f0 ");
        return k == 0 ? true : f21(k - 1);
    }

    private static boolean f21(int k) {
        System.out.print("f1 ");
        return k == 0 ? false : f20(k - 1);
    }

    private static boolean f30(int k) {
        System.out.print("f0 ");
        return k == 0 ? true : f31(k - 1);
    }

    private static boolean f31(int k) {
        System.out.print("f1 ");
        return k == 0 ? false : f30(k - 1);
    }


    private static boolean f40(int k) {
        System.out.print("f0 ");
        return k == 0 ? true : f41(k - 1);
    }

    private static boolean f41(int k) {
        System.out.print("f1 ");
        return k == 0 ? false : f40(k - 1);
    }


    private static boolean f50(int k) {
        System.out.print("f0 ");
        return k % 3 == 0 || f51(k - 1);
    }

    private static boolean f51(int k) {
        System.out.print("f1 ");
        return k % 3 == 1 || f52(k - 1);
    }

    private static boolean f52(int k) {
        System.out.print("f2 ");
        return k % 3 == 2 || f50(k - 1);
    }
//==============================================
    private static boolean f60(int k) {
        System.out.print("f0 ");
        return k % 3 == 0 || f61(k - 1);
    }

    private static boolean f61(int k) {
        System.out.print("f1 ");
        return k % 3 == 1 || f62(k - 1);
    }

    private static boolean f62(int k) {
        System.out.print("f2 ");
        return k % 3 == 2 || f60(k - 1);
    }
//=============================================
    private static boolean f70(int k) {
        System.out.print("f0 ");
        return k % 3 == 0 || f72(k + 1);
    }

    private static boolean f71(int k) {
        System.out.print("f1 ");
        return k % 3 == 1 || f70(k + 1);
    }

    private static boolean f72(int k) {
        System.out.print("f2 ");
        return k % 3 == 2 || f71(k + 1);
    }

//    =========================================

    private static boolean f80(int k) {
        System.out.print("f0 ");
        return k % 3 == 0 || f82(k + 1);
    }

    private static boolean f81(int k) {
        System.out.print("f1 ");
        return k % 3 == 1 || f80(k + 1);
    }

    private static boolean f82(int k) {
        System.out.print("f2 ");
        return k % 3 == 2 || f81(k + 1);
    }
//=================================================
    public static int fQ111(int a, int b) {
        return (b == 0) ? a : fQ111(a + 1, b - 1);
    }

//    ==============================================
    public static int fQ112(int a, int b) {
        return (b == 0) ? a : 1 + fQ112(a, b - 1);
    }
//    ==============================================
    public static int fQ113(int a, int b) {
        return (b == 1) ? a : a + fQ113(a, b - 1);
    }
//    ==============================================
    public static void main(String[] args) {
        f1(1);
        System.out.println("");
        f2(1);
        System.out.println("");
        f3(1);
        System.out.println("");
        f4(1);
        System.out.println("");
        f5(1);
        System.out.println("");
        f6(1);
        System.out.println("");
        f7(1);
        System.out.println("");
        f8(1);
        System.out.println("");
        fibonachi1(3);
        System.out.println("");
        fibonachi2(3);
        System.out.println("");
        fibonachi3(3);
        System.out.println("");
        fibonachi4(3);
        System.out.println(f20(5));
        System.out.println(f50(10));
        System.out.println(f60(5));
        System.out.println(f70(10));
        System.out.println(f80(5));
    }
}
