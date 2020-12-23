package by.homtsov.algorithms.algorithm;

public class AlgorithmClass {

    public int simpleSearchWithFor(String[] strings, String str){
        if(strings.length == 0){
            return -1;
        }

        int position = -1;
        for (int i = 0; i < strings.length; i++){
            if (str.equals(strings[i])) position = i;
        }

        return position;
    }
}
