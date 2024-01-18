import java.util.*;
//Tc - nlog n

public class MergeSort {
    public static void sort(int arr[], int start, int mid, int end) {
        int arr2[] = new int[end - start + 1];
        int i = 0;
        int ind1 = start;
        int ind2 = mid + 1;
        while (ind1 <= mid && ind2 <= end) {
            if (arr[ind1] <= arr[ind2]) {
                arr2[i] = arr[ind1];
                ind1++;
                i++;

            } else {
                arr2[i] = arr[ind2];
                ind2++;
                i++;
            }
        }
        while (ind1 <= mid) {
            arr2[i] = arr[ind1];
            i++;
            ind1++;
        }
        while (ind2 <= end) {
            arr2[i] = arr[ind2];
            i++;
            ind2++;
        }
        for (int j = 0,k=start; j < arr2.length; j++,k++) {
            arr[k] = arr2[j];
        }
    }

    public static void divide(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        sort(arr, start, mid, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int arr[] = new int[n];
        System.out.println("Enter the ele: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        divide(arr, 0, (n - 1));
        System.out.println();
        System.out.println("Array after sorting: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
