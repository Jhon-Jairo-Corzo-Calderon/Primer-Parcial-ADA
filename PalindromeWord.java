import java.util.Scanner;

public class PalindromeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word ;
        boolean loop= true, palindrome;
        System.out.println("Ingrese la cantidad de palabras (NUMERO ENTERO) a evaluar:");

        for (int i = sc.nextInt(); i > 0; i--) {
            System.out.println("Ingrese palabra para verificar si es polindroma: ");
            word = sc.next();
            palindrome = isPalindrome(word);
            if(palindrome )
                System.out.println( word + " es palindrome");
            else
                System.out.println( word + " NO es palindrome");
        }

    }
    public static boolean isPalindrome(String word){


        return true;
    }

}
