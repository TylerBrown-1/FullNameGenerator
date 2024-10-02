package com.pluralsight;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine().trim();

        // Prompt for middle name
        System.out.print("Enter your middle name (press Enter if none): ");
        String middleName = scanner.nextLine();

        // Prompt for last name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Prompt for suffix
        System.out.print("Enter your suffix (press Enter if none): ");
        String suffix = scanner.nextLine();

        // Generate full name
        String fullName = generateFullName(firstName, middleName, lastName, suffix);

        // Display the full name
        System.out.println("Your full name is: " + fullName);

        scanner.close();

}

private static String generateFullName(String firstName, String middleName, String lastName, String suffix) {
    StringBuilder fullName = new StringBuilder(firstName);

    if (!middleName.isEmpty()) {
        fullName.append(" ").append(middleName);
    }

    fullName.append(" ").append(lastName);

    if (!suffix.isEmpty()) {
        fullName.append(", ").append(suffix);
    }

    return fullName.toString();
}
}