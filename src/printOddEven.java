/*Prompt the user to input 10 values and store them into an array.
Output the total number of odd and even values in the array.*/
import java.util.Scanner;

public class printOddEven {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] arrOdd = new int[10];
        int[] arrEven = new int[10];
        int n;

        for (int i=0; i<arr.length; i++){
            System.out.println("Please enter a number: ");
            n = sc.nextInt();
            if (n%2==0){
                arrEven[i] = n;
            } else {
                arrOdd[i] = n;
            }
        }

        int sumOdd = 0;
        for (int num:arrOdd){
           sumOdd += num;
        }
        System.out.println("Sum of odd numbers in array: " + sumOdd);

        int sumEven = 0;
        for (int num:arrEven){
            sumEven += num;
        }
        System.out.println("Sum of even numbers in array: " + sumEven);
    }
}
