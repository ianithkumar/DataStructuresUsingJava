package Sorting;

import java.util.Arrays;

public class ShellSort {
  public static void main(String[] args) {
    int arr[] = {9, 11, 5, 2, 4, 7, 8};

    int[] result = shellSort(arr);

    System.out.println(Arrays.toString(result));
  }
  public static int[] shellSort(int[] arr) {
    int N = arr.length;
    int h = 1;
    while (h < N / 3) h = 3 * h + 1; // 1, 4, 13, 40, 121, 364, ...
    while (h >= 1) {
      for(int i=h;i<N;i++){
        for(int j=i;j>=h && less(arr[j],arr[j-h]);j-=h){
          swap(arr,j,j-h);
        }
        h=h/3;
      }
    }
    return arr;
  }

  private static boolean less(int i, int j) {
    return j < i;
  }

  private static void swap(int[] arr,int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
