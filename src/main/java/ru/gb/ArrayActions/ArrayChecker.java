package ru.gb.ArrayActions;

import ru.gb.Exceptions.MyArrayDataException;
import ru.gb.Exceptions.MyArraySizeException;

import static ru.gb.ArrayActions.ArrayAdder.convertAndSum;

/**
 * Класс для проверки и печати массива
 */
public class ArrayChecker {


    /**
     * Метод для проверки размера массива. Есои массив не равен 4x4, выбрасывает исключение.
     * Затем печатает и вызвает метод суммирования.
     *
     * @param array       двухмерный массив строк для проверки
     * @throws MyArraySizeException если размер массива не равен 4x4
     */
    public static void checkArray(String[][] array) throws MyArraySizeException {
        if (array == null) throw new MyArraySizeException("Ошибка. \n" +
                "Массива не существует. null вместо массива 4х4");
        System.out.println("Массив");
        printArray(array);
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException(String.format("Массив неверного размера"));
        } else {
            try {
                // Метод преобразования и суммирования
                int sum = convertAndSum(array);

                // Печать результата
                System.out.println("Сумма элементов массива: " + sum);
            } catch (MyArrayDataException e) {
                // Поймали исключение, выводим сообщение об ошибке
                System.out.println("Не число в массиве в строке " + e.getRow() + ", колонке " + e.getCol());
            }
        }
    }

    /**
     * Метод печати массива
     *
     * @param arr двухмерный массив строк
     */
    public static void printArray(String[][] arr) {
        for (String[] strings : arr) {
            for (String string : strings) {
                System.out.printf("%-3s", string);
            }
            System.out.println();
        }
    }
}