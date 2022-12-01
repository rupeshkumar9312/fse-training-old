package com.app.exam;

import java.util.Scanner;

public class Exam {


    public static void main(String[] args) {

        Question [] questions = new Question[]{
                new Question(1,"question1","opt1","opt2","opt3","opt4",2),
                new Question(2,"question2","opt1","opt2","opt3","opt4",4),
                new Question(3,"question3","opt1","opt2","opt3","opt4",4),
                new Question(4,"question4","opt1","opt2","opt3","opt4",3),
                new Question(5,"question5","opt1","opt2","opt3","opt4",2),
                new Question(6,"question6","opt1","opt2","opt3","opt4",3),
                new Question(7,"question7","opt1","opt2","opt3","opt4",4),
                new Question(8,"question8","opt1","opt2","opt3","opt4",3),
                new Question(9,"question9","opt1","opt2","opt3","opt4",2),
                new Question(10,"question10","opt1","opt2","opt3","opt4",1),

        };


        System.out.println("Welcome to Exam....");
        System.out.println("Are you ready (Y-Proceed,N-Stop)");
        @SuppressWarnings("resource")
        Scanner scaninput = new Scanner(System.in);
        String readyDecision = scaninput.next();
        if (readyDecision.equalsIgnoreCase("N")) {
            System.out.println("User not ready for test - Program Terminates");
            return;
        }
        for (Question question : questions) {
            System.out.println(question.toString());
            int userAnswer = scaninput.nextInt();
            if (userAnswer != question.getCorrect()) {
                System.out.println("Your answer is not correct. Do you want to try again? (Y-Yes,N-No)");
                String repeatQuestionCheck = scaninput.next();
                if (repeatQuestionCheck.equalsIgnoreCase("Y")) {
                    int user2ndAnswer = scaninput.nextInt();
                    if (user2ndAnswer != question.getCorrect()) {
                        System.out.println("Your answer is not correct again");
                        System.out.println("*******Next Question******");
                    } else {
                        System.out.println("*******Next Question******");
                    }
                } else {
                    System.out.println("*******Next Question******");
                }
            } else {
                System.out.println("*******Next Question******");
            }
        }

    }
}
