package HackerRank;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result6a {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        // Write your code here
        int[] alpha = new int[26];
        for(char ch : s.toCharArray()){
            if(!Character.isWhitespace(ch)){
                ch = Character.toUpperCase(ch);
                System.out.println((int)ch-64);
                alpha[(int)ch-65]++;
            }
        }
        for(int num : alpha){
            if(num==0){
                return "not pangram";
            }
        }
        return "pangram";
    }
    public static String isPangrams(String s){
        for(char ch='a';ch<='z';ch++){
            if(!s.contains(String.valueOf(ch))){
                return "not pangram";
            }
        }
        return "pangram";
    }

}

public class A6Pangrams {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = bufferedReader.readLine();
//
//        String result = Result6a.isPangrams(s);
//
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
        System.out.println(Result6a.isPangrams("abcdefghijklmnopqrtuvwxyz"));
    }
}