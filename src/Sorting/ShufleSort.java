package Sorting;

import java.util.Arrays;
import java.util.Random;

public class ShufleSort {
  public static void main(String[] args) {
    int[] arr = {4,5,7,2,3,6,8,1,0,12};
    System.out.println(Arrays.toString(shuffleSort(arr)));
  }
  private static int[] shuffleSort(int[] arr){
    Random rand = new Random();
    for(int i=0;i<arr.length;i++){
      int ramdom = rand.nextInt(i+1)+1;

      int temp = arr[i];
      arr[i] = arr[ramdom];
      arr[ramdom] = temp;

    }
    return arr;
  }
}
