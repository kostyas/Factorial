package ua.factorial.kostya;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("¬веди сумму: ");
		int sum = scan.nextInt();
        System.out.println("—умма равна: " + getSum(sum));
    }

    private static long getSum(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) { 
        	fact = fact.multiply(BigInteger.valueOf(i));
        }
        long sum = 0;
        while (fact.compareTo(BigInteger.ZERO) > 0) { 
        	sum += fact.mod(BigInteger.TEN).longValue(); 
        	fact = fact.divide(BigInteger.TEN);
        }
        return(sum);
        
    }
	}
