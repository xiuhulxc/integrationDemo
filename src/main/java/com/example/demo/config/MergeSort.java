package com.example.demo.config;

import java.util.Arrays;

/**
 * @descriptions:
 * @author: Liu XuChao
 * @date: 2023/11/28 10:03
 * @version: 1.0
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("原始数组：");
        printArray(arr);

        int inversions = mergeSortAndCountInversions(arr, 0, arr.length - 1);

        System.out.println("\n排序后的数组：");
        printArray(arr);

        System.out.println("\n逆序对的个数为：" + inversions);
    }

    // 归并排序并计算逆序对数量
    private static int mergeSortAndCountInversions(int[] arr, int left, int right) {
        int inversions = 0;
        if (left < right) {
            int mid = (left + right) / 2;

            // 递归地对左半部分和右半部分进行归并排序，并累加逆序对数量
            inversions += mergeSortAndCountInversions(arr, left, mid);
            inversions += mergeSortAndCountInversions(arr, mid + 1, right);

            // 合并两个已排序的子数组，并统计逆序对数量
            inversions += merge(arr, left, mid, right);
        }
        return inversions;
    }

    // 合并两个子数组，并统计逆序对数量
    private static int merge(int[] arr, int left, int mid, int right) {
        int inversions = 0;

        // 创建临时数组来暂存合并后的结果
        int[] temp = new int[right - left + 1];

        int i = left; // 左子数组的起始索引
        int j = mid + 1; // 右子数组的起始索引
        int k = 0; // 临时数组的索引

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                // 若arr[i] > arr[j]，说明arr[i...mid]都大于arr[j]，因此构成逆序对
                temp[k++] = arr[j++];
                inversions += (mid - i + 1);
            }
        }

        // 将剩余元素复制到临时数组
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // 将临时数组的内容复制回原数组
        System.arraycopy(temp, 0, arr, left, temp.length);

        return inversions;
    }

    // 辅助方法：打印数组
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
