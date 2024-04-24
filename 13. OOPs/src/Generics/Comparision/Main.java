package Generics.Comparision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student Tarun = new Student(16, 99.32f);
        Student Akhilesh = new Student(5, 89.25f);
        Student Sachin = new Student(9, 96.52f);
        Student Arpit = new Student(2, 95.52f);
        Student Karan = new Student(13, 77.52f);

        if (Akhilesh.compareTo(Tarun) > 0) {
            System.out.println("Akhilesh is topper.");
        } else {
            System.out.println("Tarun is topper.");
        }

        Student[] list = {Tarun, Akhilesh, Sachin, Arpit, Karan};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list); // Will sort based on compareTo method
        System.out.println(Arrays.toString(list));

        Arrays.sort(list, (S1, S2) -> (int)(S1.rollno - S2.rollno)); // Inline Comparator
        System.out.println(Arrays.toString(list));

//        Arrays.sort(list, new Comparator<Student>() { // Same as Lambda Expression
//            @Override
//            public int compare(Student S1, Student S2) {
//                return (int)(S1.marks - S2.marks);
//            }
//        });
    }
}
