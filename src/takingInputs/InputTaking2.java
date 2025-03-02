package takingInputs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputTaking2 {

    // When the size is not given and we are taking the input in form of string
    // Take the input in 1 line seperated by space

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

        String line = sc.nextLine();
        String[] tokens = line.split("\\s+");

        List<Integer> arr = new ArrayList<>();
        for(String token : tokens){
            try {
                arr.add(Integer.parseInt(token));
            }
            catch (NumberFormatException e){
                // Ignore
            }
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
