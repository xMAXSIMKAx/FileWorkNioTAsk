package App.view;

import App.File.FileReadService;
import App.File.FileWriteService;

import java.util.Scanner;

public class View {


    public void view(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriteService writeService = new FileWriteService();
        FileReadService readService = new FileReadService();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Write to file");
            System.out.println("2. Read from file");
            System.out.println("0. Exit\n");
            System.out.println("5 ????????");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter file name: ");
                    String fileName = scanner.nextLine();
                    System.out.println("Enter content: ");
                    String content = scanner.nextLine();
                    writeService.WriteToFile(fileName, content);
                    break;
                case 2:
                    System.out.println("Enter file name: ");
                    String fileName2 = scanner.nextLine();
                    System.out.println(readService.ReadFromFile(fileName2));
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;

                case 5:
                    System.out.println("(っ＾▿＾)۶\uD83C\uDF78\uD83C\uDF1F\uD83C\uDF7A٩(˘◡˘ )");
                    System.out.println("Ви знайшли пасхалку вам віртуальна чашка");
                    System.out.println("(っ＾▿＾)۶\uD83C\uDF78\uD83C\uDF1F\uD83C\uDF7A٩(˘◡˘ )");
                    System.out.println("Ви знайшли пасхалку вам віртуальна чашка");
                    System.out.println("(っ＾▿＾)۶\uD83C\uDF78\uD83C\uDF1F\uD83C\uDF7A٩(˘◡˘ )");
                    System.out.println("Ви знайшли пасхалку вам віртуальна чашка");
                    System.out.println("(っ＾▿＾)۶\uD83C\uDF78\uD83C\uDF1F\uD83C\uDF7A٩(˘◡˘ )");
                    System.out.println("Ви знайшли пасхалку вам віртуальна чашка");
                    System.out.println("(っ＾▿＾)۶\uD83C\uDF78\uD83C\uDF1F\uD83C\uDF7A٩(˘◡˘ )");
                    System.out.println("Ви знайшли пасхалку вам віртуальна чашка");
                    System.out.println("(っ＾▿＾)۶\uD83C\uDF78\uD83C\uDF1F\uD83C\uDF7A٩(˘◡˘ )");
                    System.out.println("Ви знайшли пасхалку вам віртуальна чашка");
                    System.out.println("(っ＾▿＾)۶\uD83C\uDF78\uD83C\uDF1F\uD83C\uDF7A٩(˘◡˘ )");
                    System.out.println("Ви знайшли пасхалку вам віртуальна чашка");
                    System.out.println("(っ＾▿＾)۶\uD83C\uDF78\uD83C\uDF1F\uD83C\uDF7A٩(˘◡˘ )");
                    System.out.println("Ви знайшли пасхалку вам віртуальна чашка");
                    System.out.println("(っ＾▿＾)۶\uD83C\uDF78\uD83C\uDF1F\uD83C\uDF7A٩(˘◡˘ )");

                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

