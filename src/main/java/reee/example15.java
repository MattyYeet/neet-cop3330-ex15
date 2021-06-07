package reee;

import java.util.Scanner;

public class example15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //System.out.println("The password is abc$123");
        System.out.print("What is the password? ");
        String password = input.nextLine();
        if(password.equals("abc$123"))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }
    }
}
