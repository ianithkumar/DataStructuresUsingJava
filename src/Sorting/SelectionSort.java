package Sorting;

import com.sun.security.jgss.GSSUtil;

public class SelectionSort {
  public static void main(String a[]){
    int arr[]  = {9,11,5,2,4,7,8};
    int size  = arr.length;
    int temp = 0;

    System.out.println("BEFORE SORTING");
    for(int num : arr){
      System.out.print(num+" ");
    }

    for(int i=0;i<size;i++){
      int minIndex = i;
      for(int j=i+1;j<size;j++){
        if(arr[minIndex] > arr[j]){
          minIndex = j;
        }
      }
      temp  = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }

    System.out.println();
    System.out.println("AFTER SORTING");
    for(int num : arr){
      System.out.print(num+" ");
    }
  }
}
