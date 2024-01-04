package HackerRank;
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

class Result4b {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int len = arr.size();
        float odd= 0;
        float zero = 0;
        for(Integer a : arr){
            if(a==0) zero++;
            if(a>0) odd++;

        }
        float even = arr.size()- odd - zero;
        System.out.println(String.format("%.6f\n%.6f\n%.6f",odd/len,even/len,zero/len));

    }

}
public class E4b {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result4b.plusMinus(arr);

        bufferedReader.close();
    }
}
