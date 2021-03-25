## Resolvendo Algoritmos com Java

### [Desafio 1 - Coração das cartas](./desafio_01.java)

Marcos decidiu abandonar o bar da faculdade onde jogava truco para dedicar-se ao mundo da programação. Para que isso fosse mais fácil, decidiu criar um novo jogo de cartas. 

O coração das cartas, como Marcos apelidou o jogo, é individual e jogado com três pilhas, inicialmente com o mesmo número de cartas. Cada carta tem um valor numérico inteiro de 0 até 9. O jogador pode, a qualquer momento ver o valor de qualquer carta, mas só pode jogar com as cartas que estão no topo das pilhas. Em cada rodada, o jogador pode remover qualquer combinação de cartas que estejam no topo da pilha (pode escolher 1, 2 ou até 3 cartas) cuja soma dos valores seja múltiplo de 3. O jogo é ganho quando todas as cartas forem removidas das pilhas. Se alguma carta não puder ser removida, perde-se o jogo.

| Entrada | 
| :-----: | 
| A entrada é composta por várias instâncias Cada instância é iniciada por um inteiro N (0 ≤ N ≤ 100), que identifica o número de cartas em cada pilha. A entrada termina quando N = 0. Cada uma das N linhas seguintes contém três inteiros A, B e C, que descrevem os valores numéricos das cartas em um nível da pilha (0 ≤ A, B, C ≤  9). As pilhas são descritas do topo até o fundo.

| Saída |
|:-----:|
| Para cada instância, imprima uma linha contendo o número 1 se o jogador pode ganhar a instância do jogo ou o número 0 se o jogo for impossível. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 2 <br> 1 1 1 <br> 2 0 4 <br> 3 <br> 1 0 0 <br> 0 1 0 <br> 0 0 0 <br> 0 | 1  <br> 0 |

### [Desafio 2 - Abreviando posts do blog](./desafio_02.java)

Leonardo é um nômade digital e viaja pelo mundo programando em diferentes cafés das cidades por onde passa. Recentemente, resolveu criar um blog, para compartilhar suas experiências e aprendizados com seus amigos.

Para criação do blog, ele optou por utilizar uma ferramenta pronta, que há um limite de caracteres que se pode escrever por dia, e Leonardo está preocupado que essa limitação, afinal, irá impedir de contar suas melhores experiências. Para contornar esse problema, decidiu usar um sistema de abreviação de palavras em seus posts.

O sistema de abreviações é simples e funciona da seguinte forma: para cada letra, é possível escolher uma palavra que inicia com tal letra e que aparece no post. Uma vez escolhida a palavra, sempre que ela aparecer no post, ela será substituída por sua letra inicial e um ponto, diminuindo assim o número de caracteres impressos na tela.

Por exemplo, na frase: “hoje eu programei em Python”, podemos escolher a palavra “programei” para representar a letra ‘p', e a frase ficará assim: “hoje eu p. em Python”, economizando assim sete caracteres. Uma mesma palavra pode aparecer mais de uma vez no texto, e será abreviada todas as vezes. Note que, se após uma abreviação o número de caracteres não diminuir, ela não deve ser usada, tal como no caso da palavra “eu” acima.

Leonardo precisa que seu post tenha o menor número de caracteres possíveis, e por isso pediu a sua ajuda. Para cada letra, escolha uma palavra, de modo que ao serem aplicadas todas as abreviações, o texto contenha o menor número de caracteres possíveis.

| Entrada | 
| :-----: | 
| Haverá diversos casos de teste. Cada caso de teste é composto de uma linha, contendo uma frase de até 10⁴ caracteres. A frase é composta de palavras e espaços em branco, e cada palavra é composta de letras minúsculas ('a'-'z'), e contém entre 1 e 30 caracteres cada. <br> O último caso de teste é indicado quando a linha dada conter apenas um “.”, o qual não deverá ser processado. |

| Saída |
|:-----:|
| Para cada caso de teste, imprima uma linha contendo a frase já com as abreviações escolhidas e aplicadas. <br> Em seguida, imprima um inteiro N, indicando o número de palavras em que foram escolhidas uma letra para a abreviação no texto. Nas próximas N linhas, imprima o seguinte padrão “C. = P”, onde C é a letra inicial e P é a palavra escolhida para tal letra. As linhas devem ser impressas em ordem crescente da letra inicial. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| abcdef abc abc abc <br> . | a. abc abc abc <br> 1 <br> a. = abcdef |

### [Desafio 3 - Combinação de strings](./desafio_03.java)

Crie um algoritmo que receba dois inputs que sejam strings e combine-as alternando as letras de cada string. 

Deve começar pela primeira letra da primeira string, seguido pela primeira letra da segunda string, em seguida pela segunda letra da primeira string e continuar dessa forma sucessivamente.

As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string resultante e retornada.

| Entrada | 
| :-----: | 
| A entrada contém vários casos de teste. A primeira linha contém um inteiro N que indica a quantidade de casos de teste que vem a seguir. Cada caso de teste é composto por uma linha que contém duas cadeias de caracteres, cada cadeia de caracteres contém entre 1 e 50 caracteres inclusive. |

| Saída |
|:-----:|
| Combine as duas cadeias de caracteres da entrada como mostrado no exemplo abaixo e exiba a cadeia resultante. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 2 <br> aA Bb <br> aa bb | aBAb <br> abab |



### [Desafio 4 - Hash Mágico](./desafio_04.java)

O conceito de hash é transformar uma grande quantidade de dados em uma pequena quantidade de informações. Nesse algoritmo você terá uma entrada com várias linhas, cada uma com uma string. 

O valor de cada caracter é computado como segue:

Valor = (Posição no alfabeto) + (Elemento de entrada) + (Posição do elemento)

As posições iniciam em zero. 'A' tem posição 0 no alfabeto, ‘C' tem posição 2 no alfabeto, ... O cálculo de hash retornado é a soma de todos os caracteres da entrada. Por exemplo, se a entrada for:

CBA

DDD

então cada caractere deverá ser computado como segue:

2 = 2 + 0 + 0 : 'C' no elemento 0 posição 0

2 = 1 + 0 + 1 : 'B' no elemento 0 posição 1

2 = 0 + 0 + 2 : 'A' no elemento 0 posição 2

4 = 3 + 1 + 0 : 'D' no elemento 1 posição 0

5 = 3 + 1 + 1 : 'D' no elemento 1 posição 1

6 = 3 + 1 + 2 : 'D' no elemento 1 posição 2

O cálculo final de hash será 2+2+2+4+5+6 = 21.

| Entrada | 
| :-----: | 
| A entrada contém vários casos de teste. A primeira linha de entrada contém um inteiro N que indica a quantidade de casos de teste. Cada caso de teste inicia com um inteiro L (1 ≤ L ≤ 100) que indica a quantidade de linhas que vem a seguir. Cada uma destas L linhas contém uma string com até 50 letras maiúsculas ('A' - 'Z'). |

| Saída |
|:-----:|
| Para cada caso de teste imprima o valor de hash que é calculado conforme o exemplo apresentado acima. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 1 <br> 2 <br> OSADOISAJDSAOIDJA <br> ASOIJDOSAJDASOIDJA |	594 |

### [Desafio 5 - O tabuleiro secreto](./desafio_05.java)

O senhor Milli, morador da cidade Petland, é o famoso proprietário da maior fábrica de jogos de tabuleiros do mundo. 

Recentemente, ele teve a ideia de lançar um novo jogo exclusivo de tabuleiro, que ele apelidou de Tabuleiro da Frequência.

O jogo ocorre da seguinte forma. Inicialmente, um tabuleiro com dimensões N × N é dado contendo apenas 0’s. Depois disso, Q operações são propostas, podendo ser de 4 tipos:

* 1 X R: Atribuir o valor R a todos os números da linha X;
* 2 X R: Atribuir o valor R a todos os números da coluna X;
* 3 X: Imprimir o valor mais frequente na linha X;
* 4 X: Imprimir o valor mais frequente da coluna X.

Milli não é muito bom com computadores, mas é bastante preguiçoso. Sabendo que você é um dos melhores programadores do mundo, ele precisa sua ajuda para resolver este problema.

| Entrada | 
| :-----: | 
| A primeira linha da entrada é composta por dois inteiros N e Q (1 ≤ N, Q ≤ 105), representando, respectivamente, o tamanho do tabuleiro e a quantidade de operações. As próximas Q linhas da entrada vão conter as Q operações. O primeiro inteiro de cada linha vai indicar o tipo da operação. Caso seja 1 ou 2, será seguido por mais dois inteiros X (1 ≤ X ≤ N) e R (0 ≤ R ≤ 50). Caso seja 3 ou 4, será seguido por apenas mais um inteiro X. |

| Saída |
|:-----:|
| Para cada operação do tipo 3 ou 4, seu programa deve produzir uma linha, contendo o valor da resposta correspondente. Se uma linha ou coluna tiver dois ou mais valores que se repetem o mesmo número de vezes, você deve imprimir o maior deles. Por exemplo, se uma linha tem os valores [5,7,7,2,5,2,1,3], tanto o 2, 5 e 7 se repetem duas vezes, então a resposta será 7, pois é o maior deles.      |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 2 4 <br> 1 1 1 <br> 2 2 2 <br> 3 1 <br> 3 2 | 2 <br> 2 |
| 3 6 <br> 1 1 2 <br> 1 2 3 <br> 1 3 4 <br> 4 3 <br> 1 3 0 <br> 4 3 |4 <br> 3 |