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

    public static <T> void printArr(T[] arr) {
        for (T target : arr) {
            System.out.println(target);
        }
        System.out.println();
    }

    /**
     * 校验 arr 是否为从小到大排序的数组
     * @param arr 已排序的数组
     * @return
     */
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

    /**
     * 执行排序并校验排序函数是否正确
     * @param maxLength 随机数组最大长度
     * @param maxValue 随机数组元素最大值
     * @param times 生成随机函数次数
     * @param consumer 排序函数
     */
    public static void executeAndCheckSorted(int maxLength, int maxValue, int times,
                                             Consumer<int[]> consumer) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            int[] arr = RandomTool.randomArray(maxLength, maxValue);
            consumer.accept(arr);
            isSorted(arr);
        }

        System.out.println("执行并校验数组完成, 耗时：" + (System.currentTimeMillis() - start) + " ms");
    }

}
