import java.util.Scanner;

public class Insertionsort {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is: ");
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
        //insertion sort
        for (int i = 1; i < n; i++) {
            int temp = arr[i];   // 1st ele of the unsorted arr
            int j = i-1;         //for sorted part(j)
            while(j >= 0 && temp < arr[j]){    //if ele of the unsorted arr is less then the sorted one then shift
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;     // after the loop end the val of j will be one index less hence there is a need to add one 
        }

        System.out.println();
        System.out.println("Sorted array is: ");
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
    }
}
