# Sistema de Gerenciamento de Atendimento ao Cliente em Java (Fila e Pilha)
- **Disciplina:** Resolução de Problemas Estruturados em Computação
- **Instituição:** Pontifícia Universidade Católica do Paraná    
- **Professor:** Andrey Cabral Meira
- **Alunos:**  
  - Gustavo Ferronatto Ribeiro — [@gustavoferronattoribeiro](https://github.com/gustavoferronattoribeiro)
  - Sophia Post Ploposki — [@sosopost](https://github.com/sosopost)  
  - Victor Augusto Esmaniotto — [@Vitinnn123](https://github.com/Vitinnn123) 
---

## Objetivo
Este projeto desenvolve uma árvore binária que representa o alfabeto do código Morse. Cada nó armazena um símbolo (letra ou número), onde o ramo esquerdo indica um ponto (·) e o ramo direito um traço (–). Assim, o caminho da raiz até cada nó define a sequência Morse de um caractere. O sistema possibilita inserir, buscar, remover e exibir elementos, além de traduzir mensagens em código Morse para texto.

---

## Estrutura do Projeto

```
/ArvoreBinariaMorse
└── README.md (Documentação do projeto)
  /ArvoreBinariaMorse
  └── Main.java
  └── ArvoreBinariaMorse.java
  └── Nodo.java
  /ArvoreBinariaMorse - sem coment
  └── Main.java
  └── ArvoreBinariaMorse.java
  └── Nodo.java

```

---
# Explicação Código

## Estrutura do Código

### Classe `Main`
O arquivo Main.java é responsável por executar o programa principal. Nele, é criada uma árvore binária que representa o alfabeto do código Morse. Em seguida, todas as letras de A a Z e os números de 0 a 9 são inseridos na árvore, seguindo a regra de que o lado esquerdo representa o ponto (·) e o lado direito representa o traço (–).
O programa realiza testes de busca, exibição e remoção de caracteres para validar o funcionamento da estrutura. Depois, permite que o usuário digite uma mensagem em código Morse (separando as letras com espaço e as palavras com *), traduzindo automaticamente a sequência em texto.

---

### Classe `Nodo`
A classe Nodo representa a estrutura básica da árvore binária.
Cada objeto dessa classe corresponde a um nó da árvore, armazenando um caractere (letra, número ou espaço) e duas referências para seus filhos:
esquerda, que representa o ponto (·) no código Morse;
direita, que representa o traço (–).
O construtor inicializa o nó com um caractere e define os filhos como nulos, permitindo que a árvore seja construída de forma dinâmica à medida que novos símbolos são inseridos.


---

### Classe Classe `ArvoreBinariaMorse`
A classe ArvoreBinariaMorse é responsável por construir, gerenciar e percorrer a árvore binária que representa o alfabeto do código Morse. Ela utiliza objetos da classe Nodo como elementos da estrutura.
A árvore começa com uma raiz vazia ('\0') e, a partir dela, os ramos são criados conforme os símbolos do código Morse:
o lado esquerdo representa o ponto (·);
o lado direito representa o traço (–).
A classe possui os seguintes métodos principais:
inserir(String codigo, char caractere): percorre a árvore conforme os símbolos do código (. e -) e insere o caractere no nó correspondente.
buscar(String codigo): segue o caminho indicado pelo código Morse e retorna o caractere armazenado naquele ponto da árvore.
remover(String codigo): localiza o nó referente ao código informado e apaga o caractere, mantendo a estrutura da árvore.
exibir(Nodo nodo, int nivel): exibe a árvore de forma hierárquica no console, facilitando a visualização da sua estrutura.
getRaiz(): retorna o nó raiz da árvore.
Com essa implementação, a classe permite construir toda a tabela do código Morse, realizar buscas, remoções e visualizar a organização dos caracteres em uma estrutura binária.

---

## Exemplo de Saída 

```
Busca '---': O
Busca '...': I
Busca '--- ...': OI

Exibição da árvore:
[ ]
  [E]
    [I]
      [S]
        [H]
          [5]
          [4]
        [V]
          [3]
      [U]
        [F]
        [ ]
          [2]
    [A]
      [R]
        [L]
      [W]
        [P]
        [J]
          [1]
  [T]
    [N]
      [D]
        [B]
          [6]
        [X]
      [K]
        [C]
        [Y]
    [M]
      [G]
        [Z]
          [7]
        [Q]
      [O]
        [ ]
          [8]
        [ ]
          [9]
          [0]

Removendo 'P' (.--.)
Busca após remoção: �

Use * para separar frases.
Digite uma mensagem em código Morse (separe letras com espaço): ... --- .--. .... .. .-
SO�HIA

```

---

## Licença

Este projeto foi desenvolvido **exclusivamente para fins educacionais** na disciplina de *Resolução de Problemas Estruturados em Computação* da Pontifícia Universidade Católica do Paraná.
Não possui finalidade comercial e não concede direitos de uso além do contexto acadêmico.
