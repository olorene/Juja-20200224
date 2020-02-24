package ua.com.juja.secondModule;

/*Номинал мелких монет - 1,2,5,10,25,50.
1 копейку можно разменять 1 разным способом - {1}
2 - двумя разными способами {1 + 1; 2}
5 - 4 {1 + 1 + 1 + 1 + 1; 1 + 1 + 1 + 2; 1 + 2 + 2; 5}
........
Сколькими разными способами можно разменятьгривну (100 монет) ?

Реализовать алгоритм подсчета колличества разных разменов для входящего параметра.*/

public class ExchangeMoney {
    public static void main(String[] args) {

//        System.out.println(exchangeAmountOfCoinsBrutForce(1));
//        System.out.println(exchangeAmountOfCoinsBrutForce(2));
//        System.out.println(exchangeAmountOfCoinsBrutForce(5));
//        System.out.println(exchangeAmountOfCoinsBrutForce(10));
//        System.out.println(exchangeAmountOfCoinsBrutForce(25));
//        System.out.println(exchangeAmountOfCoinsBrutForce(100));
        System.out.println(exchangeAmountOfCoinsBrutForce(4));
        System.out.println("================================");
        System.out.println("" + coinRecursion(4));
    }

    public static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        int stack = 0;
        int variantsComposition = 0;

        for (int coin50 = 0; coin50 <= amountForExchange / 50 ; coin50++) {
            for (int coin25 = 0; coin25 <= amountForExchange / 25; coin25++) {
                for (int coin10 = 0; coin10 <= amountForExchange / 10; coin10++ ) {
                    for (int coin5 = 0; coin5 <= amountForExchange / 5; coin5++) {
                        for (int coin2 = 0; coin2 <= amountForExchange / 2 ; coin2++) {
                            for (int coin1 = 0; coin1 <= amountForExchange; coin1++) {
                                stack = (coin50 * 50 + coin25 * 25 + coin10 * 10 + coin5 * 5 +  coin2 * 2 + coin1);
                                if (stack == amountForExchange) {
                                    variantsComposition += 1;
                                }
                            }
                        }
                    }
                }
            }
        }

        return variantsComposition;
    }
    private static int coinRecursion(int amountForExchange) {
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
