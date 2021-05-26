## Solução de problemas básicos em C#

### [Desafio 1 - Consumo Médio do Automóvel](./desafio_01.cs)

Você deve calcular o consumo médio de um automóvel onde será informada a distância total percorrida (em Km) e o total de combustível consumido (em litros).

| Entrada | 
| :-----: | 
| ocê receberá dois valores: um valor inteiro X com a distância total percorrida (em Km), e um valor real Y que representa o total de combustível consumido, com um dígito após o ponto decimal. 

| Saída |
|:-----:|
| Exiba o valor que representa o consumo médio do automóvel (3 casas após a vírgula), incluindo no final a mensagem "km/l". |
 
| Exemplo de Entrada |  Exemplo de Saída  |
| :----------------: | :----------------: |
| 500 <br> 35.0 | 14.286 km/l |
2254  <br> 124.4 | 18.119 km/l | 
4554  <br> 464.6 | 9.802 km/l |

### [Desafio 2 - DDD](./desafio_02.cs)

Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:

 | DDD | Destination |
 |:---:| :---------: |
 | 61 <br>  71 <br>  11 <br>  21 <br>  32 <br>  19 <br>  27 <br>  31 | Brasilia <br> Salvador <br> Sao Paulo  <br> Rio de Janeiro <br> Juiz de Fora <br> Campinas <br> Vitoria <br> Belo Horizonte |

Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
DDD nao cadastrado

| Entrada | 
| :-----: | 
| A entrada consiste de um único valor inteiro.

| Saída |
|:-----:|
| Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso não existir DDD correspondente ao número digitado. |
 
| Exemplo de Entrada |  Exemplo de Saída     |
| :----------------: | :----------------:    |
| 11 | Sao Paulo |

### [Desafio 3 - Notas e Moedas](./Desafios_C_Sharp/Solucionando_Desafios_Intermediários_em_C_Sharp/desafio_03.cs)

Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

| Entrada | 
| :-----: | 
| O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

| Saída |
|:-----:|
| Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal. |


|Exemplo de Entrada|  Exemplo de Saída  |
|:----------------:| :----------------: |
| 576.73 | NOTAS: <br> 5 nota(s) de R$ 100.00 <br> 1 nota(s) de R$ 50.00 <br> 1 nota(s) de R$ 20.00 <br> 0 nota(s) de R$ 10.00 <br> 1 nota(s) de R$ 5.00 <br> 0 nota(s) de R$ 2.00 <br> MOEDAS: <br> 1 moeda(s) de R$ 1.00 <br> 1 moeda(s) de R$ 0.50 <br> 0 moeda(s) de R$ 0.25 <br> 2 moeda(s) de R$ 0.10 <br> 0 moeda(s) de R$ 0.05 <br> 3 moeda(s) de R$ 0.01 |
4.00 | NOTAS: <br> 0 nota(s) de R$ 100.00 <br> 0 nota(s) de R$ 50.00 <br> 0 nota(s) de R$ 20.00 <br> 0 nota(s) de R$ 10.00 <br> 0 nota(s) de R$ 5.00 <br> 2 nota(s) de R$ 2.00 <br> MOEDAS: <br> 0 moeda(s) de R$ 1.00 <br> 0 moeda(s) de R$ 0.50 <br> 0 moeda(s) de R$ 0.25 <br> 0 moeda(s) de R$ 0.10 <br> 0 moeda(s) de R$ 0.05 <br> 0 moeda(s) de R$ 0.01 |
91.01 | NOTAS: <br> 0 nota(s) de R$ 100.00 <br> 1 nota(s) de R$ 50.00 <br> 2 nota(s) de R$ 20.00 <br> 0 nota(s) de R$ 10.00 <br> 0 nota(s) de R$ 5.00 <br> 0 nota(s) de R$ 2.00 <br> MOEDAS: <br> 1 moeda(s) de R$ 1.00 <br> 0 moeda(s) de R$ 0.50 <br> 0 moeda(s) de R$ 0.25 <br> 0 moeda(s) de R$ 0.10 <br> 0 moeda(s) de R$ 0.05 <br> 
1 moeda(s) de R$ 0.01 |