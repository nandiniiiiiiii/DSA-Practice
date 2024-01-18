import java.util.*;

public class Array {
    public static void search(int[] arr, int a, int size) {
        int var = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == a) {
                var = i;
            }
        }
        if(var == -1){
            System.out.println("Number not found");
        }
        else{
            System.out.println("Number found at index: "+var);
        }
    }

    public static int checkArray(int[] arr,int n){
        for(int i=0;i<n;i++){
            if(arr[i+1] < arr[i]){
                return 1;
            }
        }
        return 0 ;
    }

    public static void reverse(int[] arr,int n){
        int m = Math.floorDiv(n, 2);
        for(int i=0;i<m;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.println("reversed array is:");
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the values int the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nEnter the element to be searched: ");
        int a = sc.nextInt();

        search(arr, a, size);
        int num = checkArray(arr,size);
        if(num == 1){
            System.out.println("It is not sorted");
        }else{
            System.out.println("it is sorted");
        }
        reverse(arr, size);

        //Array operations
        // arr.length
        // to print alll the ele in an array(useing foreach loop): 
        // for(int element: Arr){
        //     Sourt(Arr);
        // }
    }

    public static void sort(String[] strs) {
    }
}
