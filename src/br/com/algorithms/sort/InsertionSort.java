package br.com.algorithms.sort;

import br.com.algorithms.model.Student;

public class InsertionSort implements Sort<Student> {

    /**
     * Este irá percorrer todx o vetor começando do segundo elemento e atribuindo o mesmo a uma variável chamada key.
     * <p>
     * O algoritmo começa fazendo uma iteração em todos os elementos do vetor, a partir do segundo elemento, por isso j=1 e não j=0.
     * <p>
     * A variável key armazena inicialmente o primeiro valor lido pelo laço for, que no caso será o segundo elemento do vetor.
     * O segundo laço itera sobre os valores que estão antes da variável key:
     * <p>
     * Perceba que o segundo laço continuará até que o valor de i seja maior ou igual a zero e o valor do vetor na
     * posição i seja maior que o valor de key.
     * <p>
     * Suponha o seguinte vetor com os grades: 30,20,10,40. Na primeira iteração o valor de key será 20, já que começamos
     * a iteração a partir do segundo valor. Na primeira iteração do segundo laço for o valor de i será igual a 0,
     * porque o j será igual a 1, sendo assim o i é >= 0 e o vector[0].getGrade() é maior que 20, pois vector[0].getGrade() = 30.
     * Ao acessar o segundo laço for é feita uma atribuição.
     * <p>
     * Temos então que vector[0+1] = vector[0], ou seja, o valor 20 recebe o valor 30, ficando assim: 30,30,10,40.
     * Quando ele tentar passar pela segunda vez no segundo laço for não será possível, pois i será -1.
     * <p>
     * Ao sair do segundo laço for o valor de vector[i+1] recebe o que tínhamos armazenado em key.
     * <p>
     * No caso, vector[-1 + 1] = 20, então temos 20, 30, 10, 40.
     * <p>
     * O mesmo prossegue até que todos os valores do vetor sejam percorridos e estejam ordenados.
     * <p>
     * A variável i serve para comparar sempre o elemento atual com o elemento anterior, pois ele faz com que
     * seja possível percorrer todos os elementos anteriores ao atual até achar algum que seja maior que o atual,
     * fazendo com que este seja substituído. Conforme a iteração for avançando os elementos a esquerda vão ficando ordenados.
     */
    @Override
    public void sort(Student[] vector) {
        Student key;
        int i;
        int j;

        for (j = 1; j < vector.length; j++) {
            key = vector[j];
            for (i = j - 1; (i >= 0) && (vector[i].getGrade() > key.getGrade()); i--) {
                vector[i + 1] = vector[i];
            }
            vector[i + 1] = key;
        }
    }
}
