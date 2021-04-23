## Iniciando a programação em Java

### [Desafio 1 - Exibindo Números Pares](./desafio_01.java)

Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

| Entrada | 
| :-----: | 
| Você receberá 1 valor inteiro **N**, onde **N > 0**.

| Saída |
|:-----:|
| Exiba todos os números pares até o valor de entrada, sendo um em cada linha. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 6	| 2 <br> 4 <br> 6 |

### [Desafio 2 - Entrada e Saída CPF](./desafio_02.java)

Elabore um programa que possuas as características abaixo:

- Leia os dados de um CPF no formato XXX.YYY.ZZZ-DD;
- Imprima os quatro grupos numéricos, sendo um valor por linha.

| Entrada | 
| :-----: | 
| A entrada consiste vários arquivos de teste e cada um possuindo uma linha com formato XXX.YYY.ZZZ-DD, onde XXX, YYY, ZZZ, DD são números inteiros.

| Saída |
|:-----:|
| Para cada arquivo da entrada, tem que ter um arquivo de saída com quatro linhas, e em cada linha um número inteiro de acordo com procedimento 2 descrito no Desafio. Confira o exemplo abaixo: |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 000.000.000-00 | 000 <br> 000 <br> 000 <br> 00 |
| 320.025.102-01 | 320 <br> 025 <br> 102 <br> 01 |

### [Desafio 3 - DDD](./desafio_03.java)

Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:

 | DDD | Destination |
 |:---:| :---------: |
 | 61 <br>  71 <br>  11 <br>  21 <br>  32 <br>  19 <br>  27 <br>  31 | Brasilia <br> Salvador <br> Sao Paulo  <br> Rio de Janeiro <br> Juiz de Fora <br> Campinas <br> Vitoria <br> Belo Horizonte |

Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
DDD nao cadastrado

| Entrada | 
| :-----: | 
| A entrada consiste de um único valor inteiro.

| Saída |
|:-----:|
| Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso não existir DDD correspondente ao número digitado. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 11 | Sao Paulo |