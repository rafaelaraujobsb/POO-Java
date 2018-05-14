// Execício Array Bidimensional do livro JAVA COMO PROGRAMAR
// Classe usando Array Bidimensional para armazenar notas

public class LivroDeNotas{
    private String nomeCurso;
    private int[][] notas;

    // Construtor para inicializar os atributos
    public LivroDeNotas(String nomeCurso, int[][] notas){
        this.nomeCurso = nomeCurso;
        this.notas = notas;
    }

    // Método para setar o nome do curso
    public void setNomeCurso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    } 

    // Método para retornar o nome do curso
    public String getNomeCurso(){
        return nomeCurso;
    }

    // Realizar operações com os dados
    public void processarNotas(){
        mostrarNotas();

        // mostar a maior e menor nota
        System.out.printf("%n%s %d%n%s %d%n%n", "Menor nota: ", getMin(), 
            "Maior nota: ", getMax());

        // mostra o gráfico das notas de todos os testes
        mostrarGrafico();
    }

    // Método para buscar a menor nota
    public int getMin(){
        int min = notas[0][0];

        for(int[] aluno: notas){
            for(int nota: aluno){
                if(nota < min) min = nota;
            }
        }
        
        return min;
    }

    // Método para buscar a maior nota
    public int getMax(){
        int max = notas[0][0];

        for(int[] aluno: notas){
            for(int nota: aluno){
                if(nota > max) max = nota;
            }
        }
        
        return max;
    }

    // Método que define a média de um aluno
    public double getMedia(int[] notasAluno){
        int total = 0;

        for(int nota: notasAluno){
            total += nota;
        }
        return (double)total/notasAluno.length;
    }

    // Método para mostrar o gráfico das notas de todos os testes
    public void mostrarGrafico(){
        System.out.println("Distribuição das notas: ");

        // armazena frêq. de notas em cada intervalo de 10 notas
        int[] freq = new int[11];

        for(int[] notasAluno: notas){
            for(int nota: notasAluno){
                freq[nota]++;
            }
        }

        // para cada frêq. de notas imprime uma barra no gráfico
        for(int i = 0; i < freq.length; i++){
            System.out.printf("%d:", i);

            for(int ast = 0; ast < freq[i]; ast++)
                System.out.printf("*");

            System.out.println();
        }
    }

    // Método mara mostar as notas
    public void mostrarNotas(){
        System.out.printf("Notas:%n%n");
        System.out.print("         "); // alinha o título da coluna

        for(int prova=0; prova < notas[0].length; prova++)
            System.out.printf("Prova %d ", prova + 1);

        System.out.println("Média");

        // cria linhas/colunas comas notas
        for(int aluno = 0; aluno < notas.length; aluno++){
            System.out.printf("Aluno %2d ", aluno + 1);

            for(int nota: notas[aluno]){
                System.out.printf("%7d", nota);
            }

            System.out.printf("%8.2f%n", getMedia(notas[aluno]));
        }
    }
}