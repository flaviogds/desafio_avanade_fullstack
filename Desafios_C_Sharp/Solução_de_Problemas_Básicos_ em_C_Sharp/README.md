## Solução de problemas básicos em C#

### [Desafio 1 - Visita na Feira](./desafio_01.cs)

Você está na feira com a sua sacola e parou em uma banca. O feirante lhe entregou pimentões amarelos e vermelhos. Agora iremos somar os pimetões amarelos e vermelhos para descobrir o total de pimentões na sacola.  Você receberá 2 inteiros que devem ser lidos e armazenados nas variáveis A (pimentões amarelos) e B (pimentões vermelhos). Faça a soma de A e B atribuindo o seu resultado na variável X (total de pimentões). Apresente X como descrito na mensagem de exemplo abaixo. Não apresente outra mensagem além da mensagem especificada.

| Entrada | 
| :-----: | 
| A entrada contém 2 valores inteiros, separados por um espaço. 

| Saída |
|:-----:|
| Imprimir a mensagem "X = " (sendo a letra X maiúscula) seguido pelo valor da variável X e pelo final de linha. Assegure que exista um espaço antes e depois do sinal de igualdade. |
 
| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
| 11 7 <br> -11 6  <br> 11 -2 |X = 18 <br> X = -5 <br> X = 9 |

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