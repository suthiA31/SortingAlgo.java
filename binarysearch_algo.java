package September;

import java.util.Arrays;
import java.util.Scanner;

public class binarysearch {
        public static int bin (int arr[], int t, int low, int high){
            if (low > high) {
                return -1; // Target not found
            }
            int mid=(low+high)/2;
            if(arr[mid]==t){
                return mid;
            }
            else if(arr[mid]<t){
                return bin(arr, t , mid+1,high);
            }
            else{
                return bin(arr, t, low, mid-1);
            }

        }
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int arr[] = new int[n];
        int target= s.nextInt();
        for(int i =0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        int result = bin(arr,target,0,n-1);
        if(result==-1)
            System.out.println("notfound");
        else{
            System.out.println("found"+result);
        }
    }
}
