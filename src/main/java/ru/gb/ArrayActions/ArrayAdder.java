package ru.gb.ArrayTools;

import ru.gb.Exceptions.MyArrayDataException;

/**
 * Класс, обрабатывающий массив
 */
public class ArrayAdder {
    /**
     * Метод изначальные строки двумерного массива в числа и возвращает их сумму.
     * Если в массиве не преобразуется строка,
     * метод бросает исключение MyArrayDataException.
     *
     * @param startArray двумерный массив строк, который нужно преобразовать и сложить
     * @return сумму элементов массива, представленных числами
     * @throws MyArrayDataException если в массиве присутствует строка, которую невозможно преобразовать в число
     */
    public static int convertAndSum(String[][] startArray) throws MyArrayDataException {
        // Переменная для хранения суммы
        int sum = 0;
        // Перебор элементов массива
        for (int i = 0; i < startArray.length; i++) {
            for (int j = 0; j < startArray[i].length; j++) {
                try {
                    // Парсим строку, преобразуем в число, добавляем в сумму
                    sum += Integer.parseInt(startArray[i][j]);
                } catch (NumberFormatException e) {
                    // Создаем новый экземпляр MyArrayDataException
                    // с индексом не числового элемента и бросаем его
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        // возвращаем сумму
        return sum;
    }
}