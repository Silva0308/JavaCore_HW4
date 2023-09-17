package ru.gb;

import ru.gb.Exceptions.MyArraySizeException;

import static ru.gb.ArrayActions.ArrayChecker.checkArray;

public class Main {
    public static void main(String[] args) {

        String[][] arr1 = {{"5", "7", "9", "11"}, {"5", "5", "5", "5"}, {"2", "0", "1", "12"}, {"22", "47", "8", "3"}};

        String[][] arr2 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}};

        String[][] arr3 = null;

        String[][] arr4 = {{"5", "7", "9", "11"}, {"3в", "ой", "5", "8"}, {"7", "17", "*", "7"}, {"22", "14", " ", "30"}};


        try {
            checkArray(arr1);

        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("*****************************************************");

        try {
            checkArray(arr2);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("*****************************************************");

        try {
            checkArray(arr3);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("*****************************************************");

        try {
            checkArray(arr4);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }


}
