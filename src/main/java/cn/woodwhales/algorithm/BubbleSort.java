package cn.woodwhales.algorithm;

import cn.woodwhales.algorithm.util.ArrayTool;

import static cn.woodwhales.algorithm.util.ArrayTool.swap;

/**
 * @author woodwhales on 2021-08-03 21:27
 * @Description 冒泡排序
 *
 * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 *
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 *
 * 针对所有的元素重复以上的步骤，除了最后一个。
 *
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 *
 */
public class BubbleSort {

    public static void sort(int[] arr) {
        if(arr == null || arr.length < 2) {
            return;
        }

        int N = arr.length;

        for (int i = N-1; i >= 0; i--) {
            for (int second = 1; second <= i; second++) {
                if(arr[second] < arr[second -1]) {
                    swap(arr, second, second - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayTool.execute(BubbleSort::sort);
    }

}
