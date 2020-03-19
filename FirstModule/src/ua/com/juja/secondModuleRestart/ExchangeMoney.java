package ua.com.juja.secondModuleRestart;

public class ExchangeMoney {
    public static void main(String[] args) {
//        System.out.println(ExchangeMoney.exchangeAmountOfCoinsBrutForce(5));
//        System.out.println(ExchangeMoney.exchangeAmountOfCoinsBrutForce(2));
//        System.out.println(ExchangeMoney.exchangeAmountOfCoinsBrutForce(1));
//        System.out.println(ExchangeMoney.exchangeAmountOfCoinsBrutForce(50));

        int testMoney=100;
        int expectedValue=3953;

        int actualValue=ExchangeMoney.exchangeAmountOfCoinsBrutForce(testMoney);

        if (actualValue!=expectedValue)
            throw new AssertionError("Money= "+ testMoney+ "  number of variants=  "+expectedValue + " but found " + actualValue);

        System.out.print("OK");
    }

    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        if (amountForExchange == 0) {
            return 0;
        }
        int sum = 0;
        int count = 0;
        for (int c50 = 0; c50 <= amountForExchange / 50; c50++) {
            for (int c25 = 0; c25 <= amountForExchange / 25; c25++) {
                for (int c10 = 0; c10 <= amountForExchange / 10; c10++) {
                    for (int c5 = 0; c5 <= amountForExchange / 5; c5++) {
                        for (int c2 = 0; c2 <= amountForExchange / 2; c2++) {
                            for (int c1 = 0; c1 <= amountForExchange; c1++) {
                                sum = c50 * 50 + c25 * 25 + c10 * 10 + c5 * 5 + c2 * 2 + c1;
                                if (sum == amountForExchange) {
                                    count += 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}
