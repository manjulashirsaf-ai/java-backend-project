package com.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.*;

import java.io.*;

public class JavaIO {
    public static void main(String[] args) {

        try (BufferedReader read =
                 new BufferedReader(new FileReader("input.txt"));
             BufferedWriter write =
                 new BufferedWriter(new FileWriter("output.txt"))) {

            String str;

            while ((str = read.readLine()) != null) {
                write.write(str);
                write.newLine();   // preserve line breaks
                System.out.println(str);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/* 
 *Java 9+ (Can Reuse Existing Variables)
BufferedReader read = new BufferedReader(new FileReader("input.txt"));
BufferedWriter write = new BufferedWriter(new FileWriter("output.txt"));

try (read; write) {
    // Read lines and write to output
}*/
