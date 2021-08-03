package cn.woodwhales.algorithm.util;

import java.util.function.Consumer;

/**
 * @author woodwhales on 2021-08-03 22:00
 * @Description
 */
public class ArrayTool {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void execute(int[] arr, Consumer<int[]> consumer) {
        print(arr);
        consumer.accept(arr);
        print(arr);
    }

    public static void print(int[] arr) {
        for (int target : arr) {
            System.out.print(target + " ");
        }
        System.out.println();
    }

}
