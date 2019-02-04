import java.util.Scanner;

public class prac {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);

        int[] arr1 = new int[10];
        String[] strArr1 = {"","","","","","","","","",""};
        boolean isDuplicate;
        System.out.print("Enter input : ");
        int count = 0;
        for (int i = 0; i <arr1.length ; i++) {
            isDuplicate = false;
            input =keyboard.next();
            for(String s : strArr1){
                if(input.equals(s)){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                strArr1[count] = input;
                count++;
            }
        }

        for (String str: strArr1) {
            System.out.print(str + ", ");
        }

    }
}
