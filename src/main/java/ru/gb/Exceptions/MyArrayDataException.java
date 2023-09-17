package ru.gb.Exceptions;

/**
 * Класс исключения, для обозначения ошибки в данных.
 */
public class MyArrayDataException extends Exception {
    private final int row; // Строка с ошибкой
    private final int col; // Столбец с ошибкой

    /**
     * Конструктор класса MyArrayDataException.
     *
     * @param row Строка с ошибкой.
     * @param col Столбец с ошибкой.
     */
    public MyArrayDataException(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row+1; //возращаем не индекс массива, а строку в записи
    }

    public int getCol() {
        return col+1; //возращаем не индекс массива, а колонку в записи
    }
}