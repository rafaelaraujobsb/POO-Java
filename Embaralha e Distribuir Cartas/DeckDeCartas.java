//Classe DeckDeCartas representa o baralho

import java.security.SecureRandom;

public class DeckDeCartas{
    private Carta[] deck; // array de objetos Carta
    private int cartaAtual; // index da próxima Carta a ser distribuída (0-51)
    private static final int NUMERO_DE_CARTAS = 52; // número constante de cartas 

    // gerador de números aleatório
    private static final SecureRandom aleatNum = new SecureRandom();

    // construtor para preencher o baralho
    public DeckDeCartas(){
        String[] faces = {"Ás", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito",
            "Nove", "Dez", "Valete", "Rainha", "Rei"};
        String[] naipes = {"Copas", "Ouro", "Paus", "Espadas"};

        deck = new Carta[NUMERO_DE_CARTAS]; // criando o array de objetos Carta
        cartaAtual = 0; // a primeira carta a ser distribuida sera o deck[0]

        // preenche o baralho com objetos Carta
        for(int i = 0; i < deck.length; i++)
            deck[i] = new Carta(faces[i%13], naipes[i/13]);
    }

    // embaralhar as cartas
    public void shuflle(){
        // toda vez que embaralhar deve começar em deck[0]
        cartaAtual = 0;
        
        // para cada Carta, seleciona uma aleatória e troca
        for(int primeira = 0; primeira < deck.length; primeira++){
            // gerando o número aleatório
            int segunda = aleatNum.nextInt(NUMERO_DE_CARTAS);

            // troca
            Carta temp = deck[primeira];
            deck[primeira] = deck[segunda];
            deck[segunda] = temp;
        }
    }

    // distribuir cartas
    public Carta dstrbCarta(){
        // verifica se ainda tem cartas para distribuir
        if(cartaAtual < deck.length)
            return deck[cartaAtual++]; // retorna Carta atual 
        else
            return null; // retorna nulo para indicar que todas foram distribuidas
    }
}