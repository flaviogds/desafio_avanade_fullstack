## Praticando Programação em Kotlin

### [Desafio 1 - O jogo Matemático de Paula](./desafio_01.kt)

Paula simplesmente adora matemática. Seu maior passatempo é ficar inventando jogos ou atividades que a envolvam para brincar com seus amiguinhos. Obviamente, nem todos eles não são tão apaixonados assim por matemática e têm muita dificuldade para resolver as brincadeiras propostas por ela. Agora Paula inventou um pequeno passatempo que envolve 3 caracteres: um dígito numérico, uma letra e outro dígito numérico.

Se a letra for maiúscula, deve-se subtrair o primeiro dígito do segundo. Se a letra for minúscula, deve-se somar ambos os dígitos e se os DÍGITOS forem iguais, deve-se desconsiderar a letra e mostrar o produto entre os dois dígitos. Ela pediu para seu amigo Marcelo, que é bom em programação, para criar um programa para que encontre a solução para cada uma das sequências que Paula lhe apresentar.

| Entrada | 
| :-----: | 
| A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N, indicando o número de casos de teste que virão a seguir. Cada caso de teste é uma sequência de três caracteres criada por Paula. Esta sequência contém na primeira posição um caractere de '0' a '9', na segunda posição uma letra maiúscula ou minúscula do alfabeto e na terceira posição outro caractere de '0' a '9'.

| Saída |
|:-----:|
| Para cada caso de teste, deve ser impressa uma linha com um valor inteiro que representa a solução da sequência proposta por Paula. |

| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
| 5 <br> 4A5 <br> 3A3 <br> 4f2 <br> 2G4 <br> 7Z1 | 1 <br> 9 <br> 6 <br> 2 <br> -6 |

### [Desafio 2 - Conversão Simples de Base](./desafio_02.kt)

Neste problema você é solicitado a escrever um simples programa de conversão de base. A entrada será um valor hexadecimal ou decimal. Você deverá converter cada valor da entrada. Se o valor for hexadecimal, você deve convertê-lo para decimal e vice-versa. O valor hexadecimal inicia sempre com “0x” ou também, é aquele valor cuja segunda casa contém a letra 'x'.

| Entrada | 
| :-----: | 
| A entrada contém vários casos de teste. Cada linha de entrada, com exceção da última, contém um número não-negativo, decimal ou hexa. O valor decimal será menor ou igual a 231. A última linha contém um número negativo que não deve ser processado, indicando o encerramento do programa.

| Saída |
|:-----:|
| Para cada linha de entrada (exceto a última) deve ser produzido uma linha de saída. Todo número hexadecimal deve ser precedido na saída por '0x' (zero xis). |
 
| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
| 4 <br> 7 <br> 44 <br> 0x80685 <br> -1 | 0x4 <br> 0x7 <br> 0x2C <br> 525957 |

### [Desafio 3 - Bob Conduite](./desafio_03.kt)

Você tem em mãos dois cabos circulares de energia. O primeiro cabo tem raio R1 e o segundo raio R2. Você precisa comprar um conduite circular (veja a imagem abaixo que ilustra um conduite) de maneira a passar os dois cabos por dentro dele:

Qual o menor raio do conduite que você deve comprar? Em outras palavras, dado dois círculos, qual o raio do menor círculo que possa englobar ambos os dois?

| Entrada | 
| :-----: | 
| Na primeira linha teremos um inteiro T (T ≤ 10000), indicando o número de casos de teste. Na única linha de cada caso teremos dois números inteiros R1 e R2, indicando os respectivos raios. Os inteiros serão positivos e todas as contas caberão em um inteiro normal de 32 bits.

| Saída |
|:-----:|
| Em cada caso, imprima o menor raio possível em uma única linha |

| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
| 3 <br> 1 1 <br> 2 8 <br> 8 2 | 2  <br> 10 <br> 10 |