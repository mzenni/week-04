package week04;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Why would we use a StringBuilder instead of a String?
		System.out.println("Question 1: Why would we use a StringBuilder instead of a string?");
		System.out.println("\nA StringBuilder is used instead of a String because Strings are immutable, or cannot be changed. A StringBuilder can be modified.");
				// 		a. Instantiate a new StringBuilder
		System.out.println("\nQuestion 1A: Instantiate a new String Builder: ");

		StringBuilder sb = new StringBuilder();

		// use append() to dynamically create a String using StringBuilder 
		System.out.println("\nQuestion 1B: Append the characters 0 to 9 separated by dashes: ");
		for(int i = 0; i < 10; i++) {
			sb.append(i);
				if(i != 9) {
					sb.append("-");
				}
		}
		System.out.println(sb.toString());
		
				//		b. Append the characters 0 through 9 to it separated by dashes
				// 				Note:  make sure no dash appears at the end of the StringBuilder

				
				// 2. List of String:
		System.out.println("\nQuestion 2: Create  a list of strings and add 5 strings to it: ");
		List<String> stringList = new ArrayList<String>();
				//		a. Create a list of Strings 
				//		b. Add 5 Strings to it, each with a different length
		stringList.add("Math");
		stringList.add("Science");
		stringList.add("ELA");
		stringList.add("Social Studies");
		stringList.add("Music");
		System.out.println(stringList); 

				
				// 3. Write and test a method that takes a list of strings 
				//			and returns the shortest string
		System.out.println("\nQuestion 3: A method that takes a list of strings and returns the shortest string: ");
		System.out.println(shortestString(stringList));
		

				// 4. Write and test a method that takes a list of strings 
				//			and returns the list with the first and last element switched
		System.out.println("\nQuestion 4: A method that takes a list of strings and returns the first and last element switched");
		System.out.println(firstLast(stringList));
				
				// 5. Write and test a method that takes a list of strings 
				//			and returns a string with all the list elements concatenated to each other,
				// 			separated by a comma
		System.out.println("\nQuestion 5: A Method that takes a list of strings and returns them concatenated with a comma");
		System.out.println(comma(stringList));		
				// 6. Write and test a method that takes a list of strings and a string 
				//			and returns a new list with all strings from the original list
				// 			containing the second string parameter (i.e. like a search method)
		System.out.println("\nQuestion 6: A method that returns a new list with search values from the original list");
		List<String> similarWords = new ArrayList<String>();
		similarWords.add("replay");
		similarWords.add("repair");
		similarWords.add("fire");
		similarWords.add("tired");
		similarWords.add("tore");
		similarWords.add("lore");
		System.out.println(findWords(similarWords, "ir")); 
				
				// 7. Write and test a method that takes a list of integers 
				//			and returns a List<List<Integer>> with the following conditions specified
				//			for the return value:
		System.out.println("\nQuestion 7: A method that takes a list of integers and returns four lists: ");
		List<Integer> integerList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		
				//		a. The first List in the returned value contains any number from the input list 
				//			that is divisible by 2
		List<List<Integer>> number = divisibleList(integerList); 
		int i = 1; 
		for(List<Integer> intList : number) {
			for(Integer num1 : intList) {
				System.out.print(num1 + " ");
			}
			if(i < number.size()) {
				System.out.println("\n ");
				System.out.println("Next list: ");
			}
			i++;
		} 
				//		b. The second List contains values from the input list that are divisible by 3
				//		c. The third containing values divisible by 5, and 
				//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
				
				// 8. Write and test a method that takes a list of strings 
				//			and returns a list of integers that contains the length of each string
		System.out.println("\nQuestion 8: A method that takes a list of strings and returns a list of the length of each string");
		List<String> method8 = new ArrayList <String>(); 
			method8.add("A");
			method8.add("AB");
			method8.add("ABC");
			method8.add("ABCD");
			method8.add("ABCDE");
			method8.add("ABCDEF");
			method8.add("ABCDEFG");
		System.out.println(striLen(method8));
		
				
				// 9. Create a set of strings and add 5 values
		System.out.println("\nQuestion 9: Print a set of strings and add five values");
		Set<String> coffees = new HashSet<String>();
		coffees.add("Ice coffee");
		coffees.add("Decaf");
		coffees.add("Americano");
		coffees.add("Espresso");
		//coffees.add("Decaf");
		//coffees.add(null);
		//coffees.add(null);
		coffees.add("Latte");
		System.out.println(coffees);
				
				
				// 10. Write and test a method that takes a set of strings and a character 
				//			and returns a set of strings consisting of all the strings in the
				// 			input set that start with the character parameter.
		System.out.println("\nQuestion 10: A method that takes a set of strings and a character and returns the set of strings that start with that character");
		Set<String> question10 = new HashSet <String>(); 
		question10.add("apples");
		question10.add("oranges");
		question10.add("peaches");
		question10.add("pineapple");
		question10.add("blackberries");
		question10.add("blueberries");
		question10.add("bananas");
		question10.add("black raspberry");
		System.out.println(stringCharacter(question10, 'p'));
		
				
				// 11. Write and test a method that takes a set of strings 
				//			and returns a list of the same strings
		System.out.println("\nQuestion 11: A method that takes a set of strings and returns a list of the same strings: ");
		System.out.println("\nQuestion 11: Using System.out.println(setList(question10));");
		System.out.println(setList(question10));
		System.out.println("\nQuestion 11: Using enhanced for loop to print: ");
		List<String> resultList = setList(question10);
		for(String rL : resultList) {
			System.out.println(rL);
		}
				

				// 12. Write and test a method that takes a set of integers 
				//			and returns a new set of integers containing only even numbers 
				//			from the original set
		System.out.println("\nQuestion 12: A method that takes a set of integers and returns the set with only even numbers: "); 
		Set<Integer> intSet = new HashSet<Integer>();
		intSet.add(7);
		intSet.add(9);
		intSet.add(2);
		intSet.add(22);
		intSet.add(13);
		intSet.add(26);
		intSet.add(12);
		intSet.add(15);
		intSet.add(1000);
		intSet.add(158);
		
		System.out.println(evenInts(intSet)); 
		
				
				// 13. Create a map of string and string and add 3 items to it where the key of each
				// 			is a word and the value is the definition of the word
		System.out.println("\nQuestion 13: Create a map of string and add strings to it where they key of each is a word and the value is the definition:");
		Map<String, String> dictionary = new HashMap<String, String>(); 
				dictionary.put("Guitar ", " A six string instrument");
				dictionary.put("Drum  ", " A percussion instrument");
				dictionary.put("Microphone ", "A tool used to amplify noise");
		System.out.println(dictionary);
				// 14. Write and test a method that takes a Map<String, String> and a string 
				// 			and returns the value for a key in the map that matches the
				// 			string parameter (i.e. like a language dictionary lookup)
		System.out.println("\nQuestion 14: A method that takes a Map<String, String> and returns the key in the map that matches the parameter (like a language dictionary lookup");
		//System.out.println(dictionaryLookup(dictionary, "Guitar"));
		String value = dictionaryLookup(dictionary, "Guitar ");
		System.out.println("The definition for 'Guitar': " + value);

				
				// 15. Write and test a method that takes a List<String> 
				//			and returns a Map<Character, Integer> containing a count of 
				//			all the strings that start with a given character
		System.out.println("\nQuestion 15: A method that takes a List<String> and returns a Map<Character, Integer> containing a count of all the strings that start with a given character"); 
				Map<Character, Integer> charMap = characterCount(resultList); 
				for (Character ch : charMap.keySet()) {
					System.out.println(ch + " - " + charMap.get(ch));
				}
			}
				
			// Method 15:
			public static Map<Character, Integer> characterCount(List<String> list){
				Map<Character, Integer> charCount = new HashMap<Character, Integer>(); 
				for (String str : list) {
					char c = str.charAt(0); 
					if(charCount.get(c) == null) {
						charCount.put(c, 1); 
					}
					else {
						charCount.put(c, charCount.get(c) + 1);
					}
				}
				return charCount; 
			}
			
			
			
			// Method 14:
			public static String dictionaryLookup(Map<String, String>map, String word) {
				for(String key : map.keySet()) {
					if(key.equals(word)) {
						return map.get(key);
					}
				}
				return "";
			}
			

			
			// Method 12:
			public static Set<Integer> evenInts (Set<Integer> numbers){
				Set<Integer> evenNumbers = new HashSet<Integer>();
				for (Integer n : numbers) {
					if(n % 2 == 0) {
						evenNumbers.add(n);
					}
				}
				return evenNumbers; 
			}
			

			
			// Method 11:
			public static List<String> setList (Set<String> method11){
				List<String> sL = new ArrayList<String>();
				sL.addAll(method11);
				return sL; 
			}


			// Method 10:
			public static Set<String> stringCharacter (Set<String> method10, char c){
				Set<String> charStr = new HashSet<String>();
				for(String str : method10) {
					if(str.charAt(0) == c) {
						charStr.add(str);
					}
				}
				return charStr; 
			}

			
			// Method 8:
			public static List<Integer> striLen (List<String> strList){
				List<Integer> lengths = new ArrayList<Integer>();
				for(String str : strList) {
					lengths.add(str.length()); 
				}
				return lengths; 
			}
			

			
			// Method 7:
			public static List<List<Integer>> divisibleList(List<Integer> intList){
				List<List<Integer>> results = new ArrayList<List<Integer>>();
				results.add(new ArrayList<Integer>());
				results.add(new ArrayList<Integer>());
				results.add(new ArrayList<Integer>());
				results.add(new ArrayList<Integer>());
				for(int n : intList) {
					if(n % 2 == 0) {
						results.get(0).add(n);
					}
					if(n % 3 == 0) {
						results.get(1).add(n);
					}
					if(n % 5 == 0) {
						results.get(2).add(n);
					}
					if(n % 5 != 0 && n % 3 != 0 && n % 2 != 0) {
						results.get(3).add(n);
					}
				}
				return results; 
			}

			
			// Method 6:
			public static List<String> findWords(List<String> stringList, String search){
				List<String> searchList = new ArrayList<String>();
				for(String str : stringList) {
					if(str.contains(search)) {
						searchList.add(str);
					}
				}
				return searchList; 
			}

			
			// Method 5:
			public static String comma(List<String> stringList) {
				StringBuilder result = new StringBuilder(); 
				int i = 1; 
				for(String str : stringList) {
					result.append(str);
					if(i < stringList.size()) {
						result.append(", "); 
					}
					i++;
				}
				return result.toString(); 
			}
			
			
			// Method 4:
			public static List<String> firstLast(List<String> stringList){
				String firstElement = stringList.get(0);
				stringList.set(0, stringList.get(stringList.size() -1));
				stringList.set((stringList.size() -1), firstElement);
				return stringList;
			}
			
			
			
			// Method 3:
			public static String shortestString(List<String> stringList) {
				String shortest = stringList.get(0);
				for(String str : stringList) {
					if(str.length() < shortest.length()) {
						shortest = str;
					}
				}
				return shortest;
			}
			

}
