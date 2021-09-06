import java.util.Scanner;

public class PalindromeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word ;
        boolean palindrome;

        System.out.println("Ingrese la cantidad de palabras (NUMERO ENTERO) a evaluar:");

        for (int i = sc.nextInt(); i > 0; i--) {
            System.out.println("Ingrese palabra para verificar si es polindroma: ");
            word = sc.next();
            palindrome = isPalindrome(word);
            if(palindrome)
                System.out.println( word + " es palindrome");
            else
                System.out.println( word + " NO es palindrome");
        }

    }
    public static boolean isPalindrome(String word){

        String wordFHalf = (word.length()%2 == 0) ? word.substring(0, word.length()/2) : word.substring(0, word.length()/2); //Primera mitad de la palabra
        String wordSHalf = (word.length()%2 == 0) ? word.substring(word.length()/2) : word.substring(word.length()/2+1); //Segunda mitad de la palabra

        if(wordFHalf.equals(wordSHalf))
            return true;

        char[] wordSReverse = wordSHalf.toCharArray();
        wordSHalf = "";

        for (int i = wordSReverse.length - 1; i >= 0; i--)
            wordSHalf += wordSReverse[i];

         if(wordFHalf.equals(wordSHalf))
            return  true;

        return false;
    }

}
