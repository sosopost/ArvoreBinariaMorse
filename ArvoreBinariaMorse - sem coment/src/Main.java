import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArvoreBinariaMorse arvore = new ArvoreBinariaMorse();

        arvore.inserir(".-", 'A');
        arvore.inserir("-...", 'B');
        arvore.inserir("-.-.", 'C');
        arvore.inserir("-..", 'D');
        arvore.inserir(".", 'E');
        arvore.inserir("..-.", 'F');
        arvore.inserir("--.", 'G');
        arvore.inserir("....", 'H');
        arvore.inserir("..", 'I');
        arvore.inserir(".---", 'J');
        arvore.inserir("-.-", 'K');
        arvore.inserir(".-..", 'L');
        arvore.inserir("--", 'M');
        arvore.inserir("-.", 'N');
        arvore.inserir("---", 'O');
        arvore.inserir(".--.", 'P');
        arvore.inserir("--.-", 'Q');
        arvore.inserir(".-.", 'R');
        arvore.inserir("...", 'S');
        arvore.inserir("-", 'T');
        arvore.inserir("..-", 'U');
        arvore.inserir("...-", 'V');
        arvore.inserir(".--", 'W');
        arvore.inserir("-..-", 'X');
        arvore.inserir("-.--", 'Y');
        arvore.inserir("--..", 'Z');

        arvore.inserir("-----", '0');
        arvore.inserir(".----", '1');
        arvore.inserir("..---", '2');
        arvore.inserir("...--", '3');
        arvore.inserir("....-", '4');
        arvore.inserir(".....", '5');
        arvore.inserir("-....", '6');
        arvore.inserir("--...", '7');
        arvore.inserir("---..", '8');
        arvore.inserir("----.", '9');

        arvore.inserir("*", ' ');

        System.out.println("Busca '---': " + arvore.buscar("---"));
        System.out.println("Busca '...': " + arvore.buscar(".."));
        System.out.println("Busca '... --- ...': " +
                arvore.buscar("---") + arvore.buscar(".."));

        System.out.println("\nExibição da árvore:");
        arvore.exibir(arvore.getRaiz(), 0);

        System.out.println("\nRemovendo 'P' (.--.)");
        arvore.remover(".--.");
        System.out.println("Busca após remoção: " + arvore.buscar(".--."));

        Scanner sc = new Scanner(System.in);
        System.out.println("\nUse * para separar frases.");
        System.out.print("Digite uma mensagem em código Morse (separe letras com espaço): ");
        String entrada = sc.nextLine();

        String codigo = "";
        int i = 0;
        while (i < entrada.length()) {
            char c = entrada.charAt(i);
            if (c == ' ') {
                if (codigo.length() > 0) {
                    System.out.print(arvore.buscar(codigo));
                    codigo = "";
                }
            } else {
                codigo = codigo + c;
            }
            i++;
        }
        if (codigo.length() > 0) {
            System.out.print(arvore.buscar(codigo));
        }

        sc.close();
    }
}
