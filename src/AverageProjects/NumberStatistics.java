package AverageProjects;

import java.util.Scanner;

public class NumberStatistics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + i + ": ");
            nums[i] = sc.nextInt();
        }
        System.out.println("Positive numbers: " + calculatePositiveNums(nums));
        System.out.println("Negative numbers: " + calculateNegativeNums(nums));
        System.out.println("Zero numbers: " + calculateZeros(nums));
        System.out.println("Even numbers: " + calculateEvenNums(nums));
        System.out.println("Odd numbers: " + calculateOddNums(nums));


    }

    public static int calculatePositiveNums(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (num > 0){
                result++;
            }
        }
        return result;
    }public static int calculateNegativeNums(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (num < 0){
                result++;
            }
        }
        return result;
    }public static int calculateZeros(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (num == 0){
                result++;
            }
        }
        return result;
    }public static int calculateEvenNums(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (num % 2 == 0){
                result++;
            }
        }
        return result;
    }public static int calculateOddNums(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (num % 2 == 1){
                result++;
            }
        }
        return result;
    }
}
