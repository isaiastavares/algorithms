package br.com.algorithms.sort;

import br.com.algorithms.model.Student;

public class BubbleSort implements Sort<Student> {

    /**
     * O laço for percorre o primeiro elemento até o último elemento -1 (ele nunca chegará a ler o último elemento)
     * verificando se o elemento atual que está sendo lido é maior que o próximo elemento que será lido.
     * <p>
     * Suponhamos então o seguinte vetor: 20, 10, 30.
     * <p>
     * A primeira iteração no laço for irá capturar o valor 20 e comparar com o próximo, que será 10.
     * Então se 20 > 10, ele entrará na condição fazendo a substituição destes valores:
     * <p>
     * O valor 20, que está na posição i é armazenado na variável aux para não perdemos sua referência,
     * depois o valor 10 que está na posição i+1 é armazenado no local do valor 20.
     * Trocamos agora o valor de i+1 pelo valor que armazenamos em aux, que no caso é 20.
     * A variável troca que antes era false, agora recebe true para indicar que houve uma troca.
     * <p>
     * Na segunda iteração do laço for o valor 20 será capturado, pois estaremos com i = 1. O valor 20
     * será comparado com o valor de i+1 (2), que no caso é o valor 30. Então se 20 > 30 a troca será realizada.
     * Como 20 não é maior que 30 não entraremos na condição e o laço for continuará a ser executado,
     * agora na próxima iteração, onde i = 2.
     * <p>
     * Quando i = 2 já estamos no último elemento, então não entrará no laço for, já que i não é menor que vector.length – 1.
     * Se fosse possível entrar no último elemento para realizar comparações o seguinte erro aconteceria: ArrayIndexOutOfBoundsException
     * <p>
     * Isso porque não podemos realizar a operação de comparação do último elemento com um próximo elemento, já que ele não existe.
     * <p>
     * Porque a variável troca é útil? Ao passar pela primeira vez no vetor de elementos qualquer troca que for realizada
     * ativa a variável troca como true, fazendo com que ele precise passar novamente depois da leitura de todos os elementos.
     * A ideia é passar quantas vezes forem necessárias até que a variável troca não seja mais ativada,
     * assim saberemos que todos os elementos estão devidamente ordenados.
     * <p>
     * Analisando mais a fundo o algoritmo BubbleSort você perceberá que a segunda passada geralmente será muito mais
     * rápida que a primeira, principalmente se todx o vetor já foi ordenado corretamente, fazendo com que nenhuma vez
     * seja necessário realizar trocas, assim o mesmo entra no “melhor caso”, ou seja, todos os valores ordenados.
     */
    @Override
    public void sort(Student[] vector) {
        boolean swap = true;
        Student aux;
        while (swap) {
            swap = false;
            for (int i = 0; i < vector.length - 1; i++) {
                if (vector[i].getGrade() > vector[i + 1].getGrade()) {
                    aux = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = aux;
                    swap = true;
                }
            }
        }
    }

}
