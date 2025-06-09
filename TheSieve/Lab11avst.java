package TheSieve;// TheSieve.Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11avst
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        final int MAX = 100;
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[])
    {
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        // Assume everything is prime
        for(int i = 2; i < primes.length; i++){
            primes[i] = true;
        }

        // Student edits start here
        for(int i = 2; i < primes.length; i++){
            int multiplier = 2;
            if (i*multiplier == i);
            {
                primes[i] = false;
            }
            multiplier += 1;
        }

        // Student edits end here

    }

    public static void displayPrimes(boolean primes[])
    {
        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);

        // Output all values of the list
        for(int i = 2; i < primes.length; i++){
            if(primes[i] == true) {
                System.out.print(i + " ");
            }
        }


        System.out.println();

    }

}