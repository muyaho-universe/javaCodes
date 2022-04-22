package edu.handong.csee.java.lectures.l09;

public class DecisionMaker {

    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
        THURSDAY, FRIDAY, SATURDAY 
    }

    public void trySwitch(Day day, boolean takingJava) {

        switch (day) {
            case MONDAY:
                if(takingJava)
                    System.out.println("Mondays are wonderful as we have Java class.");
                else  
                    System.out.println("Mondays are bad.");
                
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }

    }
    
    public void tryIfThenStatement(int number) {
        if(12%number == 0) {
            System.out.println("Reminder is 0");
        }
        else {
            System.out.println("Reminder is not 0");
        }

    }

    public void computeJavaclassGrade(int totalCcore) {

        int testscore = totalCcore;
        String grade;
 
        if (testscore >= 95) {
            grade = "A+";
        } else if (testscore >= 90) {
            grade = "A0";
        } else if (testscore >= 85) {
            grade = "B+";
        } else if (testscore >= 60) {
            grade = "B0 to D0";
        } else {
            grade = "F";
        }
        System.out.println("Grade = " + grade);

    }

}
