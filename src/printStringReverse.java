/*Write a program to print a string in reverse:
Eg: Welcome
emocleW*/
public class printStringReverse {
    public static void main(String[] args){
        /*
        * This top half is experimenting with exception handling
        * Proceed below for the problem*/
        int x = 10;
        int [] array = new int[x];
        // Exception (Error) Handling
        try {
            System.out.println(array[x]);
        } catch (Exception e) {
            System.out.println("We caught the ArrayIndexOutOfBoundsException error.");
        }

        /*
        * Main starts here*/
        System.out.println();

        // Get string
        String str = "watermelon";
        // Split into an array
        String [] letters = str.split("");
        System.out.println(str);

        String [] newArray = new String[str.length()];

        int lastIndex = letters.length-1;

        for (int i=lastIndex; i>=0; i--){
            String temp = letters[i];
            // add temp to new array in order
            int j = lastIndex - i;
            newArray[j] = temp;

        }

        String newStr = "";
        for (String a:newArray){
            newStr += a;
        }

        System.out.println(newStr);


    }
}
