## Introdução a Busca e Ordenação em Java

### [Desafio 1 - Ordenação de palavras por tamanho ](./desafio_01.java)

Crie um algoritmo para ordenar um conjunto de palavras pelo seu tamanho. Seu programa deve receber um conjunto de palavras e retornar este mesmo conjunto ordenado pelo tamanho das palavras decrescente, se o tamanho das palavras for igual, deve-se ordernar por ordem alfabética.  

| Entrada | 
| :-----: | 
| A primeira linha da entrada possui um único inteiro **N**, que indica o número de casos de teste. Cada caso de teste poderá conter de 1 a 50 palavras inclusive, e cada uma das palavras poderá conter entre 1 e 50 caracteres inclusive. Os caracteres poderão ser espaços, letras, ou números.

| Saída |
|:-----:|
| A saída deve conter o conjunto de palavras da entrada ordenado pelo tamanho das palavras e caso o tamanho das palavras for igual, deve-se ordernar por ordem alfabética.. Um espaço em branco deve ser impresso entre duas palavras. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 2 <br> One three four mond at midnight <br> one three five | midnight three four mond One at <br> three five one |

### [Desafio 2 - Encontre a maior substring ](./desafio_02.java)

Encontre a maior substring comum entre as duas strings informadas. A substring pode ser qualquer parte da string, inclusive ela toda. Se não houver subseqüência comum, a saída deve ser “0”. A comparação é case sensitive ('x' != 'X').

| Entrada | 
| :-----: | 
| A entrada contém vários casos de teste. Cada caso de teste é composto por duas linhas, cada uma contendo uma string. Ambas strings de entrada contém entre 1 e 50 caracteres ('A'-'Z','a'-'z' ou espaço ' '), inclusive, ou no mínimo uma letra ('A'-'Z','a'-'z').

| Saída |
|:-----:|
| O tamanho da maior subsequência comum entre as duas Strings. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| abcdef <br> cdofhij <br> TWO <br> FOUR <br> abracadabra <br> open <br> Hey This java is hot <br> Java is a new paradigm | 2 <br> 1 <br> 0 <br> 7 |

### [Desafio 3 - Validador de senhas com requisitos](./desafio_03.java)

Pedro e Fernando são os desenvolvedores em uma stratup e vão desenvolver o novo sistema de cadastro, e pediram a sua ajuda. Sua task é fazer o código que valide as senhas que são cadastradas, para isso você deve atentar aos requisitos a seguir:

 - A senha deve conter, no mínimo, uma letra maiúscula, uma letra minúscula e um número;
 - A mesma não pode ter nenhum caractere de pontuação, acentuação ou espaço;
 - Além disso, a senha pode ter de 6 a 32 caracteres.

| Entrada | 
| :-----: | 
| A entrada contém vários casos de teste e termina com final de arquivo. Cada linha tem uma string **S**, correspondente a senha que é inserida pelo usuário no momento do cadastro.

| Saída |
|:-----:|
| A saída contém uma linha, que pode ser “Senha valida.”, caso a senha tenha cada item dos requisitos solicitados anteriormente, ou “Senha invalida.”, se um ou mais requisitos não forem atendidos. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| Digital Innovation One <br> AbcdEfgh99 <br> DigitalInnovationOne123 <br> Digital Innovation One 123 <br> Aass9 <br> Aassd9 | Senha invalida. <br> Senha valida. <br> Senha valida. <br> Senha invalida. <br> Senha invalida. <br> Senha valida. |

### [Desafio 4 - Pedra, Papel, Tesoura, Lagarto e Spock ](./desafio_04.java)

Pedra-papel-tesoura-lagarto-Spock é uma expansão do clássico método de seleção em jogo de pedra-papel-tesoura. Atua sob o mesmo princípio básico, mas inclui outras duas armas adicionais: o lagarto (formado pela mão igual a uma boca de fantoche) e Spock (formada pela saudação dos vulcanos em Star Trek). Isso reduz as chances de uma rodada terminar em um empate. O jogo foi inventado por Sam Kass e Karen Bryla, como "Rock Paper Scissors Lizard Spock". As regras de vantagem são as seguintes:

- Tesoura corta papel
- Papel cobre pedra
- Pedra derruba lagarto
- Lagarto adormece Spock
- Spock derrete tesoura
- Tesoura prende lagarto
- Lagarto come papel
- Papel refuta Spock
- Spock vaporiza pedra
- Pedra quebra tesoura

Um dia, duas amigas, Fernanda e Marcia, decidiram apostar quem pagaria um almoço para o outro, com esta brincadeira. Sua missão será fazer um algoritmo que, baseado no que eles escolherem, informe quem irá ganhar ou se dará empate.

| Entrada | 
| :-----: | 
| Haverá diversos casos de teste. O primeiro número a ser lido será um inteiro, representando a quantidade de casos de teste. Cada caso de teste tem duas palavras, representando a escolha de Fernanda e de Marcia, respectivamente.

| Saída |
|:-----:|
| Para cada caso de teste, imprima quem venceu, ou se houve empate. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 3 <br> spock spock <br> tesoura spock <br> lagarto spock | empate <br> Marcia <br> Fernanda |

### [Desafio 5 - Atalhos para o Weblogger Brasil ](./desafio_05.java)

Você está ajudando a desenvolver um sistema de gerenciamento de weblog chamado Weblogger Brasil. Embora Weblogger Brasil coloque todo o conteúdo direto no website em HTML, nem todos autores apreciam usar tags HTML em seus textos. Para tornar a vida deles mais fáceis, Weblogger Brasil oferece uma sintaxe simples chamada atalhos para obter alguns efeitos textuais em HTML. Sua tarefa é, dado um documento escrito com atalhos, traduzi-lo para o HTML apropriado.  
Um atalho é usado para colocar texto em itálico. HTML faz isto com as tags ``<i>`` e ``</i>``, mas no Weblogger Brasil um autor pode simplesmente colocar um pedaço de texto entre dois caracteres de sublinhado, '_'. Portanto, onde um autor escreve

  ``Você _deveria_ ver a foca no zoologico!``
                
Weblogger Brasil vai publicar o seguinte:

  ``Você <i>deveria</i> ver a foca no zoologico!``
                
Outro atalho serve para colocar texto em negrito, o que, em HTML, é feito com as tags ``<b>`` e ``</b>``. Weblogger Brasil permite aos autores fazer o mesmo com pares do caractere asterisco, '*'. Quando um autor escreve o texto

  ``Marque a conta *a receber* para *paga*.``
                
ele vai sair no website assim:

  ``Marque a conta <b>a receber</b> para <b>paga</b>``

| Entrada | 
| :-----: | 
| A entrada contem vários casos de teste. Cada caso de teste é composto por uma linha que contem uma string **texto**, com zero ou mais usos dos atalhos itálico e negrito. Cada **texto** tem de 1 a 50 caracteres, inclusive. Os únicos caracteres permitidos no **texto** são os caracteres alfabéticos (de 'a' a 'z' e de 'A' a 'Z'), o sublinhado ('_'), o asterisco ('*'), o caractere de espaço e os símbolos de pontuação ',', ';', '.', '!', '?', '-', '(' e ')'. O caractere sublinhado '_' ocorre no **texto** um número par de vezes. O asterisco '*' também aparece um número par de vezes no **texto**. Nenhuma substring do **texto** entre um par de sublinhados ou entre um par de asteriscos pode conter outros sublinhados ou asteriscos, respectivamente.

| Saída |
|:-----:|
| Para cada linha de entrada seu programa deve gerar uma linha de saída com o texto traduzido para HTML como demonstrado nos exemplos abaixo. Para tornar itálico um pedaço de texto no HTML, você deve iniciar este pedaço com a tag ``<i>`` e terminá-lo com a tag ``</i>``. Para texto em negrito, inicie com ``<b>`` e termine com ``</b>``. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| Você _deveria_ ver a foca no zoologico! <br> Marque a conta *a receber* para *paga* | Você ``<i>``deveria``</i>`` ver a foca no zoologico!  <br> Marque a conta ``<b>``a receber``</b>`` para ``<b>``paga``</b>``.