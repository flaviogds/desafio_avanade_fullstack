## Desafios Aritméticos em C#

### [Desafio 1 - Média 1](./desafio_01.cs)

Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

| Entrada | 
| :-----: | 
| O arquivo de entrada contém 2 valores com uma casa decimal cada um.

| Saída |
|:-----:|
| Calcule e imprima a variável MEDIA conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um espaço em branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double) e como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error". |
 
| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
| 5.0 <br> 7.1 | MEDIA = 6.43182 |
| 0.0 <br> 7.1 | MEDIA = 4.84091 |
| 10.0 <br> 10.0 | MEDIA = 10.00000 |

### [Desafio 2 - Crescimento Populacional](./desafio_02.cs)

O Governador do Estado quer saber sobre as taxas de crescimento das cidades. De acordo com dados da população e a taxa de crescimento de duas cidades quaisquer (A e B), ele quer que você calcule quantos anos levará para que a cidade menor (A) cresça mais em população que a cidade maior (B).

Claro que o Governador quer saber apenas para as cidades cuja taxa de crescimento da cidade A é maior do que a taxa de crescimento da cidade B, portanto, previamente já separou para você apenas os casos de teste que tem a taxa de crescimento maior para a cidade A.

Desenvolva um programa que apresente o tempo, em anos, para cada caso.

Porém, em alguns casos o tempo pode ser muito grande, e o Governador não se interessa em saber exatamente o tempo para estes casos, já que ele pode não estar mais eleito. Basta que você informe, nesta situação, a mensagem "Mais de 1 século.".

| Entrada | 
| :-----: | 
| A primeira linha da entrada contém um único inteiro **T**, indicando o número de casos de teste (1 ≤ **T** ≤ 3000). Cada caso de teste contém 4 números: dois inteiros **PA** e **PB** (100 ≤ **PA** < 1000000, **PA** < **PB** ≤ 1000000) indicando respectivamente a população de **A** e **B**, e dois valores **G1** e **G2** (0.1 ≤ **G1** ≤ 10.0, 0.0 ≤ **G2** ≤ 10.0, **G2** < **G1**) com um digito após o ponto decimal cada, indicando respectivamente o crescimento populacional de **A** e **B** (em percentual).

**Atenção**: A população é sempre um valor inteiro, portanto, um crescimento de 2.5 % sobre uma população de 100 pessoas resultará em 102 pessoas, e não 102.5 pessoas, enquanto um crescimento de 2.5% sobre uma população de 1000 pessoas resultará em 1025 pessoas. Além disso, não utilize variáveis de precisão simples para as taxas de crescimento.

| Saída |
|:-----:|
| Imprima, para cada caso de teste, quantos anos levará para que a cidade A ultrapasse a cidade B em número de habitantes. Obs.: se o tempo for mais do que 100 anos o programa deve apresentar a mensagem: Mais de 1 seculo. Neste caso, é melhor interromper o programa imediatamente após passar de 100 anos, caso contrário você poderá receber como resposta da submissão deste problema "Time Limit Exceeded". |

| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
| 100 150 1.0 0 <br> 90000 120000 5.5 3.5 <br> 56700 72000 5.2 3.0 <br> 123 2000 3.0 2.0 <br> 100000 110000 1.5 0.5 <br> 62422 484317 3.1 1.0 | 51 anos. <br> 16 anos. <br> 12 anos. <br> Mais de 1 seculo. <br> 10 anos. <br> 100 anos. |

### [Desafio 3 - Bazinga! ](Desafios_C_Sharp\Introdução_a_Programação_com_C_Sharp\desafio_02-1.cs)

Em um episódio da aclamada série The Big Ban Theor dois pernagens, Sheldon e Raj, discutem qual dos dois é o melhor: o filme Saturn 3 ou a série Deep Space 9. A sugestão de Raj para a resolução do impasse é uma disputa de Pedra-Papel-Tesoura. Contudo, Sheldon argumenta que, se as partes envolvidas se conhecem, entre 75% e 80% das disputas de Pedra-Papel-Tesoura terminam empatadas, e então sugere o Pedra-Papel-Tesoura-Lagarto-Spock.

As regras do jogo proposto são:

1. a tesoura corta o papel;
2. o papel embrulha a pedra;
3. a pedra esmaga o lagarto;
4. o lagarto envenena Spock;
5. Spock destrói a tesoura;
6. a tesoura decapita o lagarto;
7. o lagarto come o papel;
8. o papel contesta Spock;
9. Spock vaporiza a pedra;
10. a pedra quebra a tesoura.

Conhecendo os personagens, sabemos que caso Sheldon vencesse, ele gritaria a vitória com um "Bazinga!". Se Raj vencesse, Sheldon o acusaria de ter trapaceado. Agora, se desse empate, Sheldon não descansaria e insistira para jogarem de novo até que seja decidido. Sabendo dessas ações, faça um programa que imprima a provável reação de Sheldon.

| Entrada | 
| :-----: | 
| A entrada consiste em uma série de casos de teste. A primeira linha contém um inteiro positivo T (T ≤ 100), que representa o número de casos de teste. Cada caso de teste é representado por uma linha da entrada, contendo as escolhas de Sheldon e Raj, respectivamente, separadas por um espaço em branco. As escolhas possíveis são as personagens do jogo: pedra, papel, tesoura, lagarto e Spock.

| Saída |
|:-----:|
| Para cada caso de teste deverá ser impressa a mensagem "Caso #t: R", onde t é o número do caso de teste (cuja contagem se inicia no número um) e R é uma das três reações possíveis de Sheldon: "Bazinga!", "Raj trapaceou!", ou "De novo!". |


|Exemplo de Entrada|  Exemplo de Saída  |
|:----------------:| :----------------: |
| 3 <br> papel pedra <br> lagarto tesoura <br> Spock Spock | Caso #1: Bazinga! <br> Caso #2: Raj trapaceou! <br> Caso #3: De novo! |

### [Desafio 4 - Tempo de um Evento ](./desafio_04.cs)

Pedrinho está organizando um evento em sua Universidade. O evento deverá ser no mês de Abril, iniciando e terminando dentro do mês. O problema é que Pedrinho quer calcular o tempo que o evento vai durar, uma vez que ele sabe quando inicia e quando termina o evento.

Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá ajudar Pedrinho a calcular a duração deste evento.

| Entrada | 
| :-----: | 
| Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e o dia do mês no qual o evento vai começar. Na linha seguinte, será informado o momento no qual o evento vai iniciar, no formato hh : mm : ss. Na terceira e quarta linha de entrada haverá outra informação no mesmo formato das duas primeiras linhas, indicando o término do evento.

| Saída |
|:-----:|
| Na saída, deve ser apresentada a duração do evento, no seguinte formato:

W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto. |

|Exemplo de Entrada|  Exemplo de Saída  |
|:----------------:| :----------------: |
| Dia 5 <br> 08 : 12 : 23 <br> Dia 9 <br> 06 : 13 : 23 | 3 dia(s) <br> 22 hora(s) <br> 1 minuto(s) <br> 0 segundo(s) |

### [Desafio 5 - Comunicação em Piralândia](./desafio_05.cs)

Os cientistas brasileiros descobriram um exoplaneta a 1 bilhão de anos luz da terra. Ele foi carinhosamente batizado de Piralândia, uma homenagem a cidade de Piracicaba, onde moram os cientistas. Após algum tempo observando esse planeta, os cientistas puderam ver que nele haviam habitantes e, além disso, esses habitantes estavam tentando fazer contato com os cientistas através de uma comunicação numérica.  
Só que a numeração que encontraram estava invertida e como muitas delas foram descobertas, os cientistas chamaram você para conseguir automatizar esse processo. Logo, dado um número grande, sua tarefa é imprimir esse número invertido.

| Entrada | 
| :-----: | 
| O arquivo contém apenas uma linha de teste que é o número encontrado (0 < n < 9999999999).  
Obs.: Perceba que o número lido é muito alto para armazenar em uma variável do tipo int, logo você irá precisar utilizar o tipo long, que para a leitura e impressão em C, você deve utilizar o %llu.

| Saída |
|:-----:|
| Imprimir o número lido invertido. Não esqueça de imprimir a quebra de linha (\n) no final, caso contrário você receberá (Presentation Error). |


|Exemplo de Entrada|  Exemplo de Saída  |
|:----------------:| :----------------: |
| 1234 <br> 4321 | 9876543210 <br> 0123456789 |