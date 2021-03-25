## Solução de Problemas Essenciais com C#

### [Desafio 1 - Quadrado e ao Cubo](./desafio_01.cs)

Você terá o desafio de escrever um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.


| Entrada | 
| :-----: | 
| O arquivo de entrada contém um número inteiro positivo N.

| Saída |
|:-----:|
| Imprima a saída conforme o exemplo fornecido. |
 
| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :---------------- |
| 5 | 1 1 1 <br> 2 4 8 <br> 3 9 27 <br> 4 16 64 <br> 5 25 125 |



### [Desafio 2 - A Corrida de Tartarugas](./desafio_02.cs)

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

### [Desafio 3 - Ultrapassando V](./desafio_03.cs)

Como um bom desenvolvedor, você precisa fazer um programa que leia dois ingeiros: R e V (devem ser lidos tantos valores para V quantos necessários, até que seja digitado um valor maior do que R para ele). Conte quantos números inteiros devem ser somados em sequência (considerando o R nesta soma) para que a soma ultrapasse a V o mínimo possível. Escreva o valor final da contagem.

A entrada pode conter, por exemplo, os valores 21 21 15 30. Neste caso, é então assumido o valor 21 para R enquanto os valores 21 e 15 devem ser desconsiderados pois são menores ou iguais a R. Como o valor 30 está dentro da especificação (maior do que R) ele será válido e então deve-se processar os cálculos para apresentar na saída o valor 2, pois é a quantidade de valores somados para se produzir um valor maior do que 30 (21 + 22).


| Entrada | 
| :-----: | 
| A entrada contém somente valores inteiros, um por linha, podendo ser positivos ou negativos. O primeiro valor da entrada será o valor de R. A próxima linha da entrada irá conter V. Se V não atender a especificação do problema, ele deverá ser lido novamente, tantas vezes quantas forem necessárias.

| Saída |
|:-----:|
| Imprima uma linha com um número inteiro que representa a quantidade de números inteiros que devem ser somadas, de acordo com a especificação acima. |
 
| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
| 3 <br> 1 <br> 20 | 5 |

### [Desafio 4 - Validação de Nota](./desafio_04.cs)

Para ajudar a calcular as notas referentes às duas avaliações dos alunos, uma professora pediu para que você desenvolva um programa que calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.


| Entrada | 
| :-----: | 
| A entrada contém vários valores reais, positivos ou negativos. O programa deve ser encerrado quando forem lidas duas notas válidas.

| Saída |
|:-----:|
| Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida". Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo. O valor deve ser apresentado com duas casas após o ponto decimal. |
 
| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
| -3.5 <br> 3.5 <br> 11.0 <br> 10.0 | nota invalida <br> nota invalida <br> media = 6.75 |

### [Desafio 5 - Pedro Bento e o Mundo de OZ](./desafio_05.cs)

No jogo, O Mundo de Oz, Pedro Bento é o líder do Tribunal, por causa disso ele é uma das pessoas mais importantes do mundo, no jogo. Além disso, Pedro Bento possui um grande tesouro, o qual possui diversos tipos de jóias.

Pedro Bento está muito curioso para saber quantos tipos de jóias diferentes seu tesouro possui.

Sabendo que você é o melhor programador do mundo, Pedro Bento te contratou para verificar quantos tipos de jóias distintas ele tem em seu tesouro.


| Entrada | 
| :-----: | 
| A entrada consiste de várias linhas e cada uma contém uma string que descreve uma das jóias de Pedro Bento. Essa string é composta apenas dos caracteres '(' e ')', a soma do tamanho de todas as string não excede 106.

| Saída |
|:-----:|
| Imprima quantos tipos de jóias distintas Pedro Bento possui. |
 
| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
| (( <br> )) <br> (( <br> )) <br> ( | 3 |

### Solução de Problemas Essenciais com .NET

### [Desafio 1 - Programa para Validação de Notas](./desafio_01-1.cs)

O calendário escolar está passando bem rápido, devido a isso, as professoras de uma escola estão com dificuldade para calcular as notas dos alunos. Visando em resolver a situação, a diretora da escola contratou você para desenvolver um programa que leia as notas da primeira e da segunda avaliação de um aluno. Calcule e imprima a média semestral.

O programa só aceitará notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.

No final deve ser impressa a mensagem “novo calculo (1-sim 2-nao)”, solicitando as professoras que informe um código (1 ou 2) indicando se ele deseja ou não executar o algoritmo novamente, (aceitar apenas os código 1 ou 2). Se for informado o código 1 deve ser repetida a execução de todo o programa para permitir um novo cálculo, caso contrário o programa deve ser encerrado.

| Entrada | 
| :-----: | 
| O arquivo de entrada contém vários valores reais, positivos ou negativos. Quando forem lidas duas notas válidas, deve ser lido um valor inteiro X . O programa deve parar quando o valor lido para este X for igual a 2.

| Saída |
|:-----:|
| Se uma nota inválida for lida, deve ser impressa a mensagem “nota invalida”. Quando duas notas válidas forem lidas, deve ser impressa a mensagem “media = ” seguido do valor do cálculo.<br><br>Antes da leitura de X deve ser impressa a mensagem "novo calculo (1-sim 2-nao)" e esta mensagem deve ser apresentada novamente se o valor da entrada padrão para X for menor do que 1 ou maior do que 2, conforme o exemplo abaixo.<br><br>A média deve ser impressa com dois dígitos após o ponto decimal. |
 
| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
| -3.5 <br> 3.5 <br> 11.0 <br> 10.0 <br> 4 <br> 1 <br> 8.0 <br> 9.0 <br> 2 | nota invalida <br> nota invalida <br> media = 6.75 <br> novo calculo (1-sim 2-nao) <br> novo calculo (1-sim 2-nao) <br> media = 8.50 <br> novo calculo (1-sim 2-nao) |

### [Desafio 2 - Quanta Mandioca?](./desafio_02-1.cs)

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


|Exemplo de Entrada|  Exemplo de Saída  |
|:----------------:| :----------------: |
| 1 <br> 1 <br> 1 <br> 1 <br> 1 | 3775 |
| 2 <br> 2 <br> 2 <br> 2 <br> 2 | 7325 |

### [Desafio 3 - Compras no Supermercado](./desafio_03-1.cs)

Pedro trabalha sempre até tarde todos os dias, com isso tem pouco tempo tempo para as tarefas domésticas. Para economizar tempo ele faz a lista de compras do supermercado em um aplicativo e costuma anotar cada item na mesma hora que percebe a falta dele em casa.

O problema é que o aplicativo não exclui itens duplicados, como Pedro anota o mesmo item mais de uma vez e a lista acaba ficando extensa. Sua tarefa é melhorar o aplicativo de notas desenvolvendo um código que exclua os itens duplicados da lista de compras e que os ordene alfabeticamente.

| Entrada | 
| :-----: | 
| A primeira linha de entrada contém um inteiro **N** (**N** < 100) com a quantidade de casos de teste que vem a seguir, ou melhor, a quantidade de listas de compras para organizar. Cada lista de compra consiste de uma única linha que contém de 1 a 1000 itens ou palavras compostas apenas de letras minúsculas (de 1 a 20 letras), sem acentos e separadas por um espaço.

| Saída |
|:-----:|
| A saída contém **N** linhas, cada uma representando uma lista de compra, sem os itens repetidos e em ordem alfabética |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 2 <br> carne laranja suco picles <br> laranja picles <br> laranja pera laranja pera <br> pera | carne laranja <br> picles suco <br> laranja pera

### [Desafio 4 - Compras no Supermercado](./desafio_04-1.cs)

Pedro e Fernando são os desenvolvedores em uma stratup e vão desenvolver o novo sistema de cadastro, e pediram a sua ajuda. Sua task é fazer o código que valide as senhas que são cadastradas, para isso você deve atentar aos requisitos a seguir:

A senha deve conter, no mínimo, uma letra maiúscula, uma letra minúscula e um número;
A mesma não pode ter nenhum caractere de pontuação, acentuação ou espaço;
Além disso, a senha pode ter de 6 a 32 caracteres.

| Entrada | 
| :-----: | 
| A entrada contém vários casos de teste e termina com final de arquivo. Cada linha tem uma string S, correspondente a senha que é inserida pelo usuário no momento do cadastro.

| Saída |
|:-----:|
| A saída contém uma linha, que pode ser “Senha valida.”, caso a senha tenha cada item dos requisitos solicitados anteriormente, ou “Senha invalida.”, se um ou mais requisitos não forem atendidos. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| Digital Innovation One <br> AbcdEfgh99 <br> DigitalInnovationOne123 <br> Digital Innovation One 123 <br> Aass9 <br> Aassd9 | Senha invalida. <br> Senha valida. <br> Senha valida. <br> Senha invalida. <br> Senha invalida. <br> Senha valida |

### [Desafio 5 - Fila do Banco](./desafio_05-1.cs)

O banco que você trabalha sempre tem problemas para organizar as filas de atendimento dos clientes.

Após uma reunião com a gerência ficou decidido que os clientes ao chegar na agência receberão uma senha numérica em seu aparelho de celular via sms e que a ordem da fila será dada não pela ordem de chegada, mas sim pelo número recebido via sms. A ordem de atendimento será decrescente: aqueles que receberam número maior deverão ser atendidos primeiro. 

Então, dada a ordem de chegada dos clientes reordene a fila de acordo com o número recebido via sms, e diga quantos clientes não precisaram trocar de lugar nessa reordenação.

| Entrada | 
| :-----: | 
| A primeira linha contém um inteiro **N**, indicando o número de casos de teste a seguir. <br><br> Cada caso de teste inicia com um inteiro **M** (1 ≤ **M** ≤ 1000), indicando o número de clientes. Em seguida haverá **M** inteiros distintos **Pi** (1 ≤ **Pi** ≤ 1000), onde o i-ésimo inteiro indica o número recebido via sms do i-ésimo cliente. <br><br> Os inteiros acima são dados em ordem de chegada, ou seja, o primeiro inteiro diz respeito ao primeiro cliente a chegar na fila, o segundo inteiro diz respeito ao segundo cliente, e assim sucessivamente.

| Saída |
|:-----:|
| Para cada caso de teste imprima uma linha, contendo um inteiro, indicando o número de clientes que não precisaram trocar de lugar mesmo após a fila ser reordenada. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 3 <br> 3 <br> 100 80 90 <br> 4 <br> 100 120 30 50 <br> 4 <br> 100 90 30 25 | 1 <br> 0 <br> 4 |