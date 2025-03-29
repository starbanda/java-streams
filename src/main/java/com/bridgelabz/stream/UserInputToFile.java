package com.bridgelabz.stream;

import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "user_data.txt";

        try (FileWriter writer = new FileWriter(fileName, true)) {
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            String userData = "Name: " + name + "\nAge: " + age + "\nFavorite Language: " + language + "\n\n";
            writer.write(userData);

            System.out.println("Data saved successfully to " + fileName);
        } catch (IOException e) {
            System.err.println("An error occurred while reading input or writing to file: " + e.getMessage());
        }
    }
}

