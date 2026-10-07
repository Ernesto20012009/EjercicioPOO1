package org.generation.entidades;

public class Student {

    public String firstName;
    public String lastName;
    public int registration;
    public int grade;
    public int year;

    public Student(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName.toUpperCase();
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }// constructor 1 Student

    public Student(String firstName, String lastName, int registration, int grade) {
        this(firstName, lastName, registration, grade, 1);
    }// constructor 2 Student

    public Student(String firstName, String lastName) {
        this(firstName, lastName, 2026, 0, 1);
    }// constructor 3 Student


    public void printFullName(){
        System.out.println("First name: " + this.firstName + ", Last name: " + this.lastName);
    }// printFullName


    public boolean isApproved(){

        if(this.grade < 60){
            return false;
        }// if

        return true;
    }// isApproved

    public int changeYearIfApproved(){

        if(isApproved()){
            this.year += 1;
            System.out.println("Congratulations. Promoted to year: " + this.year);
        } else {
            System.out.println("Better luck next time.");
        }// else

        return this.year;
    }// changeYearIfApproved

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", registration=" + registration +
                ", grade=" + grade +
                ", year=" + year +
                '}';
    }// toString
}// class Student