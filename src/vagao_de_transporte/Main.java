package vagao_de_transporte;

/**
 * Um trem tem uma capacidade máxima n total de passageiros, o que significa que a capacidade de cada vagão compartilhará uma proporção igual da capacidade máxima.
 *
 * Crie uma função que retorne o índice do primeiro carro que contém 50% ou menos de sua capacidade máxima. Se tal transporte não existir, retorne -1.
 *
 * Exemplos trabalhados
 * findSeat(200, [35, 23, 18, 10, 40]) ➞ 2
 * // There are 5 carriages which each have a maximum capacity of 40 (200 / 5 = 40).
 * // Index 0's carriage is too full (35 is 87.5% of the maximum).
 * // Index 1's carriage is too full (23 is 57.5% of the maximum).
 * // Index 2's carriage is good enough (18 is 45% of the maximum).
 * // Return 2.
 *
 *Por exemplo, para descobrir o equivalente em porcentagem de 40 em relação a 50: % = (40 ÷ 50) x 100
 *
 * Se um trem pode acomodar 200 passageiros e tem 5 vagões, isso significa que cada vagão pode acomodar no máximo 40 passageiros cada.
 * Todos os números de transporte serão números inteiros positivos, que poderão ser divididos igualmente.
 * Lembre-se de retornar -1se nenhum carro estiver vazio o suficient
 *
 */
public class Main {

    public static void main(String[] args) {
        Integer[] vagoes = {35, 23, 18, 10, 40};
        System.out.println(calcularCapacidade(200, vagoes));
    }

    public static String calcularCapacidade(Integer qntPassageiros, Integer[] vagoes){

        StringBuilder sb = new StringBuilder();

        Integer capacidadePorVagao = qntPassageiros/ vagoes.length;

        sb.append("O trem tem "+vagoes.length+" vagões com capacidade para "+capacidadePorVagao+" passageiros \n");


        for(int i = 0; i < vagoes.length; i++){
            if((double) vagoes[i] /40 > 0.5){
                sb.append("O vagão "+i+" esta cheio "+vagoes[i]+" é "+(((double) vagoes[i] /40 )*100)+" % \n");
            }else{
                sb.append("O vagão "+i+" esta bom para viajar "+vagoes[i]+" é "+(((double) vagoes[i] /40 )*100)+" % \n");
            }
        }
     return sb.toString();
    }
}
