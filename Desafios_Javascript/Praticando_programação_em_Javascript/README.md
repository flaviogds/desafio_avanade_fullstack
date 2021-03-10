## Praticando programação em JavaScript

### [Desafio 1 - Quanta Mandioca?](./desafio_01.js)

Os meses de Junho e Julho são tradicionalmente conhecidos por todo Brasil por suas festas típicas, e para o grupo de amigos da Marlene não é diferente, toda segunda quinzena do mês de Julho ela e seus amigos se reunem para tradicional mandiocada! Na festiva sempre se reúnem na casa da Marlene, o Chico, o Beto, o Bernardo, a Marina e a Iara. E como não poderia ser diferente o prato principal dessa reunião é a mandioca. Cada um deles come de uma a dez porções de mandioca e eles sempre avisam a Marlene com antecedência a respeito de quantas porções irão comer nesse dia. O tamanho da porção de cada um é diferente, mas sempre são os mesmos. As porções são as seguintes (em gramas):

 * O Chico come 300
 * O Bento come 1500
 * O Bernardo come 600
 * A Marina 1000
 * A Iara come 150

 Marlene por sua vez sempre come 225 gramas de mandioca. Cansada de todo ano ter que calcular quanta mandioca preparar ela te desafiou para escrever um programa que informe quanta mandioca deve ser preparada em gramas.

| Entrada | 
| :-----: | 
| A entrada consiste de 5 inteiros cada um representando as porções que os convidados de dona Chica vão consumir. O primeiro inteiro representa as porções do Chico, o segundo do Bento, o terceiro do Bernardo, o quarto da Marina e o quinto a da Iara.

| Saída |
|:-----:|
| A saída consiste de um único inteiro que representa quanta mandioca Marlene deve preparar em gramas. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 1 <br> 1 <br> 1 <br> 1 <br> 1 | 3775 |
| 2 <br> 2 <br> 2 <br> 2 <br> 2 | 7325 |

### [Desafio 2 - Votação para Bobo da Corte](./desafio_02.js)

O Império dos Artificialistas é governado por um generoso Monarca. A personalizada do Monarca é conhecida por todo o mundo, principalmente por sua forma como valoriza o bom humor de seu povo, que tem o direito a diversidade cultura. Um dos destaques fica a cargo do bobo da corte, eleito anualmente em um concurso internacional.

O jovem Rafael é um comediante promissor, que sonha em se tornar o bobo da corte nesse grande concurso. Para isso, ele vem se preparando com muita dedicação há vários meses. Chegada a época do concurso do bobo da corte, um total de N candidatos se inscreveram, e como Rafael sabia que ser o primeiro candidato a se inscrever torna-se critério de desempate, foi o primeiro a se inscrever! O concurso dará apenas 5 minutos para cada participante e no final cada cidadão dará seu voto ao futuro bob da corte que achar melhor.

Sendo assim, após a votação, resta apenas apurar os resultados, que será realizado por urna eletrônica com N inteiros, correspondentes ao total de votos em cada candidato, ordenado pela ordem de inscrição. Sua missão é determinar se o jovem Rafael foi eleito ou não.

| Entrada | 
| :-----: | 
| A primeira linha da entrada contém um inteiro **N** (2 ≤ **N** ≤ 104). As **N** linhas seguintes conterão **N** inteiros positivos **v1** , . . . , **vN** , um em cada linha, correspondentes ao número de votos recebido por cada um dos candidatos, em ordem de inscrição. Sabendo-se que a população total é de 100.000 pessoas, o número total de votos não será superior a este valor.

| Saída |
|:-----:|
| Seu programa produzirá apenas uma linha contendo o caractere ‘S’ se o jovem Rafael foi o eleito para bobo da corte, ou o caractere ‘N’ caso contrário. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 3 <br> 1000 <br> 1000 <br> 1000 | S |
| 5 <br> 1 <br> 2 <br> 3 <br> 4 <br> 5| N |


### [Desafio 3 - Comunicação em Piralândia](./desafio_03.js)

Os cientistas brasileiros descobriram um exoplaneta a 1 bilhão de anos luz da terra. Ele foi carinhosamente batizado de Piralândia, uma homenagem a cidade de Piracicaba, onde moram os cientistas. Após algum tempo observando esse planeta, os cientistas puderam ver que nele haviam habitantes e, além disso, esses habitantes estavam tentando fazer contato com os cientistas através de uma comunicação numérica. 

Só que a numeração que encontraram estava invertida e como muitas delas foram descobertas, os cientistas chamaram você para conseguir automatizar esse processo. Logo, dado um número grande, sua tarefa é imprimir esse número invertido.

| Entrada | 
| :-----: | 
| O arquivo contém apenas uma linha de teste que é o número encontrado (0 < n < 9999999999).<br><br>Obs.: Perceba que o número lido é muito alto para armazenar em uma variável do tipo int, logo você irá precisar utilizar o tipo long, que para a leitura e impressão em C, você deve utilizar o %llu.

| Saída |
|:-----:|
| Imprimir o número lido invertido. Não esqueça de imprimir a quebra de linha (\n) no final, caso contrário você receberá (Presentation Error). |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 1234 | 4321 |
| 9876543210 | 0123456789 |


### [Desafio 4 - Contagem de Cédulas](./desafio_04.js)

Faça a leitura de um valor inteiro. Em seguida, calcule o menor número de notas possíveis (cédulas) onde o valor pode ser decomposto. As notas que você deve considerar são de 100, 50, 20, 10, 5, 2 e 1. Na sequência mostre o valor lido e a relação de notas necessárias.

| Entrada | 
| :-----: | 
| Você receberá um valor inteiro **N** (0 < **N** < 1000000).

| Saída |
|:-----:|
| Exiba o valor lido e a quantidade mínima de notas de cada tipo necessárias, seguindo o exemplo de saída abaixo. Após cada linha deve ser imprimido o fim de linha. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 576 | 576 <br> 5 nota(s) de R$ 100,00 <br> 1 nota(s) de R$ 50,00 <br> 1 nota(s) de R$ 20,00 <br> 0 nota(s) de R$ 10,00 <br> 1 nota(s) de R$ 5,00  <br> 0 nota(s) de R$ 2,00 <br> 1 nota(s) de R$ 1,00 |
| 11257 | 11257 <br> 112 nota(s) de R$ 100,00 <br> 1 nota(s) de R$ 50,00 <br> 0 nota(s) de R$ 20,00 <br> 0 nota(s) de R$ 10,00 <br> 1 nota(s) de R$ 5,00  <br> 1 nota(s) de R$ 2,00 <br> 0 nota(s) de R$ 1,00 |
| 503 | 503 <br> 5 nota(s) de R$ 100,00 <br> 0 nota(s) de R$ 50,00 <br> 0 nota(s) de R$ 20,00 <br> 0 nota(s) de R$ 10,00 <br> 0 nota(s) de R$ 5,00 <br> 1 nota(s) de R$ 2,00 <br> 1 nota(s) de R$ 1,00 |

### [Desafio 5 - Folha de Pagamento](./desafio_05.js)

Precisamos saber quanto uma determinada empresa deve pagar para seus colaboradores, porém temos apenas a quantidade de horas trabalhadas e o valor hora. Escreva um programa que leia o número de um colaborador, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse colaborador. Em seguida, apresente o número e o salário do colaborador, com duas casas decimais.

| Entrada | 
| :-----: | 
| Você receverá 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada.

| Saída |
|:-----:|
| Exiba o número e o salário do colaborador, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 25 <br> 100 <br> 5.50 | NUMBER = 25 <br> SALARY = U$ 550.00 |
| 1 <br> 200 <br> 20.50 | NUMBER = 1 <br> SALARY = U$ 4100.00 |
| 6 <br> 145 <br> 15.55 | NUMBER = 6  <br> SALARY = U$ 2254.75 |