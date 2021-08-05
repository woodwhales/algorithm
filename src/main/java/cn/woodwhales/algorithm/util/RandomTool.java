package cn.woodwhales.algorithm.util;

import java.util.function.Supplier;

/**
 * @author woodwhales on 2021-08-05 9:20
 * @description 随机工具
 */
public class RandomTool {

    /**
     * 随机出现 double 随机数概率计数器
     * @param exceptRate 期望出现的概率
     * @param supplier 随机函数
     */
    public static void randomDoubleCounter(double exceptRate, Supplier<Double> supplier) {
        int times = 10_000_000;
        double count = 0;
        for (int i = 0; i < times; i++) {
            double random = supplier.get();
            if(random <= exceptRate) {
                count++;
            }
        }
        System.out.println("targetRate = " + exceptRate + " -> rate = " + count/times);
    }

    /**
     * 随机出现 int 随机数概率计数器
     * @param exceptRate 期望出现的概率
     * @param supplier 随机函数
     */
    public static void randomIntegerCounter(int exceptRate, Supplier<Integer> supplier) {
        int times = 10_000_000;
        double count = 0;
        for (int i = 0; i < times; i++) {
            int random = supplier.get();
            if(random == exceptRate) {
                count++;
            }
        }
        System.out.println("targetRate = " + exceptRate + " -> rate = " + count/times);
    }

    /**
     * 等概率出现 [minValue, maxValue] 的随机整数
     * @param minValue
     * @param maxValue
     */
    public static int randomInteger(int minValue , int maxValue) {
        int diff = maxValue - minValue;
        if(diff <= 0) {
            throw new IllegalArgumentException("参数非法");
        }

        return (int)(Math.random() * (diff + 1)) + minValue;
    }

    public static void main(String[] args) {
//        System.out.println("等概率出现 [0, 1)");
//        randomDoubleCounter(0.1, Math::random);
//        randomDoubleCounter(0.4, Math::random);
//        randomDoubleCounter(0.8, Math::random);
//
//        System.out.println();
//        System.out.println("等概率出现 [6, 11]");
//        randomIntegerCounter(6, () -> randomInteger(6, 11));
//        randomIntegerCounter(7, () -> randomInteger(6, 11));
//        randomIntegerCounter(8, () -> randomInteger(6, 11));
//        randomIntegerCounter(9, () -> randomInteger(6, 11));
//        randomIntegerCounter(10, () -> randomInteger(6, 11));
//        randomIntegerCounter(11, () -> randomInteger(6, 11));
//
//        System.out.println();
//        System.out.println("等概率出现 [1, 5]");
//        randomIntegerCounter(1, ()-> f1());
//        randomIntegerCounter(2, ()-> f1());
//        randomIntegerCounter(3, ()-> f1());
//        randomIntegerCounter(4, ()-> f1());
//        randomIntegerCounter(5, ()-> f1());
//
//        System.out.println();
//        System.out.println("利用不修改 f1() 函数, 设计出概率出现 [0, 7] 的 f3() 函数");
//        randomIntegerCounter(0, () -> f3());
//        randomIntegerCounter(1, () -> f3());
//        randomIntegerCounter(2, () -> f3());
//        randomIntegerCounter(3, () -> f3());
//        randomIntegerCounter(4, () -> f3());
//        randomIntegerCounter(5, () -> f3());
//        randomIntegerCounter(6, () -> f3());
//        randomIntegerCounter(7, () -> f3());

        ArrayTool.print(randomArray(5, 10));
        ArrayTool.print(randomArray(5, 10));
        ArrayTool.print(randomArray(5, 10));
        ArrayTool.print(randomArray(5, 10));
        ArrayTool.print(randomArray(5, 10));
        ArrayTool.print(randomArray(5, 10));
        ArrayTool.print(randomArray(5, 1));
    }

    /**
     * 等概率出现 1 - 5 数字
     * @return
     */
    public static int f1() {
        return (int)(Math.random() * 5) + 1;
    }

    /**
     * 利用 f1() 函数制作出等概率出现 0 或者 1 的函数
     *
     *  f1() 函数等概率生成 1，2，3，4，5
     *  当随机生成了 3 则重新生成，
     *  生成 1，2 返回 0
     *  生成 4，5 返回 1
     *
     * @return
     */
    public static int f2() {
        int ans = f1();

        // 只要等于 3 就重新随机生成
        while (ans == 3) {
            ans = f1();
        }

        return ans < 3 ? 0 : 1;
    }

    /**
     * 利用 f1() 和 f2() 函数制作出等概率出现 [0, 7] 的随机数
     * @return
     */
    public static int f3() {
        return (f2() << 2) + (f2() << 1) + (f2() << 0);
    }

    /**
     * 随机生成数组
     * @param maxLength 数组最大长度
     * @param maxValue 数组元素最大值
     * @return
     */
    public static int[] randomArray(int maxLength, int maxValue) {
        int len = (int)(Math.random() * (maxLength + 1));
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = (int)(Math.random() * (maxValue + 1));
        }
        return ans;
    }

}
