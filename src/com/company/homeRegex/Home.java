package com.company.homeRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Home {
    public static class Main {

        public static void main(String[] args) {

            var scanner = new Scanner(System.in);
            System.out.println("Enter your IP:");
            if (scanner.nextLine().matches("^(((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5]))$")) {
                System.out.println("your IP is true");
            } else System.out.println("your IP is false");
            scanner.close();
        }
    }
}
