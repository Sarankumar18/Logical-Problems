package com.java.DSA;

public class BinarySearch {

  public static void main(String[] args) {
    int[] ints = {1, 2, 4, 5, 7, 9, 1,12};

    System.out.println("10 is at position: " + binarySearch(ints, 12));

  }

  private static int binarySearch(int[] numbers, int numberToFind) {
    int low = 0;
    int high = numbers.length - 1;

    while (low <= high){
      int middlePosition = (low + high) / 2;
      int middleNumber = numbers[middlePosition];

      if (numberToFind == middleNumber){
        return middlePosition;
      }
      if (numberToFind < middleNumber){
        high = middlePosition - 1;
      }
      else {
        low = middlePosition + 1;
      }
    }
    return -1;
  }
}