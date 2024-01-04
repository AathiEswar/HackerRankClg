package HackerRank;

public class ViralAdd10a {
    public static int viralAdvertising(int n) {
        // Write your code here
        int day = 1;
        int shared = 5;
        int liked = 0;
        int cumulative = 0;

        while(day <= n){
            liked = shared/2;
            cumulative += liked;
            shared = liked*3;
            day++;

        }
        return cumulative;
    }

}
