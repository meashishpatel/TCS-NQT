package takingInputs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputTaking4MostUsed {

    // When the size is not given and we are taking the input as string
    // Input format: Works on any format in single line like - [1,2,3,4,5] or [1,,4] or 1,2,3,4,5

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

        List<Integer> arr = new ArrayList<>();
        StringBuilder numStr = new StringBuilder();

        for(char ch : line.toCharArray()){
            if(Character.isDigit(ch)){
                numStr.append(ch);
            }
            else if (numStr.length() > 0){
                arr.add(Integer.parseInt(numStr.toString()));
                numStr.setLength(0);
            }
        }

        if(numStr.length() > 0){
            arr.add(Integer.parseInt(numStr.toString()));
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
