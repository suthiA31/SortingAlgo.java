package September;

import java.util.Scanner;

public class lb_ub {
    public static int lowerbound(int arr[], int lb, int ub, int t) {
        int ans = arr.length;
        while (lb <= ub) {
            int mid = (lb + ub) / 2;
            if (arr[mid] >= t) {
                ans = mid;
                ub = mid - 1;
            } else {
                lb = mid + 1;
            }
        }
        return ans;

    }

    public static int upperbound(int arr[], int lb, int ub, int t) {

        int ans = arr.length;
        while (lb <= ub) {
            int mid = (lb + ub) / 2;
            if (arr[mid] > t) {
                ans = mid;
                ub = mid - 1;
            } else {
                lb = mid + 1;
            }
        }
        return ans;

    }
    public static int[] searchRange ( int arr[], int target){
        int n = arr.length;
        int lb = lowerbound(arr, 0, n - 1, target);
        int ub = upperbound(arr, 0, n - 1, target);
        int result[] = new int[2];
        if (lb == n || arr[lb] != target) {
            return new int[]{-1, -1};
        }
        return new int[]{lb, ub - 1};
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int target = s.nextInt();
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int[] ans = searchRange(arr, target);
        System.out.println(ans[0] + " " + ans[1]);

    }
}
