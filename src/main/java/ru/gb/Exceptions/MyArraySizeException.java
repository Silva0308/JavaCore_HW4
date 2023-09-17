package ru.gb.Exceptions;

/**
 * Класс исключения, который появляется в ситуации неверного размера массива.
 */
public class MyArraySizeException extends Exception {

    /**
     * Конструктор класса
     *
     * @param problemMessage стока, которая выскочит, если исключение возникнет
     */
    public MyArraySizeException(String problemMessage) {
        super(problemMessage);
    }
}