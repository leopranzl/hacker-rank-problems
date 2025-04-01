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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        int biggerIndex = 0;
        int smallestIndex = 0;
        
        for (int i = 1; i < arr.size(); i++){
            if (arr.get(i) < arr.get(smallestIndex)) smallestIndex = i;
        }
        for (int i = 1; i < arr.size(); i++){
            if (arr.get(i) > arr.get(biggerIndex)) biggerIndex = i;
        }

        long biggestSum = 0;
        long smallestSum = 0;
        for(int i = 0; i < 5; i++){
            if (i != smallestIndex) {
                biggestSum += arr.get(i);
            }
            if (i != biggerIndex) {
                smallestSum += arr.get(i);
            }
        }
        System.out.println(smallestSum + " " + biggestSum);
    }

}

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
