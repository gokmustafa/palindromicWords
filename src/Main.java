import java.util.Scanner;
public class Main
{

    static boolean isPalindrome(String str){
        int i = 0;
        int j = 0;

        while(i<j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }

            i++;
            j++;
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sayı giriniz: ");
        String text =input.nextLine();
        System.out.println(isPalindrome(text));
    }
}
