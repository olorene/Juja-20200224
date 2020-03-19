package ua.com.juja.secondModuleRestart;

public class Training {
    public static void main(String[] args) {
        String exp = "123";

        System.out.println(exp.length());
        System.out.println(exp.charAt(0));


        int value0 = Integer.valueOf("123");
        System.out.println(value0);

        try {
            int value1 = Integer.valueOf("abc");
            System.out.println(value1);
        } catch (Exception ex) {
            System.out.println("Not Intager");
        }

//

        System.out.println("Hello!".substring(0, 6));

    }
}
