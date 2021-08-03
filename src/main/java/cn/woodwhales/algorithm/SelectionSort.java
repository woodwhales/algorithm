package cn.woodwhales.algorithm;

import cn.woodwhales.algorithm.util.ArrayTool;

import static cn.woodwhales.algorithm.util.ArrayTool.swap;

/**
 * @author woodwhales on 2021-08-03 21:58
 * @Description 选择排序
 */
public class SelectionSort {

    public static void sort(int[] arr) {
        if(arr == null || arr.length < 2) {
            return;
        }


    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 6, 7, 0, 9, 4, 2, 8};
        ArrayTool.execute(arr, SelectionSort::sort);
    }

}
