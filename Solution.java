import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int numberOfPositives = 0;
        int numberOfNegatives = 0;
        int numberOfZeros = 0;
        int arraySize = arr.size();
    // Write your code here
    for(int i = 0; i < arraySize; i++){
        if(arr.get(i) == 0) numberOfZeros++;
        else if(arr.get(i) < 0) numberOfNegatives++;
        else numberOfPositives++;
    }
    float positiveRatio = (float) numberOfPositives / arraySize;
    float negativeRatio = (float) numberOfNegatives / arraySize;
    float zerosRatio = (float) numberOfZeros / arraySize;

    System.out.printf("%.6f%n", positiveRatio);
    System.out.printf("%.6f%n", negativeRatio);
    System.out.printf("%.6f%n", zerosRatio);


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
