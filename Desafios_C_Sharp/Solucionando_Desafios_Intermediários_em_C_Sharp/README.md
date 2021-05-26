## Solução de problemas básicos em C#

### [Desafio 1 - Teste de Seleção 1](./desafio_01.cs)

Leia 4 valores inteiros A, B, C e D. Com base nisso, se o valor de B for maior do que de C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se tanto C quanto D forem positivos e, ainda, se a variável A for par, escreva a mensagem "Valores aceitos", senão escrever "**Valores nao aceitos**".

| Entrada | 
| :-----: | 
| Quatro números inteiros A, B, C e D. 

| Saída |
|:-----:|
| Imprima a mensagem corretamente esperada pela validação dos valores.|
 
| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
| 5 6 7 8 <br> 2 3 2 6 | Valores nao aceitos <br> Valores aceitos |

### [Desafio 2 - Triângulo](./desafio_02.cs)

Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:  
Perimetro = XX.X  
Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem  
Area = XX.X

| Entrada | 
| :-----: | 
| A entrada contém três valores reais.

| Saída |
|:-----:|
| O resultado deve ser apresentado com uma casa decimal. |

| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
| 6.0 4.0 2.0 <br> 6.0 4.0 2.1|    Area = 10.0 <br> Perimetro = 12  |

### [Desafio 3 - Notas e Moedas](./desafio_03.cs)

Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

| Entrada | 
| :-----: | 
| O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

| Saída |
|:-----:|
| Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal. |


|Exemplo de Entrada|  Exemplo de Saída  |
|:----------------:| :----------------: |
| 576.73 | NOTAS: <br> 5 nota(s) de R$ 100.00 <br> 1 nota(s) de R$ 50.00 <br> 1 nota(s) de R$ 20.00 <br> 0 nota(s) de R$ 10.00 <br> 1 nota(s) de R$ 5.00 <br> 0 nota(s) de R$ 2.00 <br> MOEDAS: <br> 1 moeda(s) de R$ 1.00 <br> 1 moeda(s) de R$ 0.50 <br> 0 moeda(s) de R$ 0.25 <br> 2 moeda(s) de R$ 0.10 <br> 0 moeda(s) de R$ 0.05 <br> 3 moeda(s) de R$ 0.01 |
4.00 | NOTAS: <br> 0 nota(s) de R$ 100.00 <br> 0 nota(s) de R$ 50.00 <br> 0 nota(s) de R$ 20.00 <br> 0 nota(s) de R$ 10.00 <br> 0 nota(s) de R$ 5.00 <br> 2 nota(s) de R$ 2.00 <br> MOEDAS: <br> 0 moeda(s) de R$ 1.00 <br> 0 moeda(s) de R$ 0.50 <br> 0 moeda(s) de R$ 0.25 <br> 0 moeda(s) de R$ 0.10 <br> 0 moeda(s) de R$ 0.05 <br> 0 moeda(s) de R$ 0.01 |
91.01 | NOTAS: <br> 0 nota(s) de R$ 100.00 <br> 1 nota(s) de R$ 50.00 <br> 2 nota(s) de R$ 20.00 <br> 0 nota(s) de R$ 10.00 <br> 0 nota(s) de R$ 5.00 <br> 0 nota(s) de R$ 2.00 <br> MOEDAS: <br> 1 moeda(s) de R$ 1.00 <br> 0 moeda(s) de R$ 0.50 <br> 0 moeda(s) de R$ 0.25 <br> 0 moeda(s) de R$ 0.10 <br> 0 moeda(s) de R$ 0.05 <br> 
1 moeda(s) de R$ 0.01 |


### [Desafio 4 - Teorema da Divisão Euclidiana](./desafio_04.cs)

Você recebeu desafio de desenvolver um programa que calcule o quociente e o resto da divisão de dois números inteiros. Não se esqueça que o quociente e o resto da divisão de um inteiro a por um inteiro não-nulo b são respectivamente os únicos inteiros q e r tais que:

0 ≤ r < |**b**|  
Se r < 0: **r = r - |b|**  
**a = b × q + r**  
**q = ( a - r ) / b**  

Caso você não saiba, o teorema que garante a existência e a unicidade dos inteiros q e r é conhecido como ‘Teorema da Divisão Euclidiana’ ou ‘Algoritmo da Divisão’.  
**  **|b| (Módulo / Valor absoluto)**: É o valor representado de forma positiva;

| Entrada | 
| :-----: | 
| A entrada é composta por dois números inteiros **a** e **b** (-1.000 ≤ a, b < 1.000).

| Saída |
|:-----:|
| Imprima o quociente **q** seguido pelo resto **r** da divisão de **a** por **b**, considerando as regras apresentadas a cima. |


|Exemplo de Entrada|  Exemplo de Saída  |
|:----------------:| :----------------: |
| 7 3 | 2 1 |
| 7 -3 | -2 1 |
| -7 -3 | 3 2 |

### [Desafio 5 - Fórmula de Bhaskara](./desafio_05.cs)

Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

| Entrada | 
| :-----: | 
| Leia três valores de ponto flutuante (double) A, B e C.

| Saída |
|:-----:|
| Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha após cada mensagem. |


|Exemplo de Entrada|  Exemplo de Saída  |
|:----------------:| :----------------: |
| 10.0 20.1 5.1 | R1 = -0.29788 <br> R2 = -1.71212 |
| 0.0 20.0 5.0 | Impossivel calcular |
| 10.3 203.0 5.0 | R1 = -0.02466 <br> R2 = -19.68408 |
| 10.0 3.0 5.0 | Impossivel calcula |
