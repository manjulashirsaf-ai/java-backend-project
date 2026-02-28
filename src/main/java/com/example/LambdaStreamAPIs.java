package com.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaStreamAPIs {

	 public static void main(String[] args) {

	        // Sample data
	        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35, 20, 10, 25);

	        // 1️⃣ Filter even numbers
	        List<Integer> evenNumbers = numbers.stream()
	                                           .filter(n -> n % 2 == 0)
	                                           .collect(Collectors.toList());
	        System.out.println("Even Numbers: " + evenNumbers);

	        // 2️⃣ Filter odd numbers
	        List<Integer> oddNumbers = numbers.stream()
	                                          .filter(n -> n % 2 != 0)
	                                          .collect(Collectors.toList());
	        System.out.println("Odd Numbers: " + oddNumbers);

	        // 3️⃣ Numbers greater than 20
	        List<Integer> greaterThan20 = numbers.stream()
	                                             .filter(n -> n > 20)
	                                             .collect(Collectors.toList());
	        System.out.println("Numbers Greater Than 20: " + greaterThan20);

	        // 4️⃣ Map: Square each number
	        List<Integer> squaredNumbers = numbers.stream()
	                                              .map(n -> n * n)
	                                              .collect(Collectors.toList());
	        System.out.println("Squared Numbers: " + squaredNumbers);

	        // 5️⃣ Sorted ascending
	        List<Integer> sortedAsc = numbers.stream()
	                                         .sorted()
	                                         .collect(Collectors.toList());
	        System.out.println("Sorted Numbers (Ascending): " + sortedAsc);

	        // 6️⃣ Sorted descending
	        List<Integer> sortedDesc = numbers.stream()
	                                          .sorted(Comparator.reverseOrder())
	                                          .collect(Collectors.toList());
	        System.out.println("Sorted Numbers (Descending): " + sortedDesc);

	        // 7️⃣ Distinct numbers
	        List<Integer> distinctNumbers = numbers.stream()
	                                               .distinct()
	                                               .collect(Collectors.toList());
	        System.out.println("Distinct Numbers: " + distinctNumbers);

	        // 8️⃣ Count of even numbers
	        long evenCount = numbers.stream()
	                                .filter(n -> n % 2 == 0)
	                                .count();
	        System.out.println("Count of Even Numbers: " + evenCount);

	        // 9️⃣ Count of odd numbers
	        long oddCount = numbers.stream()
	                               .filter(n -> n % 2 != 0)
	                               .count();
	        System.out.println("Count of Odd Numbers: " + oddCount);

	        // 🔟 Print all numbers using forEach
	        System.out.println("All Numbers:");
	        numbers.stream().forEach(n -> System.out.print(n + " "));
	        System.out.println();

	        // 1️⃣1️⃣ GroupingBy: Count frequency of each number
	        Map<Integer, Long> frequencyMap = numbers.stream()
	                                                 .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
	        System.out.println("Frequency of Numbers: " + frequencyMap);

	        // 1️⃣2️⃣ Advanced pipeline: Filter >10, square, remove duplicates, sort descending, print
	        System.out.println("Advanced Stream Pipeline (Descending):");
	        numbers.stream()
	               .filter(n -> n > 10)
	               .map(n -> n * n)
	               .distinct()
	               .sorted(Comparator.reverseOrder())
	               .forEach(System.out::println);
	    }
}

