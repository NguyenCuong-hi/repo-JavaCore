package menu;

import model.StudentSevice;

import java.util.Scanner;


public class Menu {
    private static final Scanner scanner = new Scanner(System.in);

    private static int selectOption;

    public static void printMenu() {
        System.out.println(""
                + "\n1. Thêm sinh viên. "
                + "\n2. Hiển thị tổng số sinh viên."
                + "\n3. Thoát");
    }

    public static void createMenu() {
        printMenu();
        while (true) {
            try {

                System.out.println("Lựa chọn: ");
                selectOption = Integer.parseInt(scanner.nextLine());
                if (selectOption < 0 || selectOption > 13) {
                    System.out.println("Cho phép lựa chọn từ 1-12");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.print("Chỉ nhập số !");
            }
        }

        switch (selectOption) {
            case 1:
                StudentSevice.addToQueueWithThread();
                createMenu();
                break;
            case 2:
                StudentSevice.showNumberStudent();
                createMenu();
                break;
            case 3:
                System.out.println("Thoat");
                break;

        }
    }
}
