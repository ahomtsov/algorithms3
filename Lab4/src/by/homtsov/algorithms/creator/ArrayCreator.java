package by.homtsov.algorithms.creator;

public class ArrayCreator {
    public static final String DELIMITER = " ";

    public String[] factoryArray(String str){
        String[] result;
        result = str.split(DELIMITER);
        return  result;
    }
}
