package cn.woodwhales.algorithm;

import cn.woodwhales.algorithm.util.ArrayTool;

import static cn.woodwhales.algorithm.util.ArrayTool.swap;

/**
 * @author woodwhales on 2021-08-03 21:27
 * @Description 冒泡排序
 */
public class BubbleSort {

    public static void sort(int[] arr) {
        if(arr == null || arr.length < 2) {
            return;
        }

        int N = arr.length;

        for (int i = N-1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j+1] < arr[j]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 6, 7, 0, 9, 4, 2, 8};
        ArrayTool.execute(arr, BubbleSort::sort);
    }

}
