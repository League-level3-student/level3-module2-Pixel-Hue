package _03_More_Algorithms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
    
        return num1+ " x " +num2 + " = " + (num1*num2);
    }
    public static boolean isPrime(int num) {
    	int factors = 0;
    	for (int i = 1; i <= num; i++) {
    		if (num % i == 0) {
    			factors++;
    		}
    	}
		if (factors == 2) {
			return true;
		}
		return false;
    	//fix is prime and make sure to do all tests
    }
    public static int findBrokenEgg(List<String> eggs) {
    	for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
        return -1;
    }
    public static boolean isSquare(int num) {
    double sqrt = Math.sqrt(num);
    	if (sqrt % 1 == 0) {
    		return true;
    	}
    	
    	
    	
    	return false;
    }
    public static boolean isCube(int num) {
        
        for (int i = 0; i <= num; i++) {
        if(i*i*i == num) {
				return true;
			}
			if (i*i*i > num) {
				break;
			}
		}
        	
        	
        	
        	
        	return false;
        }

    public static int countPearls(List<Boolean> oysters) {
    	int pearls = 0;
    	for (boolean isPearl : oysters) {
    		if (isPearl) {
    			pearls++;
    		}
    	}
		return pearls;
    	
    }
    public static double findTallest(List<Double> peeps) {
    	double highest = 0.0;
    	for (double num : peeps) {
    	if (highest < num) {
    		highest = num;
    	}
    	}
    	
    	
    return highest;
    } 
    public static String findLongestWord(List<String> words) {
    	String longest = "";
    	for (String word : words) {
    		if(word.length() > longest.length()) {
    			longest = word;
    		}
    	}
    	
    	return longest;
    	
    }
    public static boolean containsSOS(List<String> message) {
    	for (String mes : message) {
    		if (mes.contains("... --- ...")) {
    			return true;
    		}
    	}
    	
    	return false;
    }
   
	public static List<Double> sortScores(List<Double> results) {
		List<Double> sortedList = results;
		
		for (int i = 0; i < results.size()-1; i++) {
			
			for (int j = i+1; j < results.size(); j++) {
					if (sortedList.get(i) > sortedList.get(j)) {
						Double temp = sortedList.get(i);
						sortedList.set(i, sortedList.get(j));
						sortedList.set(j, temp);
					}
			}
		}
		return sortedList;
	}
	public static List<String> sortDNA(List<String> unsortedSequences) {
for (int i = 0; i < unsortedSequences.size()-1; i++) {
			
			for (int j = i+1; j < unsortedSequences.size(); j++) {
					if (unsortedSequences.get(i).length() > unsortedSequences.get(j).length()) {
						String temp = unsortedSequences.get(i);
						unsortedSequences.set(i, unsortedSequences.get(j));
						unsortedSequences.set(j, temp);
					}
			}
		}
		return unsortedSequences;
	}
	public static List<String> sortWords(List<String> words) {
for (int i = 0; i < words.size()-1; i++) {
			
			for (int j = i+1; j < words.size(); j++) {
					if (words.get(i).compareTo(words.get(j)) > 0) {
						String temp = words.get(i);
						words.set(i, words.get(j));
						words.set(j, temp);
					}
			}
		}

		// TODO Auto-generated method stub
		return words;
	}
}

