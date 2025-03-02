package takingInputs;

import java.util.Scanner;

public class InputTaking {

    // When the size of the array is determined and given

    public static void printingArray(int[] arr, int n){
        for(int i = 0; i < n; i ++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int add(int[] arr, int n){

        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();
        }
        printingArray(arr, n);
        System.out.println("Sum: " + add(arr, n));
    }
}
