package thread;

import file.Xfile;
import model.Student;

import java.util.Queue;


public class ThreadOne extends Thread {
    Queue<Student> studentQueues;
    Student student;

    public ThreadOne(Queue<Student> studentQueue, Student students) {
        studentQueues = studentQueue;
        student = students;
    }
    @Override
    public void run()
    {
        studentQueues.add(student);
        Xfile.writeFile(student);
    }

}
