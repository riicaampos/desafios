package rock_papper_scissor;

/**
 * Criar uma função que simule o jogo pedra papel e tesoura, regras:
 *  Retornar qual jogador venceu
 *  Em caso de escolherem igual, empate
 *  Pedra vence a tesoura, o papel vence a pedra, a tesoura vence o papel.
 */

public class Main {

    public static void main(String[] args) {

        Jogador jogador1 = new Jogador(1,"pedra");
        Jogador jogador2 = new Jogador(2,"papel");

        System.out.println(verificaJogo(jogador1,jogador2));
    }


    public static String verificaJogo(Jogador j1, Jogador j2){

        if(j1.jogada.equals(j2.jogada))
            return "empate";

        if(j1.jogada.equals("pedra") && j2.jogada.equals("tesoura"))
            return "Jogador 1 venceu!";

        if(j1.jogada.equals("papel") && j2.jogada.equals("pedra"))
            return "Jogador 1 venceu!";

        if(j1.jogada.equals("tesoura") && j2.jogada.equals("papel"))
            return "Jogador 1 venceu!";

        return "jogador 2 venceu";

    }

    public static class Jogador{
        Integer player;
        String jogada;

        public Jogador(Integer player, String jogada){
            this.player = player;
            this.jogada = jogada;
        }
    }

}
