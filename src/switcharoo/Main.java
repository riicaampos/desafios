package switcharoo;

/**
 * Crie uma função que receba uma string e retorne uma nova string com o primeiro e o último caracteres trocados, exceto sob duas condições:
 *
 * Se o comprimento da string for menor que dois, retorne "Incompatible.".
 * Se o primeiro e o último caracteres forem iguais, retorne "Two's a pair.".
 * Exemplos
 * flipEndChars("Cat, dog, and mouse.") ➞ ".at, dog, and mouseC"
 *
 * flipEndChars("ada") ➞ "Two's a pair."
 *
 * flipEndChars("Ada") ➞ "adA"
 *
 * flipEndChars("z") ➞ "Incompatible."
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(retornaString("Cat, dog, and mouse."));
        System.out.println(retornaString("ada"));
        System.out.println(retornaString("Ada"));
        System.out.println(retornaString("z"));
    }

    public static String retornaString(String s){

        if(s.length() < 2)
            return "Incompativel";

        if(s.charAt(0) == s.charAt(s.length()-1))
            return "Primeira letra igual a ultima";

        StringBuilder sb = new StringBuilder(s);

        char char1 = s.charAt(0);
        char char2 = s.charAt(s.length()-1);

        sb.setCharAt(0, char2);
        sb.setCharAt(s.length()-1,char1);

        return sb.toString();

    }
}
