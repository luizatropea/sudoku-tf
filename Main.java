import java.util.Scanner;

/**
 * Joao Pedro Petkov e Luiza Tropea Scaglia
 * 22180442 e 22104919
 */
class Main {

    /**
     * 
     */
    private Main() {}

    /**
     * 
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Sudoku jogo = new Sudoku();

        char coluna;
        char linha;
        char valor;

        while ( !jogo.fimDeJogo() ) {
            System.out.println("\t         Sudoku!");
            System.out.println("\t        =========");

            System.out.println( jogo.toString() );

            System.out.println("Informe a coluna");
            coluna = in.next().charAt(0);
            System.out.println("Informe a linha");
            linha = in.next().charAt(0);        
            System.out.println("Informe o valor");
            valor = in.next().charAt(0);        

            System.out.println("COLUNA = " + coluna);
            System.out.println(" LINHA = " + linha);
            System.out.println(" VALOR = " + valor);
            
            try {
                jogo.jogar(coluna, linha, valor);
            } catch (Exception e) {
                System.out.println("Jogada inválida!");
                System.out.println(e);
                
            }
            try {
                jogo.verificadorNumeros(numeroJaInserido, inseriuNumero, numerosSelecionados);
            } catch (Exception e) {
                System.out.println("Está errado!");
                System.out.println(e);
        }
        in.close();

        System.out.println("\f\t         Sudoku!");
        System.out.println("\t        =========");
        System.out.println( jogo.toString() );
        System.out.println("** FIM **");

    }
}
}