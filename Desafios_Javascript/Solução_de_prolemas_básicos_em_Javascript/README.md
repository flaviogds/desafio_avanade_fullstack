## Solução de problemas básicos em JavaScript

### [Desafio 1 - Dividindo X por Y](./desafio_01.js)

Você terá o desafio de escrever um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. Caso não for possível, mostre a mensagem “divisao impossivel” para os valores em questão.


| Entrada | 
| :-----: | 
| A entrada contém um número inteiro **N**. Este **N** será a quantidade de pares de valores inteiros (X e Y) que serão lidos em seguida.

| Saída |
|:-----:|
| Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou “divisao impossivel” caso não seja possível efetuar o cálculo. |
 
| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
|3 <br> 3 -2 <br> -8 0 <br> 0 8 | -1.5 <br> divisao impossivel <br> 0.0|

### [Desafio 2 - Blobs](./desafio_02.js)

No planeta Alpha vive a criatura Blobs, que come precisamente 1/2 de seu suprimento de comida disponível todos os dias. Escreva um algoritmo que leia a capacidade inicial de suprimento de comida (em Kg), e calcule quantos dias passarão antes que Blobs coma todo esse suprimento até restar um quilo ou menos.


| Entrada | 
| :-----: | 
| A primeira linha de entrada contem um único inteiro **N** (1 ≤ **N** ≤ 1000), indicando o número de casos de teste. As **N** linhas seguintes contém um valor de ponto flutuante **C** (1 ≤ **C** ≤ 1000) correspondente à quantidade de comida disponível para Blobs.

| Saída |
|:-----:|
| Para cada caso de teste, imprima uma linha contendo o número de dias que Blobs irá demorar para comer todo seu suprimento de comida, seguido da palavra "dias". |
 
| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
|3 <br> 40.0 <br> 200.0 <br> 300.0 | 6 dias <br> 8 dias <br> 9 dias|


### [Desafio 3 - Tipo de Combustível](./desafio_03.js)

Você recebeu desafio para determinar qual dos produtos é o preferêncial dos clientes de um posto de abastecimento de combustível. Para isso você deve escrever um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4.


| Entrada | 
| :-----: | 
| A entrada contém apenas valores inteiros e positivos.

| Saída {style="background: black; color: white;}|
|:-----:|
| Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo. |
 
| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
|8 <br> 1 <br> 7 <br> 2 <br> 2 <br> 4 | MUITO OBRIGADO <br> Alcool: 1 <br> Gasolina: 2 <br> Diesel: 0 |

