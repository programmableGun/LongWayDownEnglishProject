public class Questions {
    private String[][] questions = new String[30][3];
    private int[] answerKey = new int[30];
    private String[][] tempQuestion;
    public Questions(){
        
        answerKey[0]  = 2;questions[0]  = new String[]{"What is rule No.1?","No Snitching","No Crying","Take Revenge"};
        answerKey[1]  = 1;questions[1]  = new String[]{"What is rule No. 2?","No Snitching","Take Revenge","No Crying"};
        answerKey[2]  = 3;questions[2]  = new String[]{"What is rule No. 3?","No Crying","No Snitching","Take Revenge"};
        answerKey[3]  = 2;questions[3]  = new String[]{"Who is the main character?","Buck","Will","Shawn"};
        answerKey[4]  = 2;questions[4]  = new String[]{"Who does Will meet on floor 6 on the elevator?","Buck","Dani","Will's dad"};
        answerKey[5]  = 2;questions[5]  = new String[]{"Who does Will meet on floor 7?","Dani","Buck","Will's dad"};
        answerKey[6]  = 3;questions[6]  = new String[]{"Who does will meet on floor 3","Shawn","Will's Dad","Frick"};
        answerKey[7]  = 3;questions[7]  = new String[]{"Who does Will meet on floor 2","will's uncle","Frick","Shawn"};
        answerKey[8]  = 1;questions[8]  = new String[]{"What does Biscuit mean?","A gun","Mom's best dish","Buttery Bun"};
        answerKey[9]  = 1;questions[9]  = new String[]{"How did Shawn die?","A gun shot","A stab wound","suicide"};
        answerKey[10] = 1;questions[10] = new String[]{"What was in Shawns Middle drawer?","A gun","A knife","A bomb"};
        answerKey[11] = 1;questions[11] = new String[]{"How did Shawn view Buck?","Big Brother","Big Sister","Big Dad"};
        answerKey[12] = 3;questions[12] = new String[]{"Who does Will meet on floor 5?","Dani","Buck","Will's Uncle"};
        answerKey[13] = 2;questions[13] = new String[]{"How many times did Shawn shoot Frick?","3","1","28"};
        answerKey[14] = 1;questions[14] = new String[]{"Who does Will meet on floor 4?","Will's Dad","Buck","Will's Uncle"};
        
        
        tempQuestion = questions;
    }
    
    public String[] getQuestionArr(int index){
        System.out.println("returned question " + (index + 1) + " index("+index+")");
        return tempQuestion[index];
    }
    public String randomizeQuestion(int num){
        String correctIndex = "a";
        tempQuestion = questions;
        int correctInt = 1; // pick a number 1-3 and put into an Int
        String[] temp = new String[]{null,null,null,null}; // make a new array
        temp[correctInt] = tempQuestion[num][1]; //insert correct answer into the set Int
        for (int i = 0; i < tempQuestion[num].length;i++){
            temp[i] = tempQuestion[num][i];
        }
        //System.out.println("\n\t"+temp[1] + " printed temp[1]");
    
 /*       for (int i = temp.length - 1; i > 1; i--)
        {
            int index = (int)(Math.random() * i) + 1;
            // Simple swap
            String a = temp[index];
            if(a.equals(questions[num][1])){
                temp[index] = temp[i];
                temp[i] = a;
                correctInt = index;
            }
            else
            {
                if(!temp[index].equals(questions[num][1]))
                {
                    temp[index] = temp[i];
                    temp[i] = a;
                }
            }
        }*/
        
/*        for(int i = temp.length - 1; i > 1; i--){
            
            System.out.println("\t looking for "+ questions[num][1]);
            if(temp[i].equals(questions[num][1])){
                System.out.println("FOUND " + temp[i] + " AT INDEX " + i);
                if(i == 3){correctIndex = "c";}
                if(i == 2){correctIndex = "b";}
                if(i == 1){correctIndex = "a";}
                System.out.println("Setting correctIndex to " + correctIndex);
            }
        }*/
        
        //tempQuestion[num] = temp;
        if(answerKey[num] == 3){correctIndex = "c";}
        if(answerKey[num] == 2){correctIndex = "b";}
        if(answerKey[num] == 1){correctIndex = "a";}
        return correctIndex;
    }
    public void setQuestion(int num,String q,String a1,String a2, String a3){
        for (int i = 0; i < 4; i++){
            
        }
    }
}
