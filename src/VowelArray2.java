import java.util.*;

public class VowelArray2 {

    char[] vowels = {'a','u','i','e','o'};
    void check_vowels(int char_input){
        boolean check = true;
        for(char ele : vowels){
            if (ele == char_input || ((int) char_input) + 32 == ((int) ele)){
                check = false;
                System.out.println("is a vowel");
            }
        }
        if(check){
            System.out.println("is not a vowel");
        }
    }

    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        var vowelob = new VowelArray2();

        System.out.print("enter a char ");
        char character = scanObj.next().charAt(0);
        vowelob.check_vowels(character);

    }
}
