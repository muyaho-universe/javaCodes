package edu.handong.csee.java.lab05;

public class MultiDimArrayDemonstrator {
    

    public static void main(String[] args) {
        String[][] names={
            {"Mr. ", "Ms. "},
            {"Mark Zuckerberg", "Barack Obama", "Bergoglio Sivori", "Angela Merke", "Donald Trump", "Greta Thunberg", "Joseph Biden", "Kamala Harris"},
            {"1984-05-14", "1961-08-04", "1936-12-17", "1954-07-17", "1946-06-14", "2003-01-03", "1942-11-20", "1964-10-20"}
        };
        
        int length = names[1].length;

        MultiDimArrayDemonstrator mdDemo = new MultiDimArrayDemonstrator();
        mdDemo.run(length, names);
    }

    public void run(int length, String[][] names){
        
        for(int i = 0; i< length; i ++){
            if ((names[1][i]== "Angela Merkel") || (names[1][i]== "Greta Thunber") || (names[1][i]== "Kamala Harris")) {
                System.out.println(names[0][1] + names[1][i]+" "+names[2][i]);
            }
            else{
                System.out.println(names[0][0] + names[1][i]+ names[2][i]);
            }
        }
    }
}
