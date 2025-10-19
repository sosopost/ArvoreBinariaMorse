# Árvore Binária em Código Morse

## Integrantes:
- Sophia Post Ploposki  

---

## Descrição do Projeto
Este projeto tem como objetivo implementar uma **árvore binária** que representa os caracteres do **alfabeto em código Morse**, onde cada nó simboliza uma letra ou número.  
Na estrutura, o **lado esquerdo** representa o **ponto (·)** e o **lado direito** representa o **traço (–)**.  
Com base nessa lógica, cada percurso da raiz até um nó folha define a combinação de pontos e traços que compõe um caractere.  

O sistema é capaz de **inserir**, **buscar**, **remover** e **exibir** elementos da árvore, além de **traduzir mensagens** em código Morse para texto comum.

---

## Objetivos do Trabalho
1. Implementar uma árvore binária que armazene o alfabeto (A–Z) e os números (0–9) segundo o padrão Morse.  
2. Permitir a manipulação da árvore (inserção, busca e remoção).  
3. Oferecer visualização da estrutura hierárquica da árvore.  
4. Traduzir mensagens em código Morse para texto e vice-versa.  

---

## Estrutura do Código

### **Nodo.java**
Classe responsável por definir o nó da árvore, armazenando:  
- Um caractere (letra ou número).  
- Referências para os nós filhos (esquerdo e direito).  

### **ArvoreBinariaMorse.java**
Classe que contém toda a lógica principal do sistema.  
Métodos principais:  
- `inicializar()`: Cria a raiz da árvore.  
- `inserir(String codigo, char caractere)`: Adiciona um caractere com base no seu código Morse.  
- `inserirTodos()`: Popula automaticamente a árvore com todos os caracteres padrão.  
- `buscarLetra(String codigo)`: Retorna a letra correspondente a um código Morse informado.  
- `buscar(String mensagem)`: Traduz uma frase completa em código Morse.  
- `remover(String codigo)`: Exclui um caractere da árvore.  
- `exibirArvore()`: Mostra a estrutura da árvore no console.  

### **Main.java**
Classe principal do programa, responsável pela interação com o usuário.  
Apresenta um menu com as seguintes opções:  
1. Inserir novo caractere.  
2. Buscar caractere por código Morse.  
3. Remover caractere.  
4. Exibir a árvore binária completa.  
5. Traduzir uma mensagem em código Morse.  
6. Encerrar o programa.  

---

## Tecnologias Utilizadas
- **Linguagem:** Java  
- **Paradigma:** Programação Orientada a Objetos  
- **Ambiente:** Console / Terminal  
- **Classes utilizadas:** `String`, `Scanner`, `System.out`  
- **Restrições:** Sem uso de listas, arrays ou funções automatizadas.  

---

## Como Executar
1. Compile todos os arquivos do projeto:
   ```bash
   javac Nodo.java ArvoreBinariaMorse.java Main.java

2. Execute o programa:
   java Main

3. Siga as instruções do menu para inserir, buscar ou traduzir mensagens Morse.

## Exemplo de Tradução Entrada: 
Digite uma mensagem em código Morse (separada por espaços): ... --- ... 
Saída: 
Mensagem traduzida: SOS 
## Funcionamento da Árvore Usando o teste de uso sugerido pela documentação do trabalho, obteriamos a seguinte árvore para mensagem "SOS":
- S = ... (ponto ponto ponto)
-  - O = --- (traço traço traço)
-  - S = ... (ponto ponto ponto)
     
Na árvore binária, cada ponto (·) significa ir para a esquerda e cada traço (–) significa ir para a direita, com isso teriamos o seguinte caminho: 
| Letra | Caminho na Árvore | Direção | 
| ----- | ----------------- | ------------------------------ | 
| S | ... | esquerda → esquerda → esquerda | 
| O | --- | direita → direita → direita | 
| S | ... | esquerda → esquerda → esquerda | 

Mensagem traduzida: SOS
