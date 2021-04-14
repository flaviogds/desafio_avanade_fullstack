## Busca e laços de repetição

### [Desafio 1 - Ordenando Números Pares e Ímpares](./desafio_01.java)

Crie um programa onde você receberá valores inteiros não negativos como entrada.

Ordene estes valores de acordo com o seguinte critério:

* Primeiro os Pares
* Depois os Ímpares

Você deve exibir os pares em ordem crescente e na sequência os ímpares em ordem decrescente.

| Entrada | 
| :-----: | 
| A primeira linha de entrada contém um único inteiro positivo **N** (1 < **N** < 10000) Este é o número de linhas de entrada que vem logo a seguir. As próximas **N** linhas terão, cada uma delas, um valor inteiro não negativo.

| Saída |
|:-----:|
| Exiba todos os valores lidos na entrada segundo a ordem apresentada acima. Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 10 <br> 4 <br> 32 <br> 34 <br> 543 <br> 3456 <br> 654 <br> 567 <br> 87 <br> 6789 <br> 98 | 4 <br> 32 <br> 34 <br> 98 <br> 654 <br> 3456 <br> 6789 <br> 567 <br> 543 <br> 87 |

### [Desafio 2 - Compras no Supermercado](./desafio_02.java)

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
| 2 <br> carne laranja suco picles <br> laranja picles <br> laranja pera laranja pera <br> pera | carne laranja <br> picles suco <br> laranja pera |

### [Desafio 3 - Uniformes de final de ano](./desafio_03.java)

O professor Girafales organizou a confecção de um uniforme para as turmas da escola para comemorar o final do ano. Após algumas conversas, ficou decidido com os alunos que eles poderiam escolher a cor do uniforme entre branco ou vermelho. Assim sendo, Girafales precisa de sua ajuda para organizar as listas de quem quer o uniforme em cada uma das turmas, relacionando estas camisetas pela cor, tamanho (P, M ou G) e por último pelo nome.

| Entrada | 
| :-----: | 
| Cada caso de teste inicia com um valor **N**, (1 ≤ **N** ≤ 60) inteiro e positivo, que indica a quantidade de uniformes a serem feitas para aquela turma. As próximas **N*2** linhas contém informações de cada um dos uniformes (serão duas linhas de informação para cada uniforme). A primeira linha irá conter o nome do estudante e a segunda linha irá conter a cor do uniforme ("branco" ou "vermelho") seguido por um espaço e pelo tamanho do uniforme "P" "M" ou "G". A entrada termina quando o valor de **N** for igual a zero (0) e esta valor não deverá ser processado.

| Saída |
|:-----:|
| Para cada caso de entrada deverão ser impressas as informações ordenadas pela cor em ordem ascendente, seguido pelos tamanhos em ordem descendente e por último por ordem ascendente de nome, conforme o exemplo abaixo. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 9 <br> Maria Jose <br> branco P <br> Mangojata Mancuda <br> vermelho P <br> Cezar Torres Mo <br> branco P <br> Baka Lhau <br> vermelho P <br> JuJu Mentina <br> branco M <br> Amaro Dinha <br> vermelho P <br> Adabi Finho <br> branco G <br> Severina Rigudinha <br> branco G <br> Carlos Chade Losna <br> vermelho P <br> 0 | branco P Cezar Torres Mo <br> branco P Maria Jose <br> branco M JuJu Mentina <br> branco G Adabi Finho <br> branco G Severina Rigudinha <br> vermelho P Amaro Dinha <br> vermelho P Baka Lhau <br> vermelho P Carlos Chade Losna <br> vermelho P Mangojata Mancuda |

### [Desafio 4 - Fila do Banco](./desafio_04.java)

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

### [Desafio 5 - Gincana no Acampamento](./desafio_05.java)

Nas férias de Dezembro, várias escolas se organizam e levam seus alunos para um acampamento de férias por uma semana. Nestes acampamentos os alunos são divididos em cabanas coletivos por gênero e idade, sempre com um adulto que, além de dormir com o grupo no cabana, também são responsáveis por criar e executar várias atividades, como por exemplo jogos, excursões, Gincanas Noturnas, etc.

No primeiro dia foi realizada uma gincana em que a atividade constituia em agrupar os alunos em um círculo (organizado no sentido anti-horário) do qual seriam retiradas uma a uma até que sobrasse apenas um aluno, que seria o vencedor.

No momento em que entra no círculo, cada aluno recebe uma pequena ficha que contém um valor de 1 a 500. Depois que o círculo é formado, conta-se, iniciando no aluno que está ao lado da primeira que entrou no círculo, o número correspondente à ficha que o primeiro detém. O aluno onde o número contado cair, deve ser retirado do grupo, e a contagem inicia novamente segundo a ficha do aluno que acabou de ser eliminado. Para ficar mais interessante, quando o valor que consta na ficha é par, a contagem é feita no sentido horário e quando o valor que consta na ficha é ímpar, a contagem é feita no sentido anti-horário.

Desenvolva um programa para que no próximo evento o responsável pela brincadeira saiba previamente qual criança irá ser a vencedora de cada grupo, com base nas informações fornecidas.

| Entrada | 
| :-----: | 
| A entrada contém vários casos de teste. A primeira linha de cada caso de teste contém um inteiro **N** (1 ≤ **N** ≤ 100), indicando a quantidade de alunos que farão parte de cada círculo. Em seguida, as **N** linhas de cada caso de teste conterão duas informações, o **Nome** e o **Valor** (1 ≤ **Valor** ≤ 500) que consta na ficha de cada aluno, separados por um espaço, na ordem de entrada na formação do círculo inicial. <br> OBS: O **Nome** de cada aluno não deverá ultrapassar 30 caracteres e contém apenas letras maiúsculas e minúsculas, sem acentos, e o caractere “_”. O final da entrada é indicado pelo número zero.

| Saída |
|:-----:|
| Para cada caso de teste, deve-se apresentar a mensagem Vencedor(a): xxxxxx, com um espaço após o sinal ":" indicando qual é o aluno do grupo que venceu a brincadeira. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 3 <br> Fernanda 7 <br> Fernando 9 <br> Gustavo 11 <br> 5 <br> Maria 7 <br> Pedro 9 <br> Joao_Vitor 5 <br> Isabel 12 <br> Laura 8 <br> 3 <br> Maria 4 <br> Pedro 3 <br> Joao 2 <br> 0 | Vencedor(a): Fernanda <br> Vencedor(a): Pedro <br> Vencedor(a): Pe |