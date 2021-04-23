## Solucionando desafios matemáticos em Java

### [Desafio 1 - Cálculo de viagem](./desafio_01.java)

Rubens quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem de carro, sendo que seu carro faz 12 KM/L. Como ele não sabe fazer um programa que o auxilie nessa missão, ele te pede ajuda. Para efetuar o cálculo, deve-se fornecer o tempo gasto em horas na viagem e a velocidade média durante a mesma em km/h. Assim, você conseguirá passar para Rubens qual a distância percorrida e, em seguida, calcular quantos litros serão necessários para a viagem que ele quer fazer. Mostre o valor com 3 casas decimais após o ponto.

| Entrada | 
| :-----: | 
| O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem em horas e o segundo é a velocidade média durante a mesma em km/h.

| Saída |
|:-----:|
| Imprima a quantidade de litros necessária para realizar a viagem, com três dígitos após o ponto decimal. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 10 85 | 70.833 |
| 22 67 | 122.833 |

### [Desafio 2 - Área do Círculo](./desafio_02.java)

A fórmula para calcular a área de uma circunferência é: area = π . raio². Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

| Entrada | 
| :-----: | 
|A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável **raio**. |

| Saída |
|:-----:|
| Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error". |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 2.00 | A=12.5664 |
|100.64 | A=31819.3103 |
|150.00 | A=70685.7750 |

### [Desafio 3 - Folha de Pagamento](./desafio_03.java)

Precisamos saber quanto uma determinada empresa deve pagar para seus colaboradores, porém temos apenas a quantidade de horas trabalhadas e o valor hora. Escreva um programa que leia o número de um colaborador, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse colaborador. Em seguida, apresente o número e o salário do colaborador, com duas casas decimais.

| Entrada | 
| :-----: | 
| Você receverá 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada. |

| Saída |
|:-----:|
| Exiba o número e o salário do colaborador, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 25 <br> 100 <br> 5.50 | NUMBER = 25 <br> SALARY = U$ 550.00 |
| 1 <br> 200 <br> 20.50 | NUMBER = 1 <br> SALARY = U$ 4100.00 |
| 6 <br> 145 <br> 15.55 | NUMBER = 6 <br> SALARY = U$ 2254.75 |


### [Desafio 4 - Múltiplos](./desafio_04.java)

Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "**Sao Multiplos**" ou "**Nao sao Multiplos**", indicando se os valores lidos são múltiplos entre si.

| Entrada | 
| :-----: | 
| A entrada contém valores inteiros. |

| Saída |
|:-----:|
| A saída deve conter uma das mensagens conforme descrito acima. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 6 24 | Sao Multiplos |
| 6 25 | Nao sao Multiplos |

### [Desafio 5 - Análise de Números](./desafio_05.java)

Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos.

| Entrada | 
| :-----: | 
| Você receberá 5 valores inteiros. |

| Saída |
|:-----:|
| Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.      |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| -5 <br> 0 <br> -3 <br> -4 <br> 12 | 3 valor(es) par(es) <br> 2 valor(es) impar(es) <br> 1 valor(es) positivo(s) <br> 3 valor(es) negativo(s) |