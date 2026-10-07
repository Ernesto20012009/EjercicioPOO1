package org.generation.entidades;

import org.generation.entidades.Courses;
import org.generation.entidades.Student;

public class Main {

    public static void main(String[] args) {
        Student std1 = new Student("John", "Doe", 2024, 70, 5);
        Student std2 = new Student("Jane", "Smith", 2024, 85, 4);
        Student std3 = new Student("Carlos", "García", 2025, 92, 3); // 92
        Student std4 = new Student("Emily", "Davis", 2023, 33, 5); // 33
        Student std5 = new Student("Ahmed", "Khan", 2026, 77, 2); // 77
        Student std6 = new Student("Elena", "Petrova", 2024, 95, 4);
        Student std7 = new Student("Luis", "Rodríguez", 2025, 58, 3);
        Student std8 = new Student("Chloe", "Dupont", 2023, 73, 5);
        Student std9 = new Student("Min-ho", "Kim", 2026, 91, 1);
        Student std10 = new Student("Olivia", "Wilson", 2024, 82, 4);

        Student[] students = {std6, std8, std9, std10, std1};

        Courses c1 = new Courses("Introducción a la Programación", "Dr. Alan Turing", 1);
        Courses c2 = new Courses("Estructuras de Datos", "Dra. Grace Hopper", 2);
        Courses c3 = new Courses("Bases de Datos", "Prof. Edgar Codd", 3);
        Courses c4 = new Courses("Desarrollo Web", "Ing. Tim Berners-Lee", 2);
        Courses c5 = new Courses("Inteligencia Artificial", "Dra. Fei-Fei Li", 4);
        Courses c6 = new Courses("Ingeniería de Software", "Prof. Margaret Hamilton", 3);
        Courses c7 = new Courses("Sistemas Operativos", "Dr. Linus Torvalds", 3);
        Courses c8 = new Courses("Redes de Computadoras", "Ing. Vint Cerf", 4);
        Courses c9 = new Courses("Ciberseguridad", "Dra. Dorothy Denning", 4);
        Courses c10 = new Courses("Álgebra Lineal", "Prof. Carl Friedrich Gauss", 1);

        System.out.println(std1);
        System.out.println(c1);

        System.out.println("\n=========== Student methods");
        std7.printFullName();
        System.out.println("Estudiante 7 aprobado?: " + std7.isApproved());
        std7.changeYearIfApproved();
        System.out.println("===========================");

        System.out.println("\n=========== Courses methods");
        c5.enroll(std2); // Un solo estudiante
        c5.enroll(std3);
        c5.enroll(std4);
        c5.enroll(std5);
        System.out.println("Estudiantes en el curso 5: " + c5.countStudents());
        c5.unEnroll(std2);
        System.out.println("Estudiantes restantes en el curso 5: " + c5.countStudents());
        System.out.println("Calificación más alta: " + c5.bestGrade());
        c5.enroll(students); // Método sobrecargado: array de estudiantes
        System.out.println("Estudiantes en el curso 5: " + c5.countStudents());
        System.out.println(c5.average());
        c5.isAboveAverage();
        c5.ranking();
    }// main

}// class Main