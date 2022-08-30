//Class: CSE 132L
//Section: J08
//Term: Fall
//Instructor: Chandana Avadhani
//Name: Cameron White
//Lab#: 3

import java.util.Scanner;
public class Lab3B {
    public static void main(String[] args){
        int course1h, course2h, course3h, course4h;
        int course1g, course2g, course3g, course4g;
        float totalhours, totalqualitypoints;
        float gpa;
        Scanner sc = new Scanner(System.in);
        System.out.print("Course 1 hours: ");
        course1h = sc.nextInt();
        System.out.print("Grade for course 1: ");
        course1g = sc.nextInt();
        System.out.print("Course 2 hours: ");
        course2h = sc.nextInt();
        System.out.print("Grade for course 2: ");
        course2g = sc.nextInt();
        System.out.print("Course 3 hours: ");
        course3h = sc.nextInt();
        System.out.print("Grade for course 3: ");
        course3g = sc.nextInt();
        System.out.print("Course 4 hours: ");
        course4h = sc.nextInt();
        System.out.print("Grade for course 4: ");
        course4g = sc.nextInt();
        totalhours = course1h + course2h + course3h + course4h;
        totalqualitypoints = course1h * course1g + course2h * course2g + course3h * course3g + course4h * course4g;
        gpa = totalqualitypoints / totalhours;
        System.out.println("Total hours is: " + totalhours);
        System.out.println("Total quality points: " + totalqualitypoints);
        System.out.println("Your GPA for this semester is " + gpa);
    }
}
