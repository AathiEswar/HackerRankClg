package HackerRank;

import java.util.*;


class CircularArrayRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int Q = in.nextInt();
        int rot = K % N;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = in.nextInt();
        for (int i = 0; i < Q; i++) {
            int idx = in.nextInt();
            if (idx - rot >= 0)
                System.out.println(arr[idx - rot]);
            else
                System.out.println(arr[idx - rot + arr.length]);
        }
    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here

        HashMap<Integer , Integer> map  = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int n = a.size();

        for(int i=0;i<n;i++){
            Integer index = (i+k)%n;

            map.put(index , a.get(i));
        }

        for(Integer query : queries){
            list.add(map.get(query));
        }
        return list;


    }
}

