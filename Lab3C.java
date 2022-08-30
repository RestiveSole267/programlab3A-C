import java.util.Scanner;
public class Lab3C {
    public static void main(String[] args){
        int quarters, dimes, nickels, pennies;
        int tquarters, tdimes, tnickels, tpennies, total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of quarters: ");
        quarters = sc.nextInt();
        System.out.print("Enter the number of dimes: ");
        dimes = sc.nextInt();
        System.out.print("Enter the number of nickels: ");
        nickels = sc.nextInt();
        System.out.print("Enter the number of pennies: ");
        pennies = sc.nextInt();
        System.out.println("You entered " + quarters + " quarters.");
        System.out.println("You entered " + dimes + " dimes.");
        System.out.println("You entered " + nickels + " nickels.");
        System.out.println("You entered " + pennies + " pennies.");
        tquarters = quarters * 25;
        tdimes = dimes * 10;
        tnickels = nickels * 5;
        tpennies = pennies * 1;
        int dollars = 0;
        int cents = 0;
        total = tquarters + tdimes + tnickels + tpennies;
        if (total > 100) {
            dollars += 1;
            total -= 100;
            System.out.println("Your total is " + dollars + " dollars and " + total + " cents. ");
        } else {
                System.out.println("Your total is " + dollars + " dollars and " + total + " cents. ");
        }
    }
}

