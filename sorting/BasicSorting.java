package sorting;

import java.util.*;

public class BasicSorting {
  // BUBBLE SORT
  public static void bubbleSort(int[] arr) {
    for (int turn = 0; turn < arr.length; turn++) {
      int swap = 0;
      for (int j = 0; j < arr.length - 1 - turn; j++) {
        if (arr[j] > arr[j + 1]) {
          // temp
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swap++;
        }
      }
      if (swap == 0) {
        System.out.println("No swap in turn " + turn);
        break;
      }
    }
  }

  // SELECTION SORT
  public static void selectionSort(int[] arr) {
    for (int turn = 0; turn < arr.length; turn++) {
      int minPos = turn;
      for (int j = turn + 1; j < arr.length; j++) {
        if (arr[minPos] > arr[j]) {
          minPos = j;
        }
      }
      // swap
      int temp = arr[minPos];
      arr[minPos] = arr[turn];
      arr[turn] = temp;
    }
  }

  // INSERTION SORT
  public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int curr = arr[i];
      int prev = i - 1;
      // finding out the currect position to insert
      while (prev >= 0 && arr[prev] > curr) {
        arr[prev + 1] = arr[prev];
        prev--;
      }
      // insertion
      arr[prev + 1] = curr;
    }
  }

  // COUNTING SORT
  public static void countingSort(int[] arr) {
    int largest = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      largest = Math.max(largest, arr[i]);
    }

    int[] count = new int[largest + 1];
    for (int i = 0; i < arr.length; i++) {
      count[arr[i]]++;
    }

    // sorting
    int j = 0;
    for (int i = 0; i < count.length; i++) {
      while (count[i] > 0) {
        arr[j] = i;
        j++;
        count[i]--;
      }
    }
  }

  public static void printArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    // BUBBLE SORT
    // int[] arr = { 5, 4, 1, 3, 2 };
    // bubbleSort(arr);
    // printArr(arr);

    // SELECTION SORT
    // int[] arr = { 5, 4, 1, 3, 2 };
    // selectionSort(arr);
    // printArr(arr);

    // INSERTION SORT
    // int[] arr = { 5, 4, 1, 3, 2 };
    // insertionSort(arr);
    // printArr(arr);

    // INBUILT SORT
    // Integer[] arr = { 5, 4, 1, 3, 2 };
    // Arrays.sort(arr);
    // Arrays.sort(arr, 0, 2);
    // Arrays.sort(arr, Collections.reverseOrder());
    // Arrays.sort(arr, 2, 5, Collections.reverseOrder());
    // printArr(arr);

    // COUNTING SORT
    int[] arr = { 1, 4, 1, 3, 2, 4, 3, 7 };
    countingSort(arr);
    printArr(arr);
  }
}
