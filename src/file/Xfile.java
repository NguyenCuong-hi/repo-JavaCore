package file;

import constainvariable.ConstainsVariables;
import model.Student;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Xfile {
    private static File file = new File(ConstainsVariables.FILEPATH);

    public static boolean writeFile(Student newStudent) {

        boolean status = false;
        if (newStudent != null) {
            try {
                FileOutputStream fileOutputStream;
                fileOutputStream = new FileOutputStream(ConstainsVariables.FILEPATH, true);
                ObjectOutputStream objectOutputStream = file.length() == 0 ?
                        new ObjectOutputStream(fileOutputStream) : new StudentObjectStream(fileOutputStream);
                objectOutputStream.writeObject(newStudent);
                fileOutputStream.close();
                status = true;
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return status;

    }

    public static boolean readFile() {
        boolean status = false;
        Queue<Student> studentQueue = new LinkedList<>();
        try {
            file.createNewFile();
        } catch (IOException ie) {
            throw new RuntimeException();
        }
        if (file.length() != 0) {
            try {

                FileInputStream fileInputStream = new FileInputStream(ConstainsVariables.FILEPATH);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                while (fileInputStream.available() != 0) {
                    Student student = (Student) objectInputStream.readObject();
                    studentQueue.offer(student);

                }
                System.out.println("Tong so hoc sinh: " + studentQueue.size());
                objectInputStream.close();
                fileInputStream.close();
                status = true;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return status;

    }


}

