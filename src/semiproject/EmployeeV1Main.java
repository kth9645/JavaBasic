package semiproject;

import sun.SungJukV8Service;

import java.util.Scanner;

public class EmployeeV1Main {
    public static void main(String[] args) {

        String menu;

        EmployeeV1Service emsrv = new EmployeeV1Service();
        Scanner sc = new Scanner(System.in);

        while (true) { // 메뉴출력 및 입력받기[반복]
            emsrv.displayMenu();
            menu = sc.nextLine();

            switch (menu){
                case "1": emsrv.newEmplo(); break;
                case "2": emsrv.readEmplo(); break;
                case "3": emsrv.readOneEmplo();break;
                case "4": emsrv.modifyEmplo(); break;
                case "5": break;
                case "0": System.exit(0); break;
                default: {
                    System.out.println("잘못된 입력입니다.");
                } //default 끝
            } //switch 끝
        } //while 끝


    } // psvm 끝
}// end
