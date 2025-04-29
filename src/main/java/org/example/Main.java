package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     int[] nums = {3, 1, 5, 2, 1, 4};
     bubbleSort(nums); //{1,1,2,3,4,5}
        System.out.println(Arrays.toString(nums));
        int num1 = 1;
        int num2 = 2;

        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    /*
    31  5214
    1 35 214
    13 52 14
    132 51 4
    1321 54
    132145     | 5

    13 214
    1 32 14
    12 31 4
    121 34
    12134   | 4

    12 13
    1 21 3
    11 23 | 3

    112
     */
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int k = 0; k < nums.length - 1 - i; k++) {
                if (nums[k] > nums[k +1]) {
                    //swap
                    int temp = nums[k];
                    nums[k] = nums[k + 1];
                    nums[k + 1] = temp;
                }
            }
        }
    }

    /*
    315214
    135214
    115234
    112534
    112354
    112345
     */
    public static  void selectionSor(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int key = nums[i];
            for (int j = 0; i < nums.length; j++) {
                if (nums[j] < key) {
                    key = j;
                }
            }
            //swap nums[i] and nums [minIdx]
            int temp = nums[i];
            nums[i] = nums[key];
            nums[key] = temp;
        }
    }

    /*
    3   15214
    1   35214
    13  5214
    123 514
    11234 5
     */
    public static void insertSort(int[] nums) {
      for (int i = 0; i < nums.length; i++) {
          int key = nums[i];
          int j = i - 1;
          while (j >= 0 && nums[j] > key) {
              nums[j + 1] = nums[j];
              j--;
          }
          nums[j + 1] = key;
      }
    }
}
