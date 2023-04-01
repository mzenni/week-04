package week3;

public class assignment {

	public static void main(String[] args) {
		/* 
		 * Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		*/
		System.out.println("\nQuestion 1A: Create an array called ages and print the difference between the first and last element. ");
			int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
			int ageDiff = (ages[ages.length - 1] - ages[0]); // uses ages.length -1 to find the last value
			System.out.println("The difference of the first and last elements in the array is " + ageDiff +".");
		System.out.println("\nQuestion 1B: Add additional elements to the array and repeat. ");
			int[] ages1B =  {15, 3, 9, 23, 64, 2, 8, 28, 93, 64, 89, 90};
			int ageDiff1B = (ages1B[ages1B.length - 1] - ages1B[0]);
			System.out.println("The difference of the first and last elements in the array is " + ageDiff1B +".");
		System.out.println("\nQuestion 1C: Use a loop to calculate the average age. "); 
			int sum1 = 0; 
			int len1 = ages.length;
			for (int a : ages) {
				sum1 += a; 
			} 	// loop finds the sum by adding each element of the array
			int avg = sum1 / len1;		// divide sum by count to get avg
			System.out.println("The average of the original array is "+ avg +".");
			
			int sum2 = 0;
			int len2 = ages1B.length;
			for (int a2 : ages1B) {
				sum2 += a2;
			}
			int avg2 = sum2/len2;
			System.out.println("The average of the new array is "+ avg2 +".");
			//Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		//Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		//Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
			System.out.println("\nQuestion 2: Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.");
			String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			// 2A
			System.out.println("\n2A: Iterate array and calculate average number of letters:");
			int num = 0;
			for(String name : names){
			    num += name.length();
			}
			int nameAvg = num / names.length; 
			System.out.println("The average number of letters in the Names array is " + nameAvg +".");
			// 2B
			System.out.println("\n2B: Iterate through the array again and concatenate all the names together");
			for (String name : names){
			    System.out.print(name + " ");
			}
			
		System.out.println("\n\nQuestion 3:");
		System.out.println("To access the last element of any array, you use array[array.length-1].");
		System.out.println("\nQuestion 4: ");
		System.out.println("To access the first element of any array, you use array[0].");

		//Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		System.out.println("\nQuestion 5: Create a new array with the length of each name from the name array");
		int size = names.length; // The number of names
		//System.out.println(nameAmt);
		int[] nameLengths = new int[size];
		//System.out.println("Amount of values in array: " + nameLengths.length);
		for(int i = 0; i < size; i++){
			nameLengths[i] = names[i].length();
		    System.out.println(nameLengths[i]);  
		}
		// Write a loop to calculate the sum of all the name lengths in the array. 
		System.out.println("\nQuestion 6: Name Length Sum:");
		int nameSum = 0;
		for(int nL : nameLengths) {
			nameSum += nL; 
		}
		System.out.println("The sum of all the name lengths is " + nameSum +".");
		
		System.out.println("\nQuestion 7: A method that takes a word and number and prints the word x number of times: ");
		System.out.println(concateWord("Hello", 3));
		
		System.out.println("\nQuestion 8: Full Name: ");
		String name = fullName("John", "Doe");
		System.out.println(name);

		System.out.println("\nQuestion 9: Sum of Ints Greater than 100: ");
		int[] array = {3, 4, 3, 62};
		System.out.println(greater100(array));
		
		System.out.println("\nQuestion 10: Average of Doubles: ");
		double[] doubleArray = {3.2, 4.4, 5.3, 6.32};
		System.out.print(doubleAvg(doubleArray));

		System.out.println("\nQuestion 11: Compare averages of two arrays:");
		double[] array1 = {55.5, 30.5, 48.5};
		double[] array2 = {5.5, 3.5, 4.5};
		System.out.println(twoArrays(array1, array2));

		System.out.println("\nQuestion 12: Will you buy a drink? ");
		boolean hot = true;
		double money = 11;
		System.out.println(willBuyDrink(hot, money));
		
		System.out.println("\nQuestion 13: Your own method");
		System.out.println("What is for dinner?");
		boolean home = true;
		double cash = 19.99;
		int time = 2;
		boolean weekend = true;
		System.out.println(dinnerPlans(home, cash, time, weekend));
	}
	
	/*------------------------------------------------Additional Methods-------------------------------------------------------*/
	
	//Question 7: Method that takes a string and int and prints the string n number of times 
	static String concateWord(String word, int n){
		String repeatWord = "";
	    for(int i = 0; i < n; i++){
	       repeatWord += word;
	    }
	    return repeatWord;
	}
	
	// Question 8: Method that takes two strings (First/Last name) and returns a full name
	public static String fullName(String firstName, String lastName){
	    return firstName + " " + lastName;
	}
	
	// Question 9: Method that takes an array of ints and returns true if sum > 100
	static boolean greater100(int[] array){
	    int sum = 0; 
	    for (int a : array){
	        sum += a; 		// adds each element in the array
	    }
	    if(sum > 100){
	        return true;
	    }
	    return false;
	}
	
	// Question 10: Method that returns the average of double arrays
	static double doubleAvg(double[] array){
	    double sum = 0.0;
	    int count = array.length;  
	    for (double a : array){
	        sum += a; 
	    }
	    double avg = sum / count;
	    return avg; 
	}
	
	// Question 10: Method that returns true if the average of the first array is greater than the average of the second
	static boolean twoArrays(double[] array1, double[] array2){
	    double sum1 = 0.0;
	    int count1 = array1.length;
	    for (double a1 : array1){
	        sum1 += a1; 
	    }
	    double avg1 = sum1 / count1;
	    
	    double sum2 = 0.0;
	    int count2 = array2.length;
	    for(double a2: array2){
	        sum2 += a2;
	    }
	    double avg2 = sum2 / count2;
	    if(avg1 > avg2){
	        return true;
	    }
	    return false;
	    
	}
	
	// Question 11: Method that takes a inputs (temperature and money) and returns true if it is both hot and you have over $10.50 
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket){
	    if (isHotOutside && moneyInPocket > 10.50){		// if hot outside is true and money is greater than $10.50, return true
	        return true;
	    }
	    return false;
	}
	
	// Question 12: Create your own method to solve a problem
	public static String dinnerPlans(boolean foodAtHome, double moneyInPocket, int freeTime, boolean isWeekend){
	    if(foodAtHome && ! isWeekend){		// if you have food at home and it isn't the weekend, go home to eat
	        return "There is food at home, go eat!";
	    }
	    if(isWeekend){	// it's the weekend, go to a restaurant
	        return "Treat yourself! Go to that restaurant downtown that you've been dying to try.";
	    }
	    if(moneyInPocket < 24.95 || freeTime < 1){	// you don't have enough money or time to go to a grocery store, try a drive through
	        return "Hit a drive through on your way!";
	    }	// Go to the grocery store 
	    return "You have the time and money right now to go to the grocery store. What will you make?";
	    
	    /* This method takes factors into consideration so you can decide what to do for dinner. 
	     * If there is already food at home, you will eat dinner there, unless it is a weekend. 
	     * If there is no food at home, and you have less than $24.95 on you, or you have less than an hour of free time, 
	     * the program tells you that your best option is to go through a drive through. If you have more than an hour of 
	     * free time and more than $24.95, the program tells you that you should go grocery shopping. 
	     * On the weekend, the program tells you to try that new restaurant. 
		 */

	}
}
