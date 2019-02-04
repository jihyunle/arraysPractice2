/*
Prompt the user to input 10 values and store them into an array.
If there are any duplicate values in that array, remove them and print out the remaining values.
        */
import java.util.Scanner;

public class checkDuplicates {
    public static void main(String[]args){

        // Initialize
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[10];
        int[] arr2 = new int[arr1.length];

        // Store ten values in array 1
        for (int i=0; i<arr1.length; i++){
            System.out.println("Please enter a number: ");
            int num = sc.nextInt();
            arr1[i] = num;
        }

        // Check for duplicates
        for (int i = 0; i<arr1.length; i++){
            boolean dupe = false;
            int index = 0;

            for (int j=i+1; j<arr1.length; j++){
                if (arr1[i]==arr1[j]){
                    System.out.println("Found duplicate entry at index " + i + " and " + j);
                    dupe = true;
//                    break;
                }
            }

            if (dupe==false){
//                arr2[index] = arr1[i];
//                index++;
                arr2[i]=arr1[i];
            }

        }

        // Print array 2 to check
        for (int i:arr2){
            System.out.println(i);
        }


    }
}

