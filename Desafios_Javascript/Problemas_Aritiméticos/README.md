## Problemas Aritméticos

### [Desafio 1 - Soma Simples](./desafio_01.js)

Leia dois valores inteiros identificados como variáveis A e B. Calcule a soma entre elas e chame essa variável de SOMA.
A seguir escreva o valor desta variável.

| Entrada | 
| :-----: | 
| O arquivo de entrada contém 2 valores inteiros.

| Saída |
|:-----:|
| Imprima a variável SOMA com todas as letras maiúsculas, inserindo um espaço em branco antes e depois do símbolo de igualdade, seguido pelo valor correspondente à soma de A e B. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 30 <br> 10 <br> | SOMA = 40 |
| -30 <br> 10 <br> | SOMA = -20 |
| 0 <br> 0 <br> | SOMA = 0 |

### [Desafio 2 - Coxinha de Bueno](./desafio_02.js)

Em 2015 um novo record foi alcançado na competição de Coxinhas de Bueno de Andrada, onde Mônica mandou pra dentro 43 coxinhas em apenas 10 minutos, passando se antecessor que conseguiu comer, no mesmo tempo, 38 coxinhas em 2014.

O restaurante especializado em coxinhas do pequeno distrito de Bueno de Andrada, interior de São Paulo, organiza essa competição todos os anos, mas nunca conseguiram entrar para o livro dos recordes, o Guinness Book. Para isso, o restaurante precisa preencher informações sobre a competição, como o número de coxinhas consumidas pelos competidores durante o evento. 

Porém, como jó foi informado, a especialidade deles é coxinha, não matemática, então será que você pode ajudá-los? Com base no número total de coxinhas consumidas e o número de participantes na competição, o dono do restaurante precisa que você desenvolva um programa para saber a quantidade média de coxinha que os participantes da competição conseguem devorar.

Ah, lembre que, em troca da sua ajuda, você poderá comer quantas coxinhas conseguir.

| Entrada | 
| :-----: | 
| A entrada consiste de uma única linha que contém dois inteiros H e P (1 ≤ H, P ≤ 1000) indicando respectivamente o número total de coxinhas consumidas e o número total de participantes na competição.

| Saída |
|:-----:|
| Seu programa deve produzir uma única linha com um número racional representando o número médio de coxinhas consumidas pelos participantes. O resultado deve ser escrito como um número racional com exatamente dois dígitos após o ponto decimal, arredondado se necessário. |


|Exemplo de Entrada|  Exemplo de Saída  |
|:----------------:| :----------------: |
| 10 90 <br> 840 11 <br> 1 50 | 0.11  <br> 76.36 <br> 0.02 |

### [Desafio 3 - Cálculo Viagem](./desafio_03.js)

Rubens quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem de carro, sendo que seu carro faz 12 KM/L. Como ele não sabe fazer um programa que o auxilie nessa missão, ele te pede ajuda. Para efetuar o cálculo, deve-se fornecer o tempo gasto em horas na viagem e a velocidade média durante a mesma em km/h. Assim, você conseguirá passar para Rubens qual a distância percorrida e, em seguida, calcular quantos litros serão necessários para a viagem que ele quer fazer. Mostre o valor com 3 casas decimais após o ponto.

| Entrada | 
| :-----: | 
| O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem em horas e o segundo é a velocidade média durante a mesma em km/h.

| Saída |
|:-----:|
| Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal |


|Exemplo de Entrada|  Exemplo de Saída  |
|:----------------:| :----------------: |
| 10 85 | 70.833 |
| 22 67  | 122.833 |

### [Desafio 4 - Taxa de Imposto de Renda](./desafio_04.js)

Há um país denominado Lolipad, todos os habitantes ficam felizes em pagar seus impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Loli, cujo símbolo é o R$.

Você terá o desafio de ler um valor com duas casas decimais, equivalente ao salário de uma pessoa de Loli. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

|Renda|Imposto|
|:-----:|:-----:|
| de 0.00 a R$ 2000.00 | Isento |
| de 2000.01 a R$ 3000.00 | 8 % |
| de 3000.01 a R$ 4500.00 | 18 % |
| acima R$ 4500.00| 28 %  |

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais.

| Entrada | 
| :-----: | 
| A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

| Saída |
|:-----:|
| Imprima o texto "R$" seguido de um espaço e do valor total devido de Imposto de Renda, com duas casas após o ponto. Se o valor de entrada for menor ou igual a 2000, deverá ser impressa a mensagem "Isento". |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 3002.00 | R$ 80.36 |
| 1701.12 | Isento |
| 4520.00 | R$ 355.60 |

### [Desafio 5 - Teorema da Divisão Euclidiana](./desafio_05.js)

Você recebeu desafio de desenvolver um programa que calcule o quociente e o resto da divisão de dois números inteiros. Não se esqueça que o quociente e o resto da divisão de um inteiro **a** por um inteiro não-nulo **b** são respectivamente os únicos inteiros **q** e **r** tais que:

0 ≤ **r** < |**b**|

Se **r** < 0: **r** = **r** - |**b**|

**a** = **b** × **q** + **r**

**q** = ( **a** - **r** ) / **b**

Caso você não saiba, o teorema que garante a existência e a unicidade dos inteiros **q** e **r** é conhecido como ‘Teorema da Divisão Euclidiana’ ou ‘Algoritmo da Divisão’.

**  **|b| (Módulo / Valor absoluto)**: É o valor representado de forma positiva;

| Entrada | 
| :-----: | 
| A entrada é composta por dois números inteiros **a** e **b** (-1.000 ≤ **a**, **b** < 1.000).

| Saída |
|:-----:|
| mprima o quociente **q** seguido pelo resto **r** da divisão de **a** por **b**, considerando as regras apresentadas a cima. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 7 3 | 2 1 |
| 7 -3 | -2 1 |
| -7 -3 | 3 2 |