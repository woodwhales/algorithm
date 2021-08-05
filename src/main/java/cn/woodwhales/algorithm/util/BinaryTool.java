package cn.woodwhales.algorithm.util;

/**
 * @author woodwhales on 2021-08-05 9:11
 * @description 二进制工具
 */
public class BinaryTool {

    /**
     * 打印一个 int 类型数值的二进制
     * @param num int 类型数值
     */
    public static void printBinary(int num) {
        System.out.print(num + "\t -> ");
        for(int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? 0 : 1);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printBinary(1);
        printBinary(2);
        printBinary(3);
        printBinary(8);
        printBinary(16);
        printBinary(-1);
        printBinary(Integer.MIN_VALUE);
    }

}
