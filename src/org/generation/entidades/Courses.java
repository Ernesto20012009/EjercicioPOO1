package org.generation.entidades;

import java.util.ArrayList;

public class Courses {
    String courseName;
    String professorName;
    int year;
    ArrayList<Student> students;

    public Courses(String courseName, String professorName, int year){
        this.courseName = courseName.toUpperCase();
        this.professorName = professorName.toUpperCase();
        this.year = year;
        this.students = new ArrayList<>();
    }// constructor Courses

    public void enroll(Student student){
        this.students.add(student);
    }// enroll

    public void enroll(Student[] students){
        for(Student student: students){
            this.enroll(student);
        }// forEach
    }// enroll

    public void unEnroll(Student student) {
        if (this.students.contains(student)) {
            this.students.remove(student);
            System.out.println(student.firstName + " ha sido desinscrito del curso.");
        } else {
            System.out.println("El estudiante no está inscrito en este curso.");
        }
    }

    public int countStudents(){
        return this.students.size();
    }// countStudents

    public int bestGrade(){
        int max = 0;

        for(Student student: this.students){
            if(student.grade > max){
                max = student.grade;
            }// if
        }// forEach

        return max;
    }// bestGrade



    @Override
    public String toString() {
        return "Courses{" +
                "courseName='" + courseName + '\'' +
                ", professorName='" + professorName + '\'' +
                ", year=" + year +
                ", students=" + students +
                '}';
    }// toString

    public double average() {
        if (this.students.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (Student student : this.students) {
            sum += student.grade;
        }
        return (double) sum / this.students.size();
    }
    public void isAboveAverage() {
        double avg = this.average();
        System.out.println("Promedio del curso: " + avg);
        for (Student student : this.students) {
            if (student.grade >= avg) {
                System.out.println("Estudiante arriba/igual del promedio: " + student.firstName + " " + student.lastName + " (" + student.grade + ")");
            }
        }
    }

    public void ranking() {
        System.out.println("--- Ranking de estudiantes en " + this.courseName + " ---");
        //  mostrarlos ordenados por calificación de mayor a menor:
        this.students.stream()
                .sorted((s1, s2) -> Integer.compare(s2.grade, s1.grade))
                .forEach(s -> System.out.println(s.firstName + " " + s.lastName + " - Calificación: " + s.grade));
    }
}// class Courses