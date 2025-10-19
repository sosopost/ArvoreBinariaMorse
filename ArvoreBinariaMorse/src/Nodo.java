public class Nodo {
    char caractere;
    Nodo esquerda; // ponto (.)
    Nodo direita;  // traço (-)

    public Nodo(char caractere) {
        this.caractere = caractere;
        this.esquerda = null;
        this.direita = null;
    }
}
