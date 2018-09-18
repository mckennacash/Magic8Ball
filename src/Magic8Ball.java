import jdk.nashorn.internal.ir.IfNode;

import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[]args){

    Scanner keyboard;
    int testing;
    String question;

    keyboard = new Scanner(System.in);

        System.out.println("Ask the Magic 8 Ball Question?");
        keyboard.nextLine();
        System.out.println("Ask your question below");
       question = keyboard.nextLine();
       System.out.println("Now please input a number from 1 to 100");
       testing = keyboard.nextInt();
        if (testing<=10) {
            System.out.println("That's the tea sis");
        }

        else if (testing<=20){
            System.out.println("Sources point to no sishster");
        }
        else if (testing<=30){
            System.out.println("Snatch her wig");
        }



    }
}
