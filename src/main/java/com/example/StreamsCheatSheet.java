package com.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsCheatSheet {
    public static void main(String[] args) {

        System.out.println("===== STREAM CREATION =====");
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Set<String> namesSet = new HashSet<>(Arrays.asList("Alice","Bob","Charlie","Alice"));
        String[] arr = {"X","Y","Z"};

        Stream<Integer> listStream = numbers.stream();
        Stream<String> setStream = namesSet.stream();
        Stream<String> arrayStream = Arrays.stream(arr);
        Stream<String> ofStream = Stream.of("Red","Green","Blue");
        
        // Terminal operations to use them
        System.out.println("List Stream doubled: " + listStream.map(n->n*2).collect(Collectors.toList()));
        System.out.println("Set Stream uppercase: " + setStream.map(String::toUpperCase).collect(Collectors.toList()));
        System.out.println("Array Stream sorted: " + arrayStream.sorted().collect(Collectors.toList()));
        System.out.println("Of Stream filtered: " + ofStream.filter(s -> s.startsWith("R")).collect(Collectors.toList()));

        // Infinite stream (limit required)
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n+2).limit(5);
        System.out.println("Infinite Stream (limited to 5): " + infiniteStream.collect(Collectors.toList()));

        System.out.println("\n===== INTERMEDIATE OPERATIONS =====");
        List<String> names = Arrays.asList("Alice","Bob","Charlie","David","Alice");

        List<String> processedNames = names.stream()
                .distinct()                        // remove duplicates
                .filter(name -> name.length() > 3) // filter length > 3
                .map(String::toUpperCase)          // map to uppercase
                .sorted()                           // sort alphabetically
                .collect(Collectors.toList());

        System.out.println("Processed Names: " + processedNames);

        // flatMap example
        List<List<Integer>> nested = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4)
        );
        List<Integer> flat = nested.stream()
                                   .flatMap(List::stream)
                                   .collect(Collectors.toList());
        System.out.println("Flat Map Result: " + flat);

        System.out.println("\n===== TERMINAL OPERATIONS =====");
        // forEach
        System.out.print("Numbers: ");
        numbers.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        // count
        long countEven = numbers.stream().filter(n -> n%2==0).count();
        System.out.println("Even numbers count: " + countEven);

        // reduce
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum of numbers: " + sum);

        // anyMatch / allMatch / noneMatch
        boolean anyGreaterThan5 = numbers.stream().anyMatch(n -> n > 5);
        boolean allPositive = numbers.stream().allMatch(n -> n > 0);
        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
        System.out.println("Any > 5: " + anyGreaterThan5);
        System.out.println("All positive: " + allPositive);
        System.out.println("None negative: " + noneNegative);

        // findFirst / findAny
        Integer firstGT5 = numbers.stream().filter(n -> n > 5).findFirst().orElse(null);
        Integer anyGT5 = numbers.stream().filter(n -> n > 5).findAny().orElse(null);
        System.out.println("First > 5: " + firstGT5);
        System.out.println("Any > 5: " + anyGT5);

        // toArray
        Integer[] numArray = numbers.stream().toArray(Integer[]::new);
        System.out.println("Array from Stream: " + Arrays.toString(numArray));

        System.out.println("\n===== PARALLEL STREAM =====");
        numbers.parallelStream()
               .map(n -> n * 2)
               .forEach(n -> System.out.print(n + " ")); // may print in any order
        System.out.println();

        System.out.println("\n===== INTSTREAM =====");
        IntStream.range(1,6).forEach(n -> System.out.print(n + " ")); // 1 to 5
        System.out.println();
        int sumIntStream = IntStream.of(10,20,30).sum();
        System.out.println("Sum from IntStream: " + sumIntStream);
    }
}

/*✅ What This Program Covers
Feature	Example in Code
Stream Creation	stream(), Arrays.stream(), Stream.of(), infinite stream
Intermediate	filter(), map(), distinct(), sorted(), flatMap()
Terminal	forEach(), collect(), count(), reduce(), anyMatch(), allMatch(), noneMatch(), findFirst(), findAny(), toArray()
Parallel Stream	.parallelStream()
Primitive Stream	IntStream.range(), IntStream.of()
This single program is literally your full Java Streams reference. ✅
*/
