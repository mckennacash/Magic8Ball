import jdk.nashorn.internal.ir.IfNode;

import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[]args){

        Scanner keyboard;
        int testing;
        String question;
        String userAnswer;
    keyboard = new Scanner(System.in);


        System.out.println("Do you want to ask the Magic 8 Ball a Question?");
        keyboard.nextLine();
        do {
            testing = (int) (Math.random() * 100);

        System.out.println("Now ask your question below");
        question = keyboard.nextLine();
      // System.out.println("Please input a number from 1 to 100");
      // testing = keyboard.nextInt();
        if (testing<=10) {
            System.out.println("That's the good tea sis");
        }
        else if (testing<=20){

            System.out.println("Sources point to no sishster");
        }
       else if (testing<=30){
            System.out.println("Snatch your future cause it's nice");
        }
        else if (testing<=40){

            System.out.println("Honey, you got a big storm coming");
        }
        else if (testing<=50){

            System.out.println("All my sources are pointing to no, so");
        }
        else if (testing<=60){

            System.out.println("You get it queen");
        }
        else if (testing<=70){

            System.out.println("Oof your outcome looks nice");
        }
        else if (testing<=80){

            System.out.println("Your future is quaking right now sis. Ask again later");
        }
        else if (testing<=90){

            System.out.println("Wow, your future actually looks decent. Good for you!");
        }
        else if (testing<=100){

            System.out.println("Your future looks about as dull as the question you asked");
        }


        System.out.println("Want to ask another question?");
        //userAnswer = keyboard.nextLine();
        userAnswer = keyboard.nextLine();
        if (userAnswer.equalsIgnoreCase("no")){break;}

    }while (!userAnswer.equalsIgnoreCase("no"));



}
}
