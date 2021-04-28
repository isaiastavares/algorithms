# Algorithms

## Sort

### Insertion Sort

Sua teoria baseia-se em ordenar os valores da esquerda para a direita, deixando os elementos lidos (a esquerda) ordenados. Este é geralmente utilizado para ordenar um pequeno número de valores, onde faz-se muito eficiente. A complexidade do código é:

- Complexidade Pior Caso: O(n²)
- Complexidade Caso Médio: O(n²)
- Complexidade Melhor Caso: O(n)

Quando temos um caso onde a complexidade é n² devemos evitar, visto que a redução de desempenho deste algoritmo é exponencial. Porém, no seu melhor caso temos uma constante n que significa a inalteração da velocidade, proporcional à quantidade de elementos.

Lembre-se que estamos trabalhando com proporcionalidade, então dizer que não varia não significa que um vetor de 10 elementos será ordenado na mesma velocidade de um vetor de um milhão de elementos, mesmo no melhor caso, porém a proporcionalidade entre a quantidade de elementos e sua velocidade continua constante, diferente do Pior Caso que aumenta ao quadrado.

O melhor caso ocorre quando todos os elementos já estão ordenados e o pior caso é exatamente o contrário, quando todos os elementos estão desordenados.

Elementos   | Caso médio (n²)  | Melhor Caso (n)
----------- | ---------------- | ----------------
100         | 1 ms             | 0 ms
1.000       | 10 ms            | 0 ms
10.000      | 140 ms           | 1 ms
100.000     | 13.289 ms        | 6 ms
200.000     | 205.739 ms       | 8 ms

### Bubble Sort

O BubbleSort é conhecido pela sua simplicidade e pela eficácia ao realizar ordenações em um número limitado de valores. Seu princípio baseia-se na troca de valores entre posições consecutivas, fazendo com que valores altos ou baixos (dependendo da forma de ordenação desejada) “borbulhem” para o final da fila, por isso este algoritmo é chamado de BubbleSort. Sua complexidade é:

- Complexidade Pior Caso: O(n²)
- Complexidade Caso Médio: O(n²)
- Complexidade Melhor Caso: O(n)

Vimos que no melhor caso o seu tempo é quase inalterável, permanecendo constante, ou seja, um caso ideal.

Elementos   | Caso médio (n²)  | Melhor Caso (n)
----------- | ---------------- | ----------------
100         | 2 ms             | 0 ms
1.000       | 16 ms            | 0 ms
10.000      | 500 ms           | 2 ms
100.000     | 139.579 ms       | 4 ms
200.000     | 1.046.444 ms     | 5 ms

### Selection Sort

No InsertionSort vimos uma ordenação simples, já no SelectionSort a implementação torna-se mais simples ainda, porém perdemos muito com o desempenho. Este algoritmo tem por objetivo passar sempre o menor valor para a primeira posição (dependendo da ordem requerida pode ser o maior valor). Então, para que isso seja feito ele percorre todos os elementos procurando um menor valor para só então colocá-lo na primeira posição, repetindo essa tarefa para cada um dos elementos.

- Complexidade Pior Caso: O(n²)
- Complexidade Caso Médio: O(n²)
- Complexidade Melhor Caso: O(n²)

Perceba que este algoritmo possui um péssimo desempenho, visto que sua complexidade é sempre exponencial, independente do caso em que estamos trabalhando. Antes mesmo de mostrar qualquer código você já deve ser capaz de perceber que este algoritmo é bom para trabalhar-se com até, pelo menos, 10.000 elementos, dada a tabela do InsertionSort, visto sua simplicidade na implementação.

Elementos   | Caso médio (n²)  | Melhor Caso (n)
----------- | ---------------- | ----------------
100         | 1 ms             | 1 ms
1.000       | 9 ms             | 10 ms
10.000      | 135 ms           | 95 ms
100.000     | 21.157 ms        | 11.082 ms
200.000     | 156.389 ms       | 95.240 ms

### Quick Sort

Este algoritmo usa uma técnica conhecida por divisão e conquista, muito conhecida por reduzir problemas complexos em problemas menores para tentar chegar em uma solução. Sendo assim, o resultado do problema inicial é dada como a soma do resultado de todos os problemas menores. Sua complexidade é:

- Complexidade Pior Caso: O(n²)
- Complexidade Caso Médio: (nlogn)
- Complexidade Melhor Caso: (nlogn)

O QuickSort sai na frente de outros algoritmos mais simples quando tratamos do caso médio, por trabalhar com logaritmo (nlogn), o que torna o resultado mais rápido do que o InsertionSort e o QuickSort.

O algoritmo consiste nos seguintes passos:

1. Escolhe-se um elemento qualquer da lista, que será chamado de pivô.
2. Todos os elementos antes do pivô devem ser menores que ele e todos os elementos após o pivô devem ser maiores que ele. Quando esse processo de separação for finalizado, então o pivô deve estar exatamente no meio da lista.
3. De forma recursiva os elementos da sublista menor e maiores são ordenados.

Elementos   | Caso médio (n * logn)
----------- | ---------------------
100         | 1 ms
1.000       | 3 ms
10.000      | 7 ms
100.000     | 37 ms
200.000     | 68 ms

### Conclusão

Com isso, vimos que em se tratando de simplicidade, o BubbleSort é o melhor, visto que sua implementação e lógica são simples e eficazes para uma pequena quantidade de valores, porém precisamos de algoritmos mais robustos quando sabemos que a entrada se dará para uma grande quantidade de valores.

Por outro lado, o InsertionSort não é tão complexo quanto o QuickSort, mas também não é tão simples quanto o BubbleSort, acrescentando um pouco mais de robustez e consequentemente desempenho na ordenação de valores. O InsertionSort é um meio termo e possibilita a ordenação de valores um pouco maiores que o BubbleSort, mas também não consegue ordenar uma grande quantidade de valores igual ao QuickSort, que por sua vez, mostrou-se o algoritmo mais rápido de todos e consequentemente o mais complexo de ser implementado. Isso ocorre principalmente pelo fato de ele trabalhar com recursos como recursividade para alcançar um desempenho notável.

É perceptível que o QuickSort, BubbleSort e InsertionSort possuem quase o mesmo tempo de resposta quando estamos tratando com até 1000 elementos no vetor, a variação é tão insignificante que a escolha de um destes algoritmos é mais uma questão pessoal do que profissional.

## Search

### Busca linear

### Busca binária