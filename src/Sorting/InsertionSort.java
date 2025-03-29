package Sorting;

public class InsertionSort {
  public static void main(String[] args) {
    int arr[] = {9, 11, 5, 2, 4, 7, 8};
    int size = arr.length;

    System.out.println("BEFORE SORTING");
    for (int num : arr) {
      System.out.print(num + " ");
    }

//    for (int i = 1; i < size; i++) {
//      int key = arr[i];
//      int j = i - 1;
//      while (j >= 0 && arr[j] > key) {
//        arr[j + 1] = arr[j];
//        j--;
//      }
//      arr[j + 1] = key;
//    }

    for(int i=0;i<arr.length;i++){
      for(int j=i;j>0;j--){
        if(arr[j]<arr[j-1]){
          swap(arr,j,j-1);
        }
      }
    }


    System.out.println();
    System.out.println("AFTER SORTING");
    for (int num : arr) {
      System.out.print(num + " ");
    }

  }
  private static int[] swap(int[] arr,int i,int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

    return arr;
  }
}
