// Execício Array Bidimensional do livro JAVA COMO PROGRAMAR
// Testar a classe LivroDeNotas

public class Teste{
    public static void main(String[] args){
        int[][] notas = {{5, 6, 8},
            {2, 5, 9},
            {6, 6, 6},
            {7, 7, 10},
            {1, 0, 5},
            {0, 0, 0},
            {8, 9, 4},
            {6, 3, 10},
            {4, 5, 2},
            {10, 10, 10}};
        LivroDeNotas livro = new LivroDeNotas("ED1218 - Estrutura de dados", notas);

        System.out.printf("Bem vindo a %s%n%n", livro.getNomeCurso());
        livro.processarNotas();
    }
}