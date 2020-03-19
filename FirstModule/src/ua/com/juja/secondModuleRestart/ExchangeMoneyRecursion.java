package ua.com.juja.secondModuleRestart;

public class ExchangeMoneyRecursion {
    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        int[] coins = {1, 2, 5, 10, 25, 50};

        if (amountForExchange <= 0) {
            return 0;
        }

        return coinRecursion(coins, amountForExchange, coins.length - 1);
    }

    private static int coinRecursion(int[] nominals, int amountForExchage, int coin) {
        if (amountForExchage == 0 || coin == 0) {
            return 1;
        }
        if (amountForExchage >= nominals[coin]) {
            return coinRecursion(nominals, amountForExchage - nominals[coin], coin) +
                    coinRecursion(nominals, amountForExchage, coin - 1);
        }

        return coinRecursion(nominals, amountForExchage, coin - 1);
    }
}
