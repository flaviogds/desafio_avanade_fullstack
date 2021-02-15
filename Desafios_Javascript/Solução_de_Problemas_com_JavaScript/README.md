## Solução de Problemas com JavaScript

### [Desafio 1 - Contagem repetida de números](\desafio_01.js)

Neste desafio sua tarefa será ler vários números e em seguida dizer quantas vezes cada número aparece, ou seja, deve-se escrever cada um dos valores distintos que aparecem na entrada por ordem crescente de valor.


| Entrada | 
| :-----: | 
| A primeira linha de entrada contem um único inteiro *N*, que indica a quantidade de valores que serão lidos para X (1 ≤ *N* ≤ 2000) logo em seguida. Com certeza cada número não aparecerá mais do que 20 vezes na entrada de dados.

| Saída |
|:-----:|
| Imprima a saída de acordo com o exemplo fornecido abaixo, indicando quantas vezes cada um deles aparece na entrada por ordem crescente de valor. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
|          7         | 4 aparece 1 vez(es)   |
|          8         | 8 aparece 2 vez(es)   |
|          10        | 10 aparece 3 vez(es)  |
|          8         | 260 aparece 1 vez(es) |
|          260       |                       |
|          4         |                       |
|          10        |                       |
|          10        |                       |
	
### [Desafio 2 - Vogais Extraterrestres](\desafio_02.js)

Desde o Gerador de Improbabilidade Infinita, muitos nem questionam sobre vidas extraterrestres, e se aprofundam em questionamentos mais improváveis, como, por exemplo, será que seres de outros planetas usam os mesmos caracteres que nós para se comunicarem? E se isso for verdade, será que usam as mesmas letras vogais que a gente? Pensando nisso, vários cientistas criaram inúmeros tipos de alfabetos alienígenas, usando as letras do nosso alfabeto, além dos dígitos, de 0 a 9, com as suas respectivas vogais. Baseados nisto, eles querem a sua ajuda para identificar vogais em alfabetos alienígenas e realizar a contagem.

Escreva um programa que, dado uma sequência de vogais, em um determinado alfabeto alienígena, contabilize, em um texto escrito com o mesmo alfabeto, quantas vogais o mesmo possui.


| Entrada | 
| :-----: | 
| Haverá diversos casos de teste. Cada caso de teste é formado por duas linhas. A primeira linha informa uma palavra, formada por todas as vogais alienígenas de um determinado planeta. A segunda linha contém uma frase formada por letras do mesmo alfabeto. A entrada termina com fim de arquivo.

| Saída |
|:-----:|
| Para cada caso de teste, imprima a quantidade de vogais alienígenas correspondente. |
 
|              Exemplo de Entrada            |  Exemplo de Saída     |
|              :----------------:            | :----------------:    |
|                    aeiou                   |          16           |
|     o rato roeu a roupa do rei de roma     |                       |
|                     4310                   |           8           |
|              t3st3 p4r4 c0d1f1c4r          |                       |
|                     kwy                    |           3           |
| the quick brown fox jumps over the lazy dog|                       |


### [Desafio 3 - Melhor amigo do Pablo](\desafio_03.js)

Todo final de ano ocorre uma festa na escola. As inscrições para participar da festa são abertas no início de julho. No momento da inscrição, o aluno pode escolher se quer ser "O Amigo do Pablo" na festa ou não. O mais lógico seria escolher a opção Sim, afinal, é um privilégio ser O Amigo do Pablo, já que ele é a pessoa mais descolada da escola. Porém, há indivíduos que definitivamente não pretendem ser O Amigo do Pablo, e por motivos desconhecidos.

Somente um será o escolhido. Em vista disso, muitos alunos que escolheram a opção Sim realizaram a inscrição diversas vezes para aumentar a própria probabilidade de ser O Amigo do Pablo. A diretora da escola pediu que você desenvolva um programa que organize as inscrições do site, pois está havendo um spam de inscrições. O critério para ser o escolhido é a quantidade de letras do primeiro nome, e em caso de empate, vence aquele que realizou primeiro a inscrição. A organização final dos inscritos deverá seguir a ordem de escolha (Sim ou Não), mas respeitando a ordem alfabética.

OBS.: Ninguém que escolheu a opção Não realizou a inscrição mais de uma vez.


| Entrada | 
| :-----: | 
| A entrada contém somente um caso de teste. Cada linha é composta pelo primeiro nome do participante (sem espaços), seguido da opção SIM (caso o usuário queira ser O Amigo do Pablo) ou NAO (caso não queira). A entrada termina assim que o usuário digita "FIM" (sem as aspas).

| Saída |
|:-----:|
| Seu programa deverá imprimir os inscritos pela ordem de escolha e por ordem alfabética, seguido do nome do vencedor. Imprima uma linha em branco entre a lista de inscritos e o nome do vencedor. |
 
| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
|      Joao NAO      |       Abhay        |
|      Carlos SIM    |       Aline        |
|      Abner NAO     |       Andres       |
|      Samuel SIM    |       Carlos       |
|      Ricardo NAO   |       Samuel       |
|      Abhay SIM     |       Abner        |
|      Samuel SIM    |       Joao         |
|      Andres SIM    |       Ricardo      |
|      Roberto NAO   |       Roberto      |
|      Carlos SIM    |                    |
|      Samuel SIM    |   Amigo do Habay:  |
|      Samuel SIM    |   Carlos           |
|      Abhay SIM     |                    |
|      Aline SIM     |                    |
|      Andres SIM    |                    |
|         FIM        |                    |
	
### [Desafio 4 - Entrevista embaraçosa](\desafio_04.js)

A nutricionista Juliana Alcantra é uma excelente profissional de sua área. Em determinado dia, ela foi entrevistada ao vivo para um jornal da cidade. No entanto, ficou um pouco nervosa na hora, e diante da situação, sua fala ficou um pouco distorcida, repetindo o final de cada palavra após dizer a mesma. Para que isso não aconteça novamente, ela precisa da sua ajuda para escrever um programa que omita a parte repetida, de modo que as palavras sejam pronunciadas como deveriam ser.

Escreva um programa que, dada uma palavra errada, a mesma seja corrigida.

| Entrada | 
| :-----: | 
| Haverá diversos casos de teste. Cada caso de teste é formado por uma palavra, de, no máximo, 30 caracteres, dita da forma errada. A entrada termina com fim de arquivo.

| Saída |
|:-----:|
| Para cada caso de teste, escreva a palavra devidamente corrigida. Analise os exemplos para verificar o padrão, de modo a consertar todos os casos. |
 
| Exemplo de Entrada |  Exemplo de Saída   |
| :----------------: | :----------------:  |
|    sanduicheiche   |     sanduiche       |
|    barrilarril     |      barril         |
|       ratoato      |       rato          |
|         sol        |        sol          |
|      coliseueu     |      coliseu        |
|      queijoijo     |       queijo        |
|     astroastro     |       astro         |
|          a         |         a           |
	
### [Desafio 5 - Conjuntos bons ou ruins?](\desafio_05.js)

Nesse algoritmo você deverá descobrir se um conjunto de palavras é bom ou ruim. Por definição, um conjunto é bom quando nenhuma palavra desse conjunto é um prefixo de outra palavra. Caso contrário, é considerado um conjunto ruim.

Por exemplo, {*dbc*, *dae*, *dbcde*} é um conjunto ruim, pois dbc é um prefixo de dbcde. Quando duas palavras são idênticas, definimos como uma sendo prefixo da outra.

| Entrada | 
| :-----: | 
| A entrada contém vários casos de teste. A primeira linha de cada caso de teste terá um inteiro N (1 ≤ N ≤ 10⁵), que representa a quantidade de palavras no conjunto. Segue então N linhas, cada uma tendo uma palavra de no máximo 100 letras minúsculas. A entrada termina quando N = 0 e não deve ser processada.

| Saída |
|:-----:|
| Para cada caso de teste, você deverá imprimir "Conjunto Bom", ou "Conjunto Ruim", conforme explicado acima.      |
 
| Exemplo de Entrada |  Exemplo de Saída   |
| :----------------: | :----------------:  |
|         3          |    Conjunto Ruim    |
|         abc        |    Conjunto Bom     | 
|         dae        |
|         abcde      |
|         2          |
|         abc        |
|         def        |
|         0          |


### [Desafio 6 - Produto e divisão](\desafio_06.js)

Você tem a obrigação de testar as calculadores, para que façam apenas operações de multiplicação e divisão. Além disso, o termo a ser digitado em cada operação, (o número exibido no visor que será dividido ou multiplicado), só pode conter um único dígito.

Quando ligada, a calculadora exibe o número 1. Após isso, o usuário pode digitar um número com um único dígito e escolher se esse número deve multiplicar ou dividir o número exibido anteriormente; o resultado da operação escolhida é então exibido na calculadora. Pode-se repetir esse processo quantas vezes quiser.

Apesar de ser permitido apenas números inteiros de um dígito, a calculadora permite exibir números com múltiplos dígitos e até mesmo números fracionários.

Apresentada a sequência de operações realizadas logo depois de ligada, seu objetivo é conferir o resultado exibido.

No primeiro caso de teste abaixo, o usuário deseja calcular o resultado da seguinte expressão: 1 × 2 × 1 × 3. Note que a primeira ocorrência do número 1 vem do fato da calculadora mostrar inicialmente 1 ao invés de 0.

No segundo caso de teste abaixo, o usuário deseja calcular o resultado da seguinte expressão: ((1/2)/3) × 6.

| Entrada | 
| :-----: | 
| A primeira e única linha da entrada contém um inteiro *N* (1 ≤ *N* ≤ 100 000). Cada uma das próximas *N* linhas contém um dígito e um caractere '*' ou '/', que representam uma operação realizada na calculadora.

| Saída |
|:-----:|
| O programa deve imprimir uma única linha contendo o resultado que deve ser exibido pela calculadora ao final de todas as operações.      |
 
| Exemplo de Entrada |  Exemplo de Saída   |
| :----------------: | :----------------:  |
|          3         |6
|          2 *
|          1 *
|          3 *
|          3         |1
|          2 /
|          3 /
|          6 *
|          11        |387420489
|          9 *
|          9 *
|          9 *
|          9 *
|          9 *
|          9 *
|          9 *
|          9 *
|          9 *
|          9 *
|          9 /


### [Desafio 7 - Barras de ouro](\desafio_07.js)

O feudo da Mesopotâmia é rico e o povo é cordial e alegre. Mas quando o assunto são impostos, é praticamente um roubo. Todo final de ano, cada feudo do país deve pagar uma determinada quantidade de quilos de ouro em impostos. Quando é chegado o momento de coletar os impostos, o Rei envia sua carruagem real para recolher o ouro devido, usando as estradas do reino.

Cada estrada liga dois feudos diferentes e podem ser percorridos em duas direções. Com as estradas é possível ir de um feudo a outro, possivelmente passando por feudos intermediários. Mas há apenas um caminho entre dois feudos diferentes.

Em cada feudo há um cofre real, utilizado para armazenamento do ouro de impostos. Os cofres reais são imensos, de forma que cada cofre tem capacidade de armazenar todo o ouro devido por todo o reino. A carruagem sai do feudo principal, percorrendo as estradas do reino, visitando os feudos para recolher o ouro devido, podendo usar qualquer cofre real para armazenar temporariamente uma parte do imposto recolhido, se necessário. Ao final da coleta, todo o ouro devido por todas os feudos devem estar armazenados no cofre real do feudo principal.

José como é o Rei, contratou o seu time para, dados a quantidade de ouro a ser recolhido em cada feudo (em kg), a lista das estradas do reino, com os respectivos comprimentos (em km) e a capacidade de carga da carruagem real (em kg), determine qual é a mínima distância que a carruagem deve percorrer para recolher todo o ouro devido.

| Entrada | 
| :-----: | 
| A primeira linha contém dois inteiros *N* e C indicando respectivamente o número de cidades e a capacidade de carga da carruagem (2 ≤ *N* ≤ 104 e 1 ≤ C ≤ 100). O feudo principal é identificado pelo número 1 e os outros feudos são identificadas por inteiros de 2 a *N* . A segunda linha contém *N* inteiros Ei representando a quantidade de imposto devido por cada feudo i (0 ≤ Ei ≤ 100 para 1 ≤ i ≤ *N* ). Cada uma das *N*-1 linhas seguintes contém três inteiros A , B e C , indicando que uma estrada liga o feudo A e o feudo B (1 ≤ A, B ≤ *N* ) e tem comprimento C (1 ≤ C ≤ 100).

| Saída |
|:-----:|
| Seu programa deve produzir uma única linha com um inteiro representando a menor distância que a carruagem real deve percorrer para recolher todo o imposto devido, em km.      |
 
| Exemplo de Entrada |  Exemplo de Saída   |
| :----------------: | :----------------:  |
|       6 10         |          44         |
|   0 10 10 10 10 10 |
|       1 4 7        |
|       5 1 2        |
|       3 5 3        |
|       2 5 2        |
|       6 5 2        |
|       3 10         |          58         |
|      10 10 12      |
|       1 2 5        |
|       2 3 7        |
|        5 9         |          10         |
|      5 2 6 3 6     |
|       1 2 1        |
|       2 3 1        |
|       2 4 1        |
|       2 5 1        |
















 



