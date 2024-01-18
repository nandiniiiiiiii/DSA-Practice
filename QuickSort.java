import java.util.*;

public class QuickSort {
    public static int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int i = low-1;

        for (int j = low; j < high; j++) {
            if(arr[j] < pivot){
                i++;
                //swap
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
            }
        }
        //this is the else part
        i++;
        int tem = arr[i];
        arr[i] = pivot;
        arr[high] = tem;
        return i;
    }
    public static void divide(int arr[],int low,int high){
        if(low < high){
            int  part = partition(arr, low, high);

            divide(arr, low, part-1);
            divide(arr, part+1, high);
        }
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
        divide(arr,0, arr.length-1);
        System.out.println();
        System.out.println("Array after sorting: ");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}