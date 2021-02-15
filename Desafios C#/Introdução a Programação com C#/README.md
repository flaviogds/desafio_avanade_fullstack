## Introdução a Programação com C#

### Desafio 1 - Dividindo X por Y

Você terá o desafio de escrever um algoritmo que leia 2 números e imprima o resultado da divisão do primeiro pelo segundo. Caso não for possível mostre a mensagem “divisao impossivel” para os valores em questão.

| Entrada | 
| :-----: | 
| A entrada contém um número inteiro N. Este N será a quantidade de pares de valores inteiros (X e Y) que serão lidos em seguida. 

| Saída |
|:-----:|
| Para cada caso mostre o resultado da divisão com um dígito após o ponto decimal, ou “divisao impossivel” caso não seja possível efetuar o cálculo. |
 
| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
|            3       |                    |
|         3 -2       |        -1.5        |
|         -8 0       | divisao impossivel |
|          0 8       |         0.0        |

### Desafio 2 - Distância

Duas motos (X e Y) partem em uma mesma direção. A moto X sai com velocidade constante de 60 Km/h e a moto Y sai com velocidade constante de 90 Km/h.

Em uma hora (60 minutos) a moto Y consegue se distanciar 30 quilômetros da moto X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.

O seu desafio é ler a distância (em Km) e calcular quanto tempo leva (em minutos) para a moto Y tomar essa distância da outra moto.

| Entrada | 
| :-----: | 
| O arquivo de entrada contém um número inteiro K que representa a quantidade de quilômetro que que a moto Y deve estar da moto X. 

| Saída |
|:-----:|
| Imprima o tempo necessário para a moto Y ficar com a quantidade K de quilômetro da moto X, seguido da mensagem " minutos". |

| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
|          30        |     60 minutos     |
|         110        |     220 minutos    |

### Desafio 3 - Quanta Mandioca?

Os meses de Junho e Julho são tradicionalmente conhecidos por todo Brasil por suas festas típicas, e para o grupo de amigos da Marlene não é diferente, toda segunda quinzena do mês de Julho ela e seus amigos se reunem para tradicional mandiocada! Na festiva sempre se reúnem na casa da Marlene, o Chico, o Beto, o Bernardo, a Marina e a Iara. E como não poderia ser diferente o prato principal dessa reunião é a mandioca. Cada um deles come de uma a dez porções de mandioca e eles sempre avisam a Marlene com antecedência a respeito de quantas porções irão comer nesse dia. O tamanho da porção de cada um é diferente, mas sempre são os mesmos. As porções são as seguintes (em gramas):

   |Convidado |Porção (g)|
   |:--------:|:----:|
   | Chico    | 300  |
   | Bento    | 1500 |
   | Bernardo | 600  |
   | Marina   | 1000 |
   | Iara     | 150  |

Marlene por sua vez sempre come 225 gramas de mandioca. Cansada de todo ano ter que calcular quanta mandioca preparar ela te desafiou para escrever um programa que informe quanta mandioca deve ser preparada em gramas.

| Entrada | Saída |
|:-------:|:-----:|
|A entrada consiste de 5 inteiros cada um representando as porções que os convidados de dona Chica vão consumir. O primeiro inteiro representa as porções do Chico, o segundo do Bento, o terceiro do Bernardo, o quarto da Marina e o quinto a da Iara.| A saída consiste de um único inteiro que representa quanta mandioca Marlene deve preparar em gramas.|


|Exemplo de Entrada|  Exemplo de Saída  |
|:----------------:| :----------------: |
|     1 1 1 1 1    |       3775         |
|     2 2 2 2 2    |       7325         |