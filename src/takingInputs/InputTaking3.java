package takingInputs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputTaking3 {

    // When the size is not given and we are taking the input
    // Input format: Keep entering the values and press enter after each value and then at last press ctrl+D to signal the end of input taking

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

        List<Integer> arr = new ArrayList<>();
        while (sc.hasNextInt()){
            arr.add(sc.nextInt());
        }

        int n = arr.size();
        int[] Array = new int[n];
        for(int i = 0; i < n; i++){
            Array[i] = arr.get(i);
        }
        arr = null;
        printingArray(Array, n);
        System.out.println("Sum: " + add(Array, n));
    }
}
