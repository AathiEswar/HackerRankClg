package HackerRank;

import java.io.*;

class Result8a {

    /*
     * Complete the 'beautifulDays' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER i
     *  2. INTEGER j
     *  3. INTEGER k
     */
    public static int beautifulDays(int i, int j, int k) {
        int beautifulDays = 0;

        for(int x = i; x <= j; x++)
        {
            StringBuilder day = new StringBuilder(String.valueOf(x));
            int xReverse = Integer.parseInt(day.reverse().toString());

            if(Math.abs(x-xReverse) % k == 0)
            {
                beautifulDays++;
            }
        }
        return beautifulDays;
    }

}

public class BeautifulDays8a {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int i = Integer.parseInt(firstMultipleInput[0]);

        int j = Integer.parseInt(firstMultipleInput[1]);

        int k = Integer.parseInt(firstMultipleInput[2]);

        int result = Result8a.beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
