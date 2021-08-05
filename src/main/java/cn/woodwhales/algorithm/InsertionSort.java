package cn.woodwhales.algorithm;

import cn.woodwhales.algorithm.util.ArrayTool;

import static cn.woodwhales.algorithm.util.ArrayTool.executeAndCheckSorted;
import static cn.woodwhales.algorithm.util.ArrayTool.swap;

/**
 * @author woodwhales on 2021-08-04 9:31
 * @description 插入排序
 *
 * 以打扑克为例：
 * 桌面上的一堆牌是无序的，从桌面上一张张抽取，并拿到手中。
 *
 * 每来一张新抓取的牌，放置到手中已排序好的牌的末尾
 * 再将新抓取的牌从末尾依次比较，遇到比自己大的牌，俩者交换位置，否则不交换位置。
 *
 * 继续抓取新的牌，重复上述步骤。
 *
 */
public class InsertionSort {

    public static void sort(int[] arr) {
        if(arr == null || arr.length < 2) {
            return;
        }

        int N = arr.length;
        for(int i = 1; i < N; i++) {
            for(int pre = i - 1; pre >= 0 && arr[pre] > arr[pre + 1]; pre--) {
                swap(arr, pre, pre + 1);
            }
        }

    }

    public static void main(String[] args) {
        executeAndCheckSorted(100, 100, 1000, InsertionSort::sort);
    }

}
