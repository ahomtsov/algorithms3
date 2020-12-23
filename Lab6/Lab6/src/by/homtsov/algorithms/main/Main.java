package by.homtsov.algorithms.main;

import by.homtsov.algorithms.algorithm.Algorithm;
import by.homtsov.algorithms.creator.ArrayCreator;

import java.util.Arrays;

/*
    Task:
    Составить две программы, которые реализуют алгоритмы простой сортировки «пузырьком» и шейкером.
    Исходные данные задавать с помощью датчика случайных чисел.
*/
public class Main {

    static final int COUNT_ELEMENTS = 25;
    static final int START = -20;
    static final int END = 30;

    public static void main(String[] args) {
        ArrayCreator arrayCreator = new ArrayCreator();
        int[] firstArray = arrayCreator.createArray(COUNT_ELEMENTS);
        int[] secondArray = arrayCreator.createArray(COUNT_ELEMENTS);
        firstArray = arrayCreator.fillArrayFromInterval(START, END, firstArray);
        secondArray = arrayCreator.fillArrayFromInterval(START,END,secondArray);
        System.out.println("Initialising arrays:");
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        Algorithm algorithm = new Algorithm();

        long startTime1 = System.nanoTime();
        firstArray = algorithm.bubbleSort(firstArray);
        long endTime1 = System.nanoTime();
        long leadTime1 = endTime1 - startTime1;


        long startTime2 = System.nanoTime();
        secondArray = algorithm.insertionSort(secondArray);
        long endTime2 = System.nanoTime();
        long leadTime2 = endTime2 - startTime2;


        System.out.println("Bubble sort:");
        System.out.println(Arrays.toString(firstArray));
        System.out.println("Lead time1=" + leadTime1);
        System.out.println("Insertion sort:");
        System.out.println(Arrays.toString(secondArray));
        System.out.println("Lead time2=" + leadTime2);
    }
}
