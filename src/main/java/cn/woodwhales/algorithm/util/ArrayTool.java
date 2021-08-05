package cn.woodwhales.algorithm.util;

import java.util.function.Consumer;

/**
 * @author woodwhales on 2021-08-03 22:00
 * @Description 数组工具
 */
public class ArrayTool {

    public static void swap(int[] arr, int i, int j) {
        if(i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] execute(int[] arr, Consumer<int[]> consumer) {
        print(arr);
        consumer.accept(arr);
        print(arr);
        return arr;
    }

    public static int[] execute(Consumer<int[]> consumer) {
        int[] arr = {3, 1, 5, 6, 7, 0, 9, 4, 2, 8};
        System.out.print("原始数组 -> ");
        print(arr);
        consumer.accept(arr);
        System.out.print("排序数组 -> ");
        print(arr);
        return arr;
    }

    public static void print(int[] arr) {
        for (int target : arr) {
            System.out.print(target + " ");
        }
        System.out.println();
    }

    public static boolean isSorted(int[] arr) {
        if(arr.length < 2) {
            return true;
        }

        int [] temp = new int[arr.length];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        for (int i = 1; i < temp.length; i++) {
            if(arr[i] < arr[i-1]) {
                System.out.print("排序失败，原始数组 -> ");
                print(arr);
                return false;
            }
        }
        return true;
    }
}
