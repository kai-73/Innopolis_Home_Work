package HomeWork_15;

import java.util.Arrays;
import java.util.Scanner;

public class minNumberSort {
    static Scanner input = new Scanner(System.in); // Объявляем Scanner
    public static void main(String[] args) {

        int[] arraySort = sort(insertedArrayElements(arrayVolume()));
        System.out.println(Arrays.toString(arraySort));
        System.out.println("Минимальный элемент массива: " + arraySort[0]);
    }

    public static int arrayVolume() {
        System.out.println("Enter array length: ");
        return input.nextInt();
    }

    public static int[] insertedArrayElements(int volume) {
        int array[] = new int[volume]; // Создаём массив int размером в size
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        }
        System.out.println();
        return array;
    }

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = findMin(data, i, data.length - 1);
            int index = indexOf(data, min, i, data.length - 1);
            swap(data, i, index);
        }
        return data;
    }

    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start + 1; index <= finish; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                return index;
            }
        }
        return rst;
    }
    public static int[] swap(int[] array, int sourse, int dest) {
        int temp = array[sourse];
        array[sourse] = array[dest];
        array[dest] = temp;
        return array;
    }
}
