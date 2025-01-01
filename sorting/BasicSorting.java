package sorting;

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

  public static void printArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    // BUBBLE SORT
    int[] arr = { 5, 4, 1, 3, 2 };
    bubbleSort(arr);
    printArr(arr);
  }
}
