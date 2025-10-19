public class ArvoreBinariaMorse {
    private Nodo raiz;

    public ArvoreBinariaMorse() {
        raiz = new Nodo('\0');
    }

    public void inserir(String codigo, char caractere) {
        Nodo atual = raiz;
        int i = 0;

        while (i < codigo.length()) {
            char simbolo = codigo.charAt(i);

            if (simbolo == '.') {
                if (atual.esquerda == null) {
                    atual.esquerda = new Nodo('\0');
                }
                atual = atual.esquerda;
            } else if (simbolo == '-') {
                if (atual.direita == null) {
                    atual.direita = new Nodo('\0');
                }
                atual = atual.direita;
            }
            i++;
        }

        atual.caractere = caractere;
    }

    public char buscar(String codigo) {
        Nodo atual = raiz;
        int i = 0;

        while (i < codigo.length()) {
            char simbolo = codigo.charAt(i);
            if (simbolo == '.') {
                if (atual.esquerda == null) return ' ';
                atual = atual.esquerda;
            } else if (simbolo == '-') {
                if (atual.direita == null) return ' ';
                atual = atual.direita;
            }
            i++;
        }

        return atual.caractere;
    }

    public void remover(String codigo) {
        Nodo atual = raiz;
        int i = 0;

        while (i < codigo.length()) {
            char simbolo = codigo.charAt(i);
            if (simbolo == '.') {
                if (atual.esquerda == null) return;
                atual = atual.esquerda;
            } else if (simbolo == '-') {
                if (atual.direita == null) return;
                atual = atual.direita;
            }
            i++;
        }

        atual.caractere = '\0';
    }

    public void exibir(Nodo nodo, int nivel) {
        if (nodo != null) {
            int i = 0;
            while (i < nivel) {
                System.out.print("  ");
                i++;
            }
            System.out.println("[" + (nodo.caractere == '\0' ? " " : nodo.caractere) + "]");
            exibir(nodo.esquerda, nivel + 1);
            exibir(nodo.direita, nivel + 1);
        }
    }

    public Nodo getRaiz() {
        return raiz;
    }
}
