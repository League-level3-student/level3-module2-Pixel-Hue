package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
    
        return num1+ " x " +num2 + " = " + (num1*num2);
    }
    public static boolean isPrime(int num) {
		return false;
    	//fix is prime and make sure to do all tests
    }
    
    public static int findBrokenEgg(List<String> eggs) {
    	for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("Broken")) {
				return i;
			}
		}
        return -1;
    }
}
