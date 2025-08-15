package misc;

import misc.annotations.Done;

import java.util.Scanner;

@Done
public class Factorials {

    public static long printAndCountFactors(long n, Speed speed){

        return switch (speed) {
            case NORMAL -> countFactors(n);
            case FAST -> countFactorsFast(n);
            case FASTEST -> countFactorsSuperfast(n);
            default -> {
                System.out.println("Speed either not specified or not supported.");
                yield -1;
            }
        };
    }

    public static long countFactors(long n){

        long ans = 0;
        System.out.print("Factors: ");

        for (long i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + "  ");
                ans++;
            }
        }

        System.out.println();
        return ans;
    }

    public static long countFactorsFast(long n){

        long ans = 2;
        System.out.print("Factors: " + 1 + "  " + n + "  ");

        for (long i = 2; i <= n / 2; i++) {
            if(n % i == 0) {
                System.out.print(i + "  ");
                ans++;
            }
        }

        System.out.println();
        return ans;
    }

    public static long countFactorsSuperfast(long n){

        int count = 0;
        System.out.print("Factors: ");

        for(long i = 1; i*i <= n; i++) {

            if(n % i == 0) {
                if(n / i == i) {
                    System.out.print(i + "  ");
                    count++;
                } else {
                    System.out.print(i + "  " + n/i + "  ");
                    count += 2;
                }
            }
        }

        System.out.println();
        return count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find factors of it: ");
        int n = scanner.nextInt();

        for (Speed speed : Speed.getBasicOnes()) {

            System.out.println("---------------------------------------");
            System.out.println("Speed: " + speed);
            System.out.println("---------------------------------------");
            long startedAt = System.currentTimeMillis();
            System.out.println("Total factors of " + n + " are: " + printAndCountFactors(n, speed));
            System.out.println("Time taken: " +  ((System.currentTimeMillis() - startedAt) / 1000) + " seconds");
        }
    }
}
