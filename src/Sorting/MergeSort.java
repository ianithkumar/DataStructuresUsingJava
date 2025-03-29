package Sorting;

import java.util.ArrayList;



public class MergeSort {
  private static void mergeSort(int[] arr,int l,int r){
    if(l<r){
      int mid = (l+r)/2;
      mergeSort(arr,l,mid);
      mergeSort(arr,mid+1,r);

      merge(arr,l,mid,r);
    }
  }

  private static void merge(int[] arr, int low, int mid, int high) {
    ArrayList<Integer> temp = new ArrayList<>();
    int left = low;
    int right = mid + 1;

    while (left <= mid && right <= high) {
      if (arr[left] <= arr[right]) {
        temp.add(arr[left]);
        left++;
      } else {
        temp.add(arr[right]);
        right++;
      }
    }


    while (left <= mid) {
      temp.add(arr[left]);
      left++;
    }

    while (right <= high) {
      temp.add(arr[right]);
      right++;
    }


    for (int i = low; i <= high; i++) {
      arr[i] = temp.get(i - low);
    }
    }

  public static void main(String a[]) {
    int arr[] = {9, 11, 5, 2, 4, 7, 8};
    System.out.println("Before Sorting");
    for(int num:arr){
      System.out.print(num+" ");
    }
    System.out.println();
    mergeSort(arr,0,arr.length-1);
    System.out.println("After Sorting");
    for(int num:arr){
      System.out.print(num+" ");
    }
  }
}
