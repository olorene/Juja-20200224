package ua.com.juja.secondModuleRestart;

public class BubbleSorter {

    /*Перепиши алгоритм на такой, при котором самый маленький элемент "тонет".
Порядок сортировки должен сохраниться - по возрастанию.
Элементы должны перебираться справа - налево. Всплывал - вправо, тонет - влево.
Цикл не доходил до правого конца, теперь - не доходит до левого.*/
    public static void sort(int[] arr) {
//        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
        for (int barrier = 0; barrier <= arr.length - 1; barrier++) {
            for (int index = arr.length - 1; index > barrier; index--) {
                if (arr[index - 1] > arr[index]) {
                    int tmp = arr[index - 1];
                    arr[index - 1] = arr[index];
                    arr[index] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arrNumber = ArrayProcessing.getIntArray(4);
        System.out.println(arrNumber.length);
        System.out.println("==========================");
        ArrayProcessing.printArray(arrNumber);
        int[] arrNumShuf = ArrayProcessing.shuffleArray(arrNumber);
        ArrayProcessing.printArray(arrNumShuf);
        sort(arrNumShuf);
        ArrayProcessing.printArray(arrNumShuf);
    }

}