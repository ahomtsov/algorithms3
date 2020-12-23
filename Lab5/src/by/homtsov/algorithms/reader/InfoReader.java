package by.homtsov.algorithms.reader;

import java.io.InputStream;
import java.util.Scanner;

public class InfoReader {
    public int readIntegerNumber(InputStream input){
        Scanner scan = new Scanner(input);
        return scan.nextInt();
    }
}
