package Sorting;

import java.util.Arrays;

public class CyclicSort {
  public static void main(String[] args){
    int[] arr = {3,5,2,1,4};
    cyclicSort(arr);
    System.out.println(Arrays.toString(arr));
  }
  static void cyclicSort(int[] arr){
    int i=0;
    while(i<arr.length){
      int correctindex = arr[i]-1;
      if(arr[i]!=arr[correctindex]){
        swap(arr,i,correctindex);
      } else{
        i++;
      }
    }
  }
  static void swap(int[] arr,int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
