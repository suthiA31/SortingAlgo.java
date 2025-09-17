package September;

import java.util.Scanner;

public class sortalgo {
  public static  void select(int arr[],int n){
        for(int i =0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void bubble(int arr[],int n){
      for(int i=n-1;i>=0;i--){
          for (int j =0;j<i;j++){
              if(arr[j]>arr[j+1]){
                  int temp =arr[j+1];
                  arr[j+1]=arr[j];
                  arr[j]=temp;
              }
          }
      }
    }
    public static void insertion(int arr[],int n){
      for(int i=0;i<n;i++){
          int j =i;
          while(j>0 &&arr[j]<arr[j-1]){
              int temp =arr[j-1];
              arr[j-1]=arr[j];
              arr[j]= temp;
              j--;
          }
      }
    }
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++) {
            arr[i] = s.nextInt();

        }
//        select(arr,n);
//        bubble(arr,n);
        insertion(arr,n);

        for(int i =0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
        }





}
