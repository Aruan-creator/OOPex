package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TestMaker MyTest = new TestMaker();
        MyTest.startMake();
        MyTest.startCheck();
    }
}

class TestMaker{
    Tester NewTest = new Tester();

    public TestMaker(){}

    public void startMake(){
        NewTest.inputQuantityVarts();
        NewTest.MakeQuest();
        NewTest.inputCorrectAns();
        NewTest.setCorrectAnswer(NewTest.getCorrectAnswer());
        System.out.println(NewTest.ShowQuest());
    }

    public void startCheck(){
        AnswerChecker checkFirstTest = new AnswerChecker();
        checkFirstTest.inputAnswer();
        checkFirstTest.checkQuest(checkFirstTest.getUsersAnswer(), NewTest.getCorrectAnswer());
    }

}

class Tester{
    //private int quantityQuest;
    //private int sizeVar;
    private int quantityVarts;
    private int correctAnswer;
    private Map<Integer,String> readyQuest = new HashMap<Integer, String>();

    public Tester(){}

    public Map<Integer, String> getMakeQuest(){
        return this.readyQuest;
    }

    public void setReadyQuest(Map<Integer, String> readyQuest) {
        this.readyQuest = readyQuest;
    }

    public void setQuantityVarts(int quantityVarts){
        this.quantityVarts = quantityVarts;
    }

    public Map<Integer, String> getReadyQuest() {
        return readyQuest;
    }

    public int getQuantityVarts() {
        return quantityVarts;
    }

    public void inputQuantityVarts(){
        System.out.println("How many options will the question have?");
        Scanner scanCount = new Scanner(System.in);    //Scanner for number of options
        int size = scanCount.nextInt();
        setQuantityVarts(size);
    }

    public void MakeQuest(){
        Map<Integer, String> quest = new HashMap<Integer, String>();
        Scanner addVar = new Scanner(System.in);       //Scanner for add option
        String tmpVarFQuest;                           //Variable for question
        int varCounter = 0;
        for (int a = 0; a < getQuantityVarts(); a++) {              //Add variant by variant by increasing the array index
            varCounter++;                             //Incrementing the displayed counter since the array starts at 0
            System.out.println("Enter option " + varCounter);
            tmpVarFQuest = addVar.nextLine();
            quest.put(varCounter,tmpVarFQuest);
        }
        setReadyQuest(quest);
    }

    String ShowQuest(){
        for(Map.Entry<Integer, String> item : getReadyQuest().entrySet()){
            System.out.printf("%d. %s \n", item.getKey(), item.getValue());
        }
        return "Your quest id ready!";
    }

    public void inputCorrectAns(){
        System.out.println("Install the correct option");
        Scanner scanCorrectAnswer = new Scanner(System.in);
        int correct = scanCorrectAnswer.nextInt();
        setCorrectAnswer(correct);
    }

    public void setCorrectAnswer(int correctAnswer){
        this.correctAnswer = correctAnswer;
    }

    public int getCorrectAnswer(){
        return correctAnswer;
    }

}


class AnswerChecker{
    private int usersAnswer;

    public void setUsersAnswer(int usersAnswer) {
        this.usersAnswer = usersAnswer;
    }

    public int getUsersAnswer() {
        return usersAnswer;
    }

    public void inputAnswer(){
        System.out.println("\"Guess\" the correct answer");
        Scanner inputUsersAnswer = new Scanner(System.in);
        int answer = inputUsersAnswer.nextInt();
        setUsersAnswer(answer);
    }

    public void checkQuest(int usersAnswer, int correctAnswer){
        if (usersAnswer == correctAnswer){
            System.out.println("True!");
        }
        else {
            System.out.println("False!");
        }
    }
}

