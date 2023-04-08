import java.util.Arrays;

public class Task1 {
    /*
    Найти количество разлічніх елементов массива.Пример: {1 4 5 1 1 3}ответ: 4
    Создать метод которій принимает массив и возвращает количество разлічніх елементов
     */

    public static void main(String[] args) {

        int arraySize = 50;

        int[] array = {1, 4, 5, 1, 1, 3};
        System.out.println("Array: " + Arrays.toString(array));

        System.out.println(qtyOfUniqueNumbersBySort(array));

        System.out.println(qtyOfUniqueNumbersClassic(array));
    }

    public static void randomMassive(int arraySize) {

    }

    public static int qtyOfUniqueNumbersBySort(int[] array) {
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        int counter = 1;

        if (array.length == 0) {
            counter = 0;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                counter++;
            }
        }
        return counter;
    }

    public static int qtyOfUniqueNumbersClassic(int[] array) {

        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            counter++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter--;
                    break;
                }
            }
        }
        return counter;
    }
}