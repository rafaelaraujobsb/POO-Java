// Exercício do livro JAVA COMO PROGRAMAR
// Testar o embaralhamento e a distribuição

public class DeckTeste{
    public static void main(String[] args) {
        DeckDeCartas meuDeck = new DeckDeCartas();
        meuDeck.shuflle(); // embaralha

        // imprime todas as 52 cartas
        for(int i = 1; i <= 52; i++){
            System.out.printf("%-19s", meuDeck.dstrbCarta());

            if(i%4 == 0) System.out.println(); // gerar linha após 4 cartas
        }
    }
}