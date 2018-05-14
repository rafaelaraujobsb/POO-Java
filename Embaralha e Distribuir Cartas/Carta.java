// Classe Carta representa uma carta do baralho

public class Carta{
    private final String face; // face da carta(Ás, Dois, Três...)
    private final String naipe; // naipe das carta(Ouro, Copa, Espada, Paus)

    // construtor de dois argumentos que inicializa face e naipe
    public Carta(String face, String naipe){
        this.face = face;
        this.naipe = naipe;
    }

    // retorna representação String da carta
    public String toString(){
        return face + " de " + naipe;
    }
}