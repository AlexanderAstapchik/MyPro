package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeDirectory {
    public static void main(String[] args) {
        String path = "C:\\Users\\User\\IdeaProjects\\MyPro\\src\\homeRegex2";
        File directory = new File(path);
        if (!directory.exists()) {
            directory.mkdir();
            System.out.println("Directory created");
        } else {
            System.out.println("Already created");
        }
        File file1 = new File("C:\\Users\\User\\IdeaProjects\\MyPro\\src\\homeRegex2\\Text.txt");
        {
            try {
                FileWriter fw = new FileWriter(file1);
                fw.write("Document Number: 1111-FDC-2222-Sds-3f4t\n" + "the document contains a phone number: +(29)8084577\n");
                fw.write("Write and we will answer your questions: chertZnaet121@mail.ru");
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File file2 = new File("C:\\Users\\User\\IdeaProjects\\MyPro\\src\\homeRegex2\\Text1.txt");
        {
            try {
                FileWriter fw = new FileWriter(file2);
                fw.write("Document Number: 4323-vvC-6754-SGs-9l7l.Remember. The use of personal information of customers for their own purposes is punishable by law!\n" + "the document does not contain a phone number\n");
                fw.write("Write and we will answer your questions: ComiCon666@gmail.com");
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File file3 = new File("C:\\Users\\User\\IdeaProjects\\MyPro\\src\\homeRegex2\\Text2.txt");
        {
            try {
                FileWriter fw = new FileWriter(file3);
                fw.write("the document contains a phone number: +(33)3345633.It is original number!\n");
                fw.write("Write and we will answer your questions: odgeshBlia123@mail.ru");
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File file4 = new File("C:\\Users\\User\\IdeaProjects\\MyPro\\src\\homeRegex2\\Text3.txt");
        {
            try {
                FileWriter fw = new FileWriter(file4);
                fw.write("Document Number: 6666-fgC-6767-Skj-8k9k.Remember!");
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String[] files = directory.list();
        System.out.println(Arrays.toString(files));
        var scanner = new Scanner(System.in);
        System.out.println("Enter number of files:");
        var num = scanner.nextInt();
        int filesToProcess = 0;
        if (num >= files.length)
            filesToProcess = files.length;
        else filesToProcess = num;
        System.out.println("number of files = " + filesToProcess);
        Pattern patPhoneNum = Pattern.compile("\\+\\(\\d{2}\\)\\d{7}");
        try {
            FileReader fileReader = new FileReader("C:\\Users\\User\\IdeaProjects\\MyPro\\src\\homeRegex2\\Text.txt");
            Scanner sc = new Scanner(fileReader);
            int i = 1;
            while (sc.hasNextLine()) {
                Matcher matcher = patPhoneNum.matcher(sc.nextLine());
                while (matcher.find()) {
                    System.out.println(matcher.group());
                }
                i++;
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //  Matcher matcher=patPhoneNum.matcher()


//        Pattern patMail=Pattern.compile("^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}$");
//        Pattern patDoc=Pattern.compile("^\\d{4}[\\-]\\[a-zA-Z]{3}[\\-]\\d{4}[\\-]\\[a-zA-Z]{3}[\\-]\\d\\[a-zA-Z]\\d\\[a-zA-Z]$");
        //Document num1 = new Document(file1.getName(), );
//        for (int i = 0; i < filesToProcess; i++) {


    }


}






