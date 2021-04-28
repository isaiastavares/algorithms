package br.com.algorithms;

import br.com.algorithms.model.Student;
import br.com.algorithms.sort.BubbleSort;
import br.com.algorithms.sort.InsertionSort;
import br.com.algorithms.sort.QuickSort;
import br.com.algorithms.sort.SelectionSort;
import br.com.algorithms.sort.Sort;

public class Main {

    private static final int QTY = 200000;

    public static void main(String[] args) {
//        Student[] students = getStudentsTest();
        Student[] students = new Student[QTY];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("Name " + i, Math.random() * QTY); // caso medio
//            students[i] = new Student("Name " + i, i + 1); // melhor caso
        }

        long startTime = System.currentTimeMillis();

        Sort<Student> sort = new InsertionSort();
//        Sort<Student> sort = new BubbleSort();
//        Sort<Student> sort = new SelectionSort();
//        Sort<Student> sort = new QuickSort();

        sort.sort(students);

        long endTime = System.currentTimeMillis();

//        Arrays.stream(students).forEach(System.out::println);

        System.out.println("Executado em = " + (endTime - startTime) + " ms");
    }

    private static Student[] getStudentsTest() {
        return new Student[]{
                new Student("andre", 4),
                new Student("carlos", 8.5),
                new Student("ana", 10),
                new Student("jonas", 3),
                new Student("juliana", 6.7),
                new Student("lucia", 9.3),
                new Student("paulo", 9),
                new Student("mariana", 5),
                new Student("guilherme", 7)
        };
    }

}
