//This is simple Chat bot made using java
//this contibution is from Github User @ashutosh7i for HacktoberFest 2022

//To use this bot, simply run it in any java compiler and it will work out of the box.
//:) thanks!

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Scanner

    public static void main(String[] args) {
        greet("Jarvis", "2022"); // Bot name and year
        remindName();
        guessAge();
        count();
        test();
        //end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        // write your code here
        System.out.println("What Exactly Aashutosh Soni is?");
        System.out.println("1. A Student");
        System.out.println("2. A Youtuber");
        System.out.println("3. A Developer");
        System.out.println("4. All of the Above [chad]");
        int Answer = 0;


        int input = scanner.nextInt();
            

        switch(input) {
  case 4:
    System.out.print("Please, try again.");
    break;
  case 2:
    System.out.print("Please, try again.");
    break;
  case 3:
    System.out.print("Please, try again.");
    break;
  case 1:
    end();
    break;
                
  default:
    // code block
}
            

         }
    static void end() {
        System.out.print("Congratulations, have a nice day!"); // end
    }
}
