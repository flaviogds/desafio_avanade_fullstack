## Desenvolvimento de problemas avançados em JavaScript

### [Desafio 1 - Ordenando Números Pares e Ímpares](./desafio_01.js)

Crie um programa onde você receberá valores inteiros não negativos como entrada.

Ordene estes valores de acordo com o seguinte critério:

* Primeiro os Pares
* Depois os Ímpares

Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.

| Entrada | 
| :-----: | 
| A primeira linha de entrada contém um único inteiro positivo **N** (1 < **N** < 10000) Este é o número de linhas de entrada que vem logo a seguir. As próximas **N** linhas terão, cada uma delas, um valor inteiro não negativo.

| Saída |
|:-----:|
| Exiba todos os valores lidos na entrada segundo a ordem apresentada acima. Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 10 <br> 4 <br> 32 <br> 34 <br> 543 <br> 3456 <br> 654 <br> 567 <br> 87 <br> 6789 <br> 98 | 4 <br> 32 <br> 34 <br> 98 <br> 654 <br> 3456 <br> 6789 <br> 567 <br> 543 <br> 87 |

### [Desafio 2 - Animal](./desafio_02.js)

Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.

|Subfilo|Classe|Ordem|Espécie|
|:-----------:|:---------:|:---------------------------:|:---------------------:|
|  vertebrado  |     ave     |  carnivoro <br>-----<br> onivoro |  aguia <br>-----<br> pomba |
|              |   mamifero  |  onivoro <br>-----<br> herbivoro |  homem <br>-----<br> vaca  |
| invertebrado |   inseto    |hematofago <br>-----<br> herbivoro|pulga <br>-----<br> lagarta|
|              |   anelideo  | hematofago <br>-----<br> onivoro |sanguessuga <br>-----<br> minhoca|


| Entrada | 
| :-----: | 
| A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima, com todas as letras minúsculas.

| Saída |
|:-----:|
| Imprima o nome do animal correspondente à entrada fornecida. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| vertebrado <br> mamifero <br> onivoro | homem |
| vertebrado <br> ave <br> carnivoro | aguia |
| invertebrado <br> anelideo <br> onivoro | minhoca|

### [Desafio 3 - Compras no Supermercado](./desafio_03.js)

Pedro trabalha sempre até tarde todos os dias, com isso tem pouco tempo tempo para as tarefas domésticas. Para economizar tempo ele faz a lista de compras do supermercado em um aplicativo e costuma anotar cada item na mesma hora que percebe a falta dele em casa.

O problema é que o aplicativo não exclui itens duplicados, como Pedro anota o mesmo item mais de uma vez e a lista acaba ficando extensa. Sua tarefa é melhorar o aplicativo de notas desenvolvendo um código que exclua os itens duplicados da lista de compras e que os ordene alfabeticamente.

| Entrada | 
| :-----: | 
| A primeira linha de entrada contém um inteiro **N** (**N** < 100) com a quantidade de casos de teste que vem a seguir, ou melhor, a quantidade de listas de compras para organizar. Cada lista de compra consiste de uma única linha que contém de 1 a 1000 itens ou palavras compostas apenas de letras minúsculas (de 1 a 20 letras), sem acentos e separadas por um espaço.

| Saída |
|:-----:|
| A saída contém **N** linhas, cada uma representando uma lista de compra, sem os itens repetidos e em ordem alfabética |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 2 <br> carne laranja suco picles <br> laranja picles <br> laranja pera laranja pera <br> pera | carne laranja <br> picles suco <br> laranja pera