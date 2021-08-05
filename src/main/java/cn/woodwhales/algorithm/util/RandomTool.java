package cn.woodwhales.algorithm.util;

/**
 * @author woodwhales on 2021-08-05 9:20
 * @description 随机工具
 */
public class RandomTool {

    /**
     * 证明 Math.random() 等概率出现 [0, 1) 随机数
     * @param exceptRate 期望概率
     */
    public static void random(double exceptRate) {
        int times = 100000000;
        double count = 0;
        for (int i = 0; i < times; i++) {
            double random = Math.random();
            if(random <= exceptRate) {
                count++;
            }
        }
        System.out.println("targetRate = " + exceptRate + " -> rate = " + count/times);
    }

    public static void main(String[] args) {
        random(0.9);
        random(0.6);
        random(0.5);
    }
}
