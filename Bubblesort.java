import java.util.Scanner;

public class Bubblesort {
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
            System.out.println(ele);
        }
        int flag = 0;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j<n-i-1 ;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0){
                System.out.println("Array already sorted");
                break;
            }
        }
        System.out.println("Sorted array is: ");
        for (int ele : arr) {
            System.out.println(ele);
        }
    }
}
