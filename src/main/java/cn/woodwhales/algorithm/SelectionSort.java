package cn.woodwhales.algorithm;

import cn.woodwhales.algorithm.util.ArrayTool;

import static cn.woodwhales.algorithm.util.ArrayTool.swap;

/**
 * @author woodwhales on 2021-08-03 21:58
 * @Description 选择排序
 *
 * 从 0 - n-1 中选择最小的，放置到 0 位置
 * 从 1 - n-1 中选择最小的，放置到 1 位置
 * ...
 * 从 i - n-1 中选择最小的，放置到 i 位置
 * ...
 * 从 n-2 - n-1 中选择最小的，放置到 n-2 位置
 *
 */
public class SelectionSort {

    public static void sort(int[] arr) {
        if(arr == null || arr.length < 2) {
            return;
        }

        int N = arr.length;
        for(int i = 0; i < N; i++) {
            int minValueIndex = i;
            for(int start = i; start < N; start++) {
                minValueIndex = arr[start] < arr[minValueIndex] ? start : minValueIndex;
            }
            swap(arr, minValueIndex, i);
        }

    }

    public static void main(String[] args) {
        ArrayTool.execute(SelectionSort::sort);
    }

}
