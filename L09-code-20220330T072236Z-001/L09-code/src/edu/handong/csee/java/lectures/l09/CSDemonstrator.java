package edu.handong.csee.java.lectures.l09;

public class CSDemonstrator {

    public String name; // non-static field, instalce variable

    public static void main(String[] arguments) {
        CSDemonstrator jcDmonstrator = new CSDemonstrator();
        jcDmonstrator.run(arguments);


    }

    public void run(String[] arguments) {
        DecisionMaker myDMaker = new DecisionMaker();
        myDMaker.tryIfThenStatement(1);
        myDMaker.tryIfThenStatement(2);
        myDMaker.tryIfThenStatement(5);
        myDMaker.computeJavaclassGrade(95);
        myDMaker.computeJavaclassGrade(70);

        myDMaker.trySwitch(DecisionMaker.Day.MONDAY, true);
        myDMaker.trySwitch(DecisionMaker.Day.MONDAY, false);

    }

}