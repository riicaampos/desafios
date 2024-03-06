import java.util.ArrayList;
import java.util.List;

/**
 * Crie uma função que retorne true se houver pelo menos um número primo no intervalo fornecido ( n1to n2(inclusive)), falsecaso contrário.
 * <p>
 * Exemplos
 * PrimeNumberInRange(10, 15) ➞ true
 * // Prime numbers in range: 11, 13
 * <p>
 * PrimeNumberInRange(62, 66) ➞ false
 * // No prime numbers in range.
 * <p>
 * PrimeNumberInRange(3, 5) ➞ true
 * // Prime numbers in range: 3, 5
 * Notas
 * n2é sempre maior que n1.
 * n1e n2são sempre positivos.
 * 0 e 1 não são números primos.
 * <p>
 * EXEMPLO DE NUMERO PRIMO
 * <p>
 * por 11:  113 / 11 = 10, com resto 3. O quociente (10) é menor que o divisor (11),
 * e além disso o resto é diferente de
 * zero (o resto vale 3), portanto 113 é um número primo.
 */
public class numeros_primos {

    public static void main(String[] args) {

        encontrarPrimos(2, 40);
        pegarNumerosNaRange(2, 40);
    }

    public static void encontrarPrimos(Integer n1, Integer n2) {

        List<Integer> numerosPrimos = new ArrayList<>();

        for (Integer num : pegarNumerosNaRange(n1, n2)) {
            

        }

        numerosPrimos.forEach(System.out::println);
    }

    public static List<Integer> pegarNumerosNaRange(Integer n1, Integer n2) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = n1; i <= n2; i++) {
            numeros.add(i);
        }
        return numeros;
    }

}
