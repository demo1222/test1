import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size from user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] arr = new int[size];

        // Get array elements from user
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate and print statistics
        int sum = calculateSum(arr);
        double average = calculateAverage(arr);
        int min = findMin(arr);
        int max = findMax(arr);
        int secondSmallest = findSecondSmallest(arr);
        int secondLargest = findSecondLargest(arr);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Smallest: " + min);
        System.out.println("Largest: " + max);
        System.out.println("Second Smallest: " + secondSmallest);
        System.out.println("Second Largest: " + secondLargest);

        scanner.close();
    }
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static double calculateAverage(int[] arr) {
        return (double) calculateSum(arr) / arr.length;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findSecondSmallest(int[] arr) {
        int smallest = findMin(arr);
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num > smallest && num < secondSmallest) {
                secondSmallest = num;
            }
        }

        return secondSmallest;
    }

    public static int findSecondLargest(int[] arr) {
        int largest = findMax(arr);
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }

        return secondLargest;
}}