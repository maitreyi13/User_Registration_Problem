//package com.bridgelabz;
//import java.util.Scanner;
//
//public class UserRegistration {
//    static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args) throws InvalidFirstNameException, InvalidLastNameException, InvalidEmailIdException, InvalidMobileNumberException, InvalidPasswordException {
//        System.out.println("*** Welcome to User Registration problem ***");
//        int choose;
//        int select;
//        do {
//            System.out.print("Press \n1.First Name Validation\n2.Last Name Validation\n3.Email Address validation\n4.Phone number Validation\n5.Password Validation : ");
//            System.out.print("Press\n1.Email Address validation\n2.Exit : ");
//            choose = sc.nextInt();
//            switch (choose) {
//                case 1 -> Operations.validFirstName("Neha");
//                case 2 -> Operations.validLastName("Joshi");
//                case 3 -> Operations.validEmailAddress("neha.joshi@co.bl");
//                case 4 -> Operations.validMobileNumber("91 8796415236");
//                case 5 -> Operations.validPassword("Neha@1234");
//                default -> System.out.println("Invalid: Enter valid details.");
//            }
//            System.out.print("Press \n1.Continue \n2.Exit : ");
//            select = sc.nextInt();
//        }while (select != 2);
//        System.out.println("Thank You!");
//    }
//}