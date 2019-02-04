import java.util.Scanner;

/*Write a program that will find the length of an input string without using the library function.*/
public class findStringLength {
    public static void main(String[]args){

        String str = "";
        // Ask user for input string
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        str = input.nextLine();

        // Given this string,
        int counter = 0;
        int space = 0;

        String[] ar = str.split("");
        for (String element:ar){
            if (!element.isEmpty()){
                counter++;
            }
            if (element.equals(" ")){
                space++;
            }
        }
        int charCount = counter-space;

        System.out.println("The length of the string is " + charCount);

    }
}
