import java.util.*;
class ActivitySelection {
    public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b) -> Integer.compare(a[1],b[1]));
        int c=pairs[0][1];
        int count=1;
        for(int i=1; i<pairs.length;i++){
            if(c<pairs[i][0]){
                count++;
                c=pairs[i][1];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(findLongestChain(arr));
    }
}

