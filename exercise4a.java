package HackerRank;
import java.io.*;

class Result4 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String hours = s.substring(0,2);
        int hoursInt = Integer.parseInt(hours);

        String zone = s.substring(8,10);

        if(hoursInt == 12 && zone.equals("AM")) hours = "00";
        if(zone.equals("PM") && hoursInt<12 ) hours = String.valueOf(hoursInt + 12);

        return hours + s.substring(2,8);
    }

}
public class exercise4a {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result4.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
