package com.example;

public class GenericMethodDemo {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
    
    public static <T> T getFirst(T[] array) {
        if(array.length > 0) return array[0];
        return null;
    }
    
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3};
        String[] names = {"Alice","Bob"};

        printArray(numbers);
        printArray(names);
      
        String firstName = getFirst(names);  // T = String
        Integer firstNum = getFirst(numbers); // T = Integer

        System.out.println(firstName); // Alice
        System.out.println(firstNum);  // 1
    }
}
