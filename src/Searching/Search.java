package Searching;

public class Search {
  public static void main(String a[]) {
    int arr[] = {2, 4, 5, 7, 9, 11, 13, 14};
    int search = 11;
    int left = 0;
    int right = arr.length;
    //int result = LinearSearch(arr, search);
    //int result = BinarySearch(arr,search,left,right);
    int result = BinarySearchUsingRecursion(arr, search, left, right);
    if (result >= 0) {
      System.out.println("The Element Found At Index " + result);
    } else {
      System.out.println("Element Not Found");
    }
  }

  private static int LinearSearch(int arr[], int search) {
    System.out.println("Using LinearSearch");
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == search) {
        return i;
      }
    }
    return -1;
  }

  private static int BinarySearch(int arr[], int search, int left, int right) {
    System.out.println("Using BinarySearch");
    while (left <= right) {
      int mid = (left + right) / 2;
      if (arr[mid] == search) {
        return mid;
      } else if (arr[mid] < search) {
        left = mid + 1;
      } else
        right = mid - 1;
    }
    return -1;
  }

  private static int BinarySearchUsingRecursion(int arr[], int search, int left, int right) {
    if (left <= right) {
      int mid = (left + right) / 2;
      if (arr[mid] == search) {
        return mid;
      } else if (arr[mid] < search) {
        return BinarySearchUsingRecursion(arr, search, mid + 1, right);
      } else
        return BinarySearchUsingRecursion(arr, search, left, mid - 1);
    }
    return -1;
  }

}

