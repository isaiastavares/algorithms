package br.com.algorithms.sort;

import br.com.algorithms.model.Student;

public class QuickSort implements Sort<Student> {

    @Override
    public void sort(Student[] vector) {
        sort(vector, 0, vector.length - 1);
    }

    /**
     * De forma recursiva os elementos da sublista menor e maiores são ordenados.
     */
    private static void sort(Student[] vector, int start, int end) {
        if (start < end) {
            int positionPivot = separate(vector, start, end);
            sort(vector, start, positionPivot - 1);
            sort(vector, positionPivot + 1, end);
        }
    }

    /**
     * Escolhe-se um elemento qualquer da lista, que será chamado de pivô. (Nesse caso, estou escolhendo sempre o primeiro)
     * <p>
     * Todos os elementos antes do pivô devem ser menores que ele e todos os elementos após o pivô devem ser maiores que ele.
     * Quando esse processo de separação for finalizado, então o pivô deve estar exatamente no meio da lista.
     */
    private static int separate(Student[] vector, int start, int end) {
        Student pivot = vector[start];
        int s = start + 1;
        int e = end;
        while (s <= e) {
            if (vector[s].getGrade() <= pivot.getGrade()) {
                s++;
            } else if (pivot.getGrade() < vector[e].getGrade()) {
                e--;
            } else {
                Student troca = vector[s];
                vector[s] = vector[e];
                vector[e] = troca;
                s++;
                e--;
            }
        }
        // coloca o pivô na posição certa
        vector[start] = vector[e];
        vector[e] = pivot;
        return e;
    }

}
