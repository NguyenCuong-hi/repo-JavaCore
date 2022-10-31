package model;



import thread.ThreadOne;
import thread.ThreadTwo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StudentSevice {
    private static Queue<Student> studentLinkedList = new LinkedList<>();
    private static Scanner input = new Scanner(System.in);

    public static String inputName() {
        String name;
        System.out.println("Enter Name: ");
        do {
            name = input.nextLine();
            if (name.isEmpty()) {
                System.out.println("Not Null !");
            }
        } while (name.isEmpty());
        return name;
    }

    public static int inputAge() {
        System.out.println("Enter Age: ");
        int age = 0;
        do {
            try {
                age = Integer.parseInt(input.nextLine());
                if (age <= 0) {
                    System.out.println("Age must be integer !");
                }
            } catch (Exception e) {
                System.out.println("Enter number(not character) !");
            }
        } while (age <= 0);
        return age;
    }

    public static String inputCode() {
        System.out.print("Enter Code: ");
        String code;
        do {
            code = input.nextLine();
            if (code.isEmpty()) {
                System.out.print("Not Null !");
            }
        } while (code.isEmpty());
        return code;
    }

    public static String inputClassName() {
        System.out.print("Enter class name: ");
        String className;
        do {
            className = input.nextLine();
            if (className.isEmpty()) {
                System.out.print("Not Null !");
            }
        } while (className.isEmpty());
        return className;
    }

    public static String inputAddress() {
        System.out.print("Enter Address: ");
        String address;
        do {
            address = input.nextLine();
            if (address.isEmpty()) {
                System.out.print("Not Null !");
            }
        } while (address.isEmpty());
        return address;
    }


    public static Student inputStudent() {
        String name = inputName();
        int age = inputAge();
        String code = inputCode();
        String className = inputClassName();
        String address = inputAddress();
        return new Student(name, age, code, className, address);
    }


    public static void addToQueueWithThread() {
        Student student = inputStudent();
        ThreadOne threadOne = new ThreadOne(studentLinkedList, student);
        threadOne.start();
    }

    public static void showNumberStudent() {
        Thread threadTwo = new Thread(new ThreadTwo());
        try {
            threadTwo.start();
            threadTwo.join();
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }


}
