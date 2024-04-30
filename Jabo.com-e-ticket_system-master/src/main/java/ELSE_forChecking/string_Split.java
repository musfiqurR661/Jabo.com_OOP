package ELSE_forChecking;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class string_Split {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String userInfo[] = str.split(" ");

//        for (String s : userInfo) {
//            System.out.println(s);
//        }


        //-----------------------

        try {
            BufferedReader read = new BufferedReader(new FileReader("D:\\FINAL PROJECT\\Jabo.com-e-ticket_system-master\\src\\main\\java\\ELSE_forChecking\\UserLogInInformation.txt"));

            String fromFile;

            while ((fromFile = read.readLine()) != null) {
                String fromFileREad[] = fromFile.split(" ");


                if (userInfo[0].equals(fromFileREad[0])) {
                    if (userInfo[1].equals(fromFileREad[1])) {
                        System.out.println("YEs working");
                       // break;
                    }
                }


            }
            read.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //-----------------------


    }
}
