## Executanto os desafios de Javascript

Para executar os arquivos de código com o nodejs ou mesmo utilzando um navegador pode-se substituir uma função ** gets () ** pelo parâmetro desejado em cada variável do código, contudo isso é demasiadamente trabalhoso e contra produtivo.

Uma alternativa é criar um método iterator como o snippet a seguir:

````Javascript
const iterator = (array) => {

    let nextIndex = 0;

    return {
        next : () => {
                return nextIndex < array.length
                    ? {value: array[nextIndex ++], done: false}
                    : {done: true};
            }
        }
};
````

Uma vez inicializado **iterator** o metodo next() pode ser chamado, percorrendo o array de inicialização

```Javascript
let parameters = iterator(['variables']);
```
Desta forma uma lista de parâmetros de teste pode ser atribuída à chamada da função **iterador()** tornando uma variável de parâmetros de um iterable.

E a função **gets()** fica definida como:

```Javascript
function gets() {
    return parameters.next().value;
}
```