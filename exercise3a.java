import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    public static long repeatedString(String s, long n) {
        long len = s.length();
        int count = 0;
        for(int i =0;i<len;i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        if(n % len == 0){
            return count * ( n / len );
        }
        else{
            long num = n% len;
            int numTwo = 0;
            for(int i = 0;i<num ;i++){
                if(s.charAt(i) == 'a'){
                    numTwo++;
                }
            }
            return count * ( n / len ) + numTwo;
        }


    }

}

public class exercise3a{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
