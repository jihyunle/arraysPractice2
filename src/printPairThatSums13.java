/*Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
Write a program that will print out all pairs from arrays 1 and 2 that gives a sum of 13:
(6,7), (9,4)
*/
public class printPairThatSums13 {
    public static void main(String[]args){
        int[] arr1 = {1,7,6,5,9};
        int[] arr2 = {2,7,6,3,4};

        for (int a:arr1){
            for (int b:arr2){
                if (a+b==13){
                    System.out.println("(" + a + "," + b + ")");
                }
            }
        }

    }
}
