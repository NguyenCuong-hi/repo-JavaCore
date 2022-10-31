package thread;

import file.Xfile;


public class ThreadTwo implements Runnable {
    public void run() {
        int i = 0;
        while (i != 5) {
            if (Xfile.readFile()) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else {
                System.out.println("Danh sach trong !");
                break;
            }
            i++;

        }
    }

}
