//Class: CSE 132L
//Section: J08
//Term: Fall
//Instructor: Chandana Avadhani
//Name: Cameron White
//Lab#: 3



import java.util.Scanner;
public class Lab3A {
    public static void main(String[] args){
        float owed, apr, mprc, mpc;
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount owed: $");
        owed = sc.nextInt();
        System.out.print("APR: ");
        apr = sc.nextFloat();
        mprc = apr / 12;
        mpc = owed * apr / 12 / 100;
        String mpr = String.format("%.3f", mprc);
        String mp = String.format("%.2f", mpc);
        System.out.print("APR: " + apr);
        System.out.println("Monthly Percentage Rate: " + mpr);
        System.out.println("Minimum payment: $" + mp);
    }
}
