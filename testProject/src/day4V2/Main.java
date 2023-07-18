package day4V2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String filePath = "/Users/Public/Documents/Training/fake_data.csv";
        ArrayList<FakeAvatar> fakeAvatars = Service.loadCsvFile(filePath);

        while (true) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Enter 1 to get user by id");
            System.out.println("Enter 2 to get all user");
            System.out.println("Enter 3 to add user");
            System.out.println("Enter 4 to update user");
            System.out.println("Enter 5 to delete user");
            System.out.println("Enter 6 to search by user name");
            int x = scn.nextInt();
            scn.nextLine();
            switch (x) {
                case 1:
                    Service.getUserById(fakeAvatars);
                    break;
                case 2:
                    Service.getAllUser(fakeAvatars);
                    break;
                case 3:
                    Service.addUser(fakeAvatars);
                    break;
                case 4:
                    Service.updateUser(fakeAvatars);
                    break;
                case 5:
                    Service.deleteUser(fakeAvatars);
                    break;
                case 6:
                    Service.getUserByName(fakeAvatars);
                    break;
                default:
                    System.out.println("You have entered the wrong input");
            }
            Service.updateCSV(filePath, fakeAvatars);
            System.out.println("Enter 'YES' to start application or 'NO' to quit");
            String s = scn.nextLine();
            if (s.equals("NO")) {
                break;
            }
        }
    }
}
