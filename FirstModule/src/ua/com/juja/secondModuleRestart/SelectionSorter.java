package ua.com.juja.secondModuleRestart;

/*
* 1. Убрать обмен элементами arr[barrier] c arr[index] каждый раз, когда находится очередной меньший элемент. Найти наименьший элемент во всем массиве - и обменять с ним.
2. Убрать обращение во внутреннем цикле к элементу массива arr[barrier]. Вычитать значение ячейки массива в локальную переменную (за пределами внутреннего цикла) и использовать ее (во внутреннем цикле).
В моих экспериментах:

пункт #1 ускорил сортировку в 2 раза.

пункт #2 ускорил сортировку еще на 10%-20%.
*/
public class SelectionSorter {
    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            int minValue = barrier;
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[index] < arr[minValue]) {
                    minValue = index;
                }
            }
            if (barrier != minValue) {
                int tmp = arr[barrier];
                arr[barrier] = arr[minValue];
                arr[minValue] = tmp;
            }
            ArrayProcessing.printArray(arr);
        }
    }

    public static void SelectionSorterFromTask(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[barrier] > arr[index]) {
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int sizeArray = 6;
        int[] array = ArrayProcessing.getRandomIntArray(sizeArray);
        ArrayProcessing.printArray(array);

        sort(array);
        ArrayProcessing.printArray(array);
    }
}

