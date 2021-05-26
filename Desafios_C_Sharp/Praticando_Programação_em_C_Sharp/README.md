## Solução de problemas básicos em C#

### [Desafio 1 - Coordenadas de um Ponto](./desafio_01.cs)

Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).

|        |        |   y    |
|:------:|:------:|:------:|
|   Q2   |   Q1   |   x    |
|   Q3   |   Q4   |        |

Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

| Entrada | 
| :-----: | 
| A entrada contem as coordenadas de um ponto.

| Saída |
|:-----:|
| A saída deve apresentar o quadrante em que o ponto se encontra. |
 
| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
| 4.5 -2.2 | Q4 |
| 0.1 0.1 | Q1 |
| 0.0 0.0 | Origem |

### [Desafio 2 - Tuitando](./desafio_02.cs)

O microblog Twitter é conhecido por limitar as postagens em 140 caracteres. Conferir se um texto vai caber em um tuíte é sua tarefa.

| Entrada | 
| :-----: | 
| A entrada é uma linha de texto T (1 ≤ |T| ≤ 500).

| Saída |
|:-----:|
| A saída é dada em uma única linha. Ela deve ser "TWEET" (sem as aspas) se a linha de texto T tem até 140 caracteres. Se T tem mais de 140 caracteres, a saída deve ser "MUTE". |

| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
| RT @TheEllenShow: If only Bradley's arm was longer. Best photo ever. #oscars pic.twitter.com/C9U5NOtGap |    TWEET    |

### [Desafio 3 - Validação de Nota](./desafio_03.cs)

Para ajudar a calcular as notas referentes às duas avaliações dos alunos, uma professora pediu para que você desenvolva um programa que calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.

| Entrada | 
| :-----: | 
| A entrada contém vários valores reais, positivos ou negativos. O programa deve ser encerrado quando forem lidas duas notas válidas.

| Saída |
|:-----:|
| Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo. O valor deve ser apresentado com duas casas após o ponto decimal. |


|Exemplo de Entrada|  Exemplo de Saída  |
|:----------------:| :----------------: |
| -3.5 <br> 3.5 <br> 11.0 <br> 10 | 3775 |
nota invalida <br> nota invalida <br> media = 6.75 |