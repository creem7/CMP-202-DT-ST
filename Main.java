import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String word = "exercise";
        String dumWord = "";
        int dumvalue = 0;
        char[] array = word.toCharArray();
        int length = array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[length - i - 1]) {
                dumvalue += 1;
            } //else {
                //dumvalue = 1;
            //}
        }
        if (dumvalue == array.length) {
            System.out.println("The word is a palindrome");
        } else {
            System.out.println("The word is not a palindrome");
        }
        }
    }
