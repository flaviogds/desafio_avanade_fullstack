## Busca e laços de repetição

### [Desafio 1 - O Escolhido](./desafio_01.js)

As aulas do Prof. Xavier estão dando o que falar até no exterior, pois ele ensina Algorítmos de um jeito diferente aos seus alunos. Uma universidade dos EUA, que soube sobre o método do Prof. Xavier, quer selecionar um aluno para um intercâmbio no país. Para isso, ele possuem uma lista de inscrição com o número de cada aluno e sua nota. 

Para ajudá-los a encontrarem o melhor aluno que ganhará o intercâmbio, você deve desenvolver um programa. Só tem um detalhe, se a nota mais alta não for maior ou igual a 8, você deverá imprimir “Minimum note not reached”.

| Entrada | 
| :-----: | 
| O arquivo contém primeiro a quantidade de alunos (3 <= n <= 100) existentes e em seguida, os n alunos contendo o número da matrícula (0 < m < 1000000) de cada um, seguido da respectiva nota (0 <= nota <= 10.0, com 1 casa decimal).

Obs.: as notas não serão repetidas. Ou seja, não tem chance de ter dois alunos com a mesma nota.

| Saída |
|:-----:|
| Você deve imprimir o número do estudante que obteve a maior pontuação ou "Minimum note not reached" (sem aspas) caso nenhum estudante tenha tirado uma nota maior ou igual a 8. |
 
| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
| 3 <br> 1000 5 <br> 1001 10 <br> 1002 6 | 1001 |
| 4 <br> 900775 5.7 <br> 201553 7.9 <br> 5032 6.2 <br> 2088 2.1 | Minimum note not reached |


### [Desafio 3 - Degustação de vinho](./desafio_03.js)

Degustação de vinho às escuras é a habilidade de identificar um vinho usando apenas seus sentidos do olfato e paladar.

Durante uma competição de degustação, uma garrafa de vinho é aberta e dividia em taças para que os cinco competidores possam provar. Eles podem cheiras, saborear e avaliar a bebida para conseguir identificar qual o tipo do vinho, sendo: (1) Cabernet; (2) Merlot; (3) Pinot Noir. No final, as respostas são verificadas para determinar o número de suposições corretas.

Dado o qual foi o tipo do vinho e as respostas fornecidas, determine o número de participantes que receberam a resposta correta.

| Entrada | 
| :-----: | 
| A primeira linha contém um inteiro **T** representando o tipo de vinho (1 ≤ **T** ≤ 4). A segunda linha contém cinco inteiros **A**, **B**, **C**, **D** e **E**, que indica a resposta dada por cada competidor (1 ≤ **A**, **B**, **C**, **D**, **E** ≤ 4).

| Saída |
|:-----:|
| A saída contém um inteiro representando o número de concorrentes que obtiveram a resposta correta. |
 
| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
| 1 <br> 1 2 3 2 1 | 2 |
| 3 <br> 4 1 1 2 1 | 0 |

### [Desafio 4 - Pink e Cérebro](./desafio_05.js)

Pink e Cérebro dividem um apartamento e estão juntos 24h por dia desde o começo da pandemia. Para passar o temp, Pink cria problemas matemáticos para Cérebro resolver, o último deles foi uma lista de números com a seguinte pergunta: quantos números da lista são múltiplos de **2**, **3**, **4** e **5**?

Apesar de parecer simples, porém, quando a lista contém muitos números, Cérebro se confunde e acaba errando alguns cálculos.

Ajude Cérebro a resolver o desadio de Pink.

| Entrada | 
| :-----: | 
| A primeira linha da entrada consiste em um inteiro **N** (1 ≤ **N** ≤1000), representando a quantidade de números na lista de Pink.

A segunda linha contém **N** inteiros **Li** (1 ≤ **Li** ≤ 100), representando os números da lista de Pink.

| Saída |
|:-----:|
| Imprima a quantidade de números múltiplos de **2**, **3**, **4** e **5** presentes na lista. Observe a formatação da saída nos exemplos, pois ela deve ser seguida rigorosamente. |
 
| Exemplo de Entrada |        Exemplo de Saída        |
| :----------------: |       :-----------------:      |
| 5 <br> 2 5 4 20 10 | 4 Multiplo(s) de 2 <br> 0 Multiplo(s) de 3 <br> 2 Multiplo(s) de 4 <br> 3 Multiplo(s) de 5 |

### [Desafio 5 - Menor e Posição](./desafio_05.js)

Desenvolva um código que leia um valor **E**. Este **E** será o tamanho de um vetor **X[E]**. A seguir, leia cada um dos valores de **X**, encontre o menor elemento deste vetor e a sua posição dentro do vetor, mostrando esta informação.

| Entrada | 
| :-----: | 
| A primeira linha de entrada contem um único inteiro **E** (1 < **E** < 1000), indicando o número de elementos que deverão ser lidos em seguida para o vetor **X[E]** de inteiros. A segunda linha contém cada um dos **E** valores, separados por um espaço.

| Saída |
|:-----:|
| A primeira linha apresenta a mensagem “Menor valor:” seguida de um espaço e do menor valor lido na entrada. A segunda linha apresenta a mensagem “Posicao:” seguido de um espaço e da posição do vetor na qual se encontra o menor valor lido, lembrando que o vetor inicia na posição zero |
 
| Exemplo de Entrada |        Exemplo de Saída        |
| :----------------: |       :-----------------:      |
| 10 <br> 1 2 3 4 -5 6 7 8 9 10 | Menor valor: -5 <br> Posicao: 4 |