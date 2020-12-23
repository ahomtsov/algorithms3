package by.homtsov.algorithms.main;

import by.homtsov.algorithms.algorithm.AlgorithmClass;
import by.homtsov.algorithms.classes.ArrayClass;
import by.homtsov.algorithms.creator.ArrayCreator;
import by.homtsov.algorithms.sort.StringSort;
import by.homtsov.algorithms.reader.InfoReader;

/*
    Task:
    Разработать алгоритм и программу простого линейного поиска с циклом For.
    В качестве исходных данных использовать строку текста, из которой необходимо выделить слова.
    Затем слова упорядочить по алфавиту.
    Аргумент поиска – слово.
 */
public class Main {
    static final int COUNT_ELEMENTS = 10_000_000;
    static final int START = -100_000;
    static final int END = 100_000;
    static final int KEY = 1_500;

    public static void main(String[] args) {

        String str = "i had everything opportunities for eternity and could belong to the night";
        System.out.println("Initial string:");
        ArrayCreator arrayCreator = new ArrayCreator();
        String[] stringArray = arrayCreator.factoryArray(str);
        ArrayClass arrayClass = new ArrayClass();
        arrayClass.print(stringArray);
        StringSort stringSort = new StringSort();
        String[] stringArraySorted = stringSort.sortString(stringArray);
        arrayClass.printWithIndexes(stringArraySorted);
        System.out.println("Enter key");
        InfoReader reader = new InfoReader();
        String key = reader.readStringWord(System.in);

        AlgorithmClass algorithm = new AlgorithmClass();
        long startTime = System.nanoTime();
        int position = algorithm.simpleSearchWithFor(stringArraySorted, key);
        long endTime = System.nanoTime();
        long leadTime = endTime - startTime;
        if (position == -1){
            System.out.println("There is no such key");
        }else{
            System.out.println("Key " + key + " found at number " + position);
        }
        System.out.println("Lead time=" + leadTime);

    }
}
