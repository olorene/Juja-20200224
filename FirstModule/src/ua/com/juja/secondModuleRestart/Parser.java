package ua.com.juja.secondModuleRestart;

public class Parser {
    public static void main(String[] args) {
//        System.out.println(">> 12*3 = " + Parser.eval("12*3"));

//        System.out.println(">> 123 = " + Parser.eval("123"));
//        System.out.println(">> 2*3 = " + Parser.eval("2*3"));
//        System.out.println(">> 2*(1+3) = " + Parser.eval("2*(1+3)"));
//        System.out.println(">> 1+(5-2*(13/6)) = " + Parser.eval("1+(5-2*(13/6))"));

        System.out.println("==========================================================");

//        System.out.println(">> 123 = " + Parser.eval("123"));
//        System.out.println(">> 2*3 = " + Parser.eval("2*3"));
//        System.out.println(">> (1+3)*2 = " + Parser.eval("(1+3)*2"));
        System.out.println(">> ((13/6)*2-5)+1 = " + Parser.eval("((13/6)*2-5)+1"));
    }

    public static int eval(String expr) {
        return eval(expr, 0, expr.length());
    }

    private static int eval(String expr, int from, int to) {
        int lastPostition = to - 1;
        if (expr.charAt(lastPostition) == ')') {
            return eval(expr, from + 1, to - 1);
        } else {
            int pos = lastPostition;
            while (from <= pos) {
                if (Character.isDigit(expr.charAt(pos))) {
                    pos--;
                } else {
                    int rightOperand = Integer.valueOf(expr.substring(pos + 1, to));
                    char operation = expr.charAt(pos);
                    int leftOperand = eval(expr, from, pos);
                    switch (operation) {
                        case '+':
                            return leftOperand + rightOperand;
                        case '-':
                            return leftOperand - rightOperand;
                        case '*':
                            return leftOperand * rightOperand;
                        case '/':
                            return leftOperand / rightOperand;
                    }
                }
            }
            return Integer.valueOf(expr.substring(from, to));
        }
    }
}
