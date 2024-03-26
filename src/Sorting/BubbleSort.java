package Sorting;

public class BubbleSort {
  public static void main(String a[]){
    int arr[] = {9,11,5,2,4,7,8};
    int size  = arr.length;
    int temp = 0;

    System.out.println("BEFORE SORTING");
    for(int num : arr){
      System.out.print(num+" ");
    }

    for(int i=0;i<size-1;i++){
      for(int j=0;j<size-i-1;j++){
        if(arr[j]>arr[j+1]){
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    System.out.println();
    System.out.println();
    System.out.println("AFTER SORTING");
    for(int num : arr){
      System.out.print(num+" ");
    }

  }
}
