package cn.woodwhales.algorithm.comparator;

import cn.woodwhales.algorithm.util.ArrayTool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author woodwhales on 2021-08-09 20:38
 * @Description
 */
public class ComparatorExample {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 7, 8, 2, 5, 6, 9, 0, 2};
        ArrayTool.print(arr);
        Arrays.sort(arr);
        ArrayTool.print(arr);

        System.out.println("=====");

        Student stu1 = new Student(1, "A", 10);
        Student stu2 = new Student(5, "F", 12);
        Student stu3 = new Student(4, "D", 18);
        Student stu4 = new Student(3, "C", 13);
        Student stu5 = new Student(2, "B", 17);
        Student[] stus = new Student[]{stu1, stu2, stu3, stu4, stu5};

//        sortStudent1(stus);
//        sortStudent2(stus);
        sortStudent3(stus);
        ArrayTool.printArr(stus);

        System.out.println("=====");
        sortStudent4(stus);

        System.out.println("=====");
        heapSort();
    }

    /**
     * PriorityQueue 的 peek() 函数只回返队列中最小的元素值
     * poll() 函数每次只弹出队列中最小的元素
     *
     */
    private static void heapSort() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(3);
        priorityQueue.add(5);
        priorityQueue.add(1);
        System.out.println(priorityQueue.peek());
        priorityQueue.add(4);
        System.out.println(priorityQueue.peek());
        priorityQueue.add(0);
        System.out.println(priorityQueue.peek());
        priorityQueue.add(2);
        System.out.println(priorityQueue.peek());

        System.out.println("弹出队列");
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }

    /**
     * 使用 ArrayList 的 sort() 方法进行排序
     * @param stus
     */
    private static void sortStudent4(Student[] stus) {
        ArrayList<Student> arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(stus));
        arrayList.sort(Comparator.comparingInt(Student::getId));
        arrayList.stream().forEach(System.out::println);
    }

    /**
     * 根据 id 逆序排序
     * @param stus
     */
    private static void sortStudent3(Student[] stus) {
        Arrays.sort(stus, (stu1, stu2 ) -> {
            if(stu1.id < stu2.id) {
                return 1;
            } else if (stu1.id > stu2.id) {
                return -1;
            } else {
                return 0;
            }
        });
    }

    /**
     * 根据 id 正序排序
     * @param stus
     */
    private static void sortStudent2(Student[] stus) {
        Arrays.sort(stus, Comparator.comparingInt(stu -> stu.id));
    }

    /**
     * 因为 Student 没有实现 Comparable 接口，所以不能直接排序
     * 执行会报错：cn.woodwhales.algorithm.compator.Student cannot be cast to java.lang.Comparable
     * @param stus
     */
    private static void sortStudent1(Student[] stus) {
        Arrays.sort(stus);
    }

}
