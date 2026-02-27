package com.example;

public class GenericsClassExample<T> {
    private T content;

    public GenericsClassExample(T content) {
        this.content = content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void display() {
        System.out.println("Box contains: " + content);
    }

    public static void main(String[] args) {
        // Box for Integer
    	GenericsClassExample<Integer> intBox = new GenericsClassExample<>(123);
        intBox.display();           // Box contains: 123
        int value = intBox.getContent(); // type-safe, no cast needed

        // Box for String
        GenericsClassExample<String> strBox = new GenericsClassExample<>("Hello Generics");
        strBox.display();           // Box contains: Hello Generics
        String text = strBox.getContent();
    }
}
