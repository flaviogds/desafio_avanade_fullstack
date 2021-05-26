## Solucionando Problemas em Kotlin

### [Desafio 1 - Taxa de Imposto de Renda](./desafio_01.kt)

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

### [Desafio 2 - Área do Círculo](./desafio_02.kt)

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

### [Desafio 3 - Primo Rápido](./desafio_03.kt)

Mariazinha sabe que um Número Primo é aquele que pode ser dividido somente por 1 (um) e por ele mesmo. Por exemplo, o número 7 é primo, pois pode ser dividido apenas pelo número 1 e pelo número 7 sem que haja resto. Então ela pediu para você fazer um programa que aceite diversos valores e diga se cada um destes valores é primo ou não. Acontece que a paciência não é uma das virtudes de Mariazinha, portanto ela quer que a execução de todos os casos de teste que ela selecionar (instâncias) aconteçam no tempo máximo de um segundo, pois ela odeia esperar.

| Entrada | 
| :-----: | 
| A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 200), correspondente ao número de casos de teste. Seguem N linhas, cada uma contendo um valor inteiro X (1 < X < 231) que pode ser ou não, um número primo. |

| Saída |
|:-----:|
| Para cada caso de teste imprima a mensagem “Prime” (Primo) ou “Not Prime” (Não Primo), de acordo com o exemplo abaixo. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 3 <br> 123321 <br> 123 <br> 103 | Not Prime  <br> Not Prime <br> Prime |

### [Desafio 4 - A Corrida de Tartarugas](./desafio_04.kt)

A corrida de tartarugas é um esporte que cresceu muito nos últimos anos, fazendo com que vários competidores se dediquem a capturar tartarugas rápidas, e treina-las para faturar milhões em corridas pelo mundo. Porém a tarefa de capturar tartarugas não é uma tarefa muito fácil, pois quase todos esses répteis são bem lentos. Cada tartaruga é classificada em um nível dependendo de sua velocidade:

* Nível 1: Se a velocidade é menor que 10 cm/h .
* Nível 2: Se a velocidade é maior ou igual a 10 cm/h e menor que 20 cm/h .
* Nível 3: Se a velocidade é maior ou igual a 20 cm/h .

Sua tarefa é identificar qual o nível de velocidade da tartaruga mais veloz de um grupo.

| Entrada | 
| :-----: | 
|A entrada consiste de múltiplos casos de teste, e cada um consiste em duas linhas: A primeira linha contém um inteiro **L** (1 ≤ **L** ≤ 500) representando o número de tartarugas do grupo, e a segunda linha contém **L** inteiros **Vi** (1 ≤ **Vi** ≤ 50) representando as velocidades de cada tartaruga do grupo.|

| Saída |
|:-----:|
|Para cada caso de teste, imprima uma única linha indicando o nível de velocidade da tartaruga mais veloz do grupo.|
 
| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
| 10 <br> 10 10 10 10 15 18 20 15 <br> 11 10 <br> 10 <br> 1 5 2 9 5 5 8 4 4 3 <br> 10  <br> 19 9 1 4 5 8 6 11 9 7 | 3 <br> 1 <br> 2|

### [Desafio 5 - Figurinhas](./desafio_05.kt)

Ricardo e Vicente são aficionados por figurinhas. Nas horas vagas, eles arrumam um jeito de jogar um “bafo” ou algum outro jogo que envolva tais figurinhas. Ambos também têm o hábito de trocarem as figuras repetidas com seus amigos e certo dia pensaram em uma brincadeira diferente. Chamaram todos os amigos e propuseram o seguinte: com as figurinhas em mãos, cada um tentava fazer uma troca com o amigo que estava mais perto seguindo a seguinte regra: cada um contava quantas figurinhas tinha. Em seguida, eles tinham que dividir as figurinhas de cada um em pilhas do mesmo tamanho, no maior tamanho que fosse possível para ambos. Então, cada um escolhia uma das pilhas de figurinhas do amigo para receber. Por exemplo, se Ricardo e Vicente fossem trocar as figurinhas e tivessem respectivamente 8 e 12 figuras, ambos dividiam todas as suas figuras em pilhas de 4 figuras (Ricardo teria 2 pilhas e Vicente teria 3 pilhas) e ambos escolhiam uma pilha do amigo para receber.

| Entrada | 
| :-----: | 
| A primeira linha da entrada contém um único inteiro N (1 ≤ N ≤ 3000), indicando o número de casos de teste. Cada caso de teste contém 2 inteiros F1 (1 ≤ F1 ≤ 1000) e F2 (1 ≤ F2 ≤ 1000) indicando, respectivamente, a quantidade de figurinhas que Ricardo e Vicente têm para trocar. |

| Saída |
|:-----:|
| Para cada caso de teste de entrada haverá um valor na saída, representando o tamanho máximo da pilha de figurinhas que poderia ser trocada entre dois jogadores. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 3 <br> 8 12 <br> 9 27 <br> 259 111 | 4 <br> 9 <br> 37 |