import java.util.Scanner;
public class Game {
    private int score;
    private Scanner keyboard = new Scanner(System.in);
    private String input = "";
    private String rules = "\t\tRules\n1. Your goal is to reach floor 1 as fast as possible\n2. Type A B or C then enter to answer the questions\n3. The faster you answer the questions the more points you get.\n\t\t Good luck!";
    private Questions q;
    private int attempt = 1;
    private int level = 7;
    private String[][] gameBoard = {
        {"O","1"},
        {"O","2"},
        {"O","3"},
        {"O","4"},
        {"O","5"},
        {"O","6"},
        {"O","7"}
        
    };
    
    public Game(){
        System.out.println(rules);
        score = 0;
        q = new Questions();
        setElevator(7);
    }
    
    public String getElevator(){
        String temp = "";
        temp += "Elevator\n|=======|\n";
        for (int i = gameBoard.length-1; i >= 0; i--)
        {
            temp += gameBoard[i][0] + "\t" + gameBoard[i][1] + "\n";
        }
        temp += "|=======|";
        temp += "\nGoing Down: Floor "+ level +"\n";
        return temp;
    }
    public void setElevator(int floor){
        level = floor;
        floor--;
        for (int i = 0; i < gameBoard.length; i++){
            if(floor == i){gameBoard[i][0] = "X";gameBoard[i][1] = (i+1)+"";}
            else {
                gameBoard[i][0] = "O";gameBoard[i][1] = (i+1)+"";
            }
        }
    }
    public void getQuestion(int num){
        num--;if(num > 30){System.out.println("breaking function getQuestion Game.java");return;}
        long startTime = System.currentTimeMillis();
        String correctIndex;
        int addtoScore=0;
        correctIndex = q.randomizeQuestion(num);
        String[] temp = q.getQuestionArr(num);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\tQuestion "+attempt+"\n"+temp[0]);
        System.out.println("A. "+temp[1]);
        System.out.println("B. "+temp[2]);
        System.out.println("C. "+temp[3]);
        input = keyboard.next().toLowerCase();
        
        if (input.equals(correctIndex.toString())){
            System.out.println("\nScore!\n");
            if(10000/((System.currentTimeMillis()-startTime)+1)*500 > 1000){addtoScore = 4990;System.out.print("\tLIGHTNING SPEED BONUS!!!\n");}
            else{addtoScore = (int)(10000/((System.currentTimeMillis()-startTime))*510);}
            System.out.print("+"+addtoScore+"\n");
            score += addtoScore;
            System.out.println("Total Score: " + score );
            checkScore();
        }
        else{
            System.out.println("Incorrect: it was " + correctIndex);
        }
        attempt++;
    }
    public void checkScore(){
        if(score >= 42000 && level == 2){setElevator(1);win();}
        else if(score >= 35000&& level == 3){setElevator(2);System.out.println(getElevator());}
        else if(score >= 27000&& level == 4){setElevator(3);System.out.println(getElevator());}
        else if(score >= 21000&& level == 5){setElevator(4);System.out.println(getElevator());}
        else if(score >= 15000&& level == 6){setElevator(5);System.out.println(getElevator());}
        else if(score >= 6000 && level == 7){setElevator(6);System.out.println(getElevator());}
        
        
    }
    public void fillQuestion(int index){
       String[] tez = new String[]{"","","","",""};
       for (int i = 0; i < tez.length;i++){
           System.out.println("INPUT INFO FOR INDEX" + i);
            tez[i] = keyboard.nextLine();
        }
        
        System.out.println("answerKey["+index+"] = "+tez[4]+";questions["+index+"] = new String[]{\""+tez[0]+"\","+"\""+tez[1]+"\","+"\""+tez[2]+"\","+"\""+tez[3]+"\"};");
 //answerKey[0]=2;questions[0] = new String[]{"Question","Right","wrong1","wrong2"}
    }
    public void win(){
        System.out.println(getElevator());
        long startTime = System.currentTimeMillis();
        while((System.currentTimeMillis()-startTime)/1000 < 5){}
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("The elevator rings");
        startTime = System.currentTimeMillis();
         while((System.currentTimeMillis()-startTime)/1000 < 3){}
        System.out.println("Shawn gets out of the elevator and says,");
        System.out.println("\t \"You coming?\"");
        startTime = System.currentTimeMillis();
        while((System.currentTimeMillis()-startTime)/1000 < 5){}
         System.out.print("\033[H\033[2J");
         System.out.flush();
        System.out.println("Your Final Score");
        for(int i = 50; i > 0;i--){
            System.out.println(Math.random()*1000000000);
            startTime = System.currentTimeMillis();
        while((System.currentTimeMillis()-startTime)/50 < 1){}
        
        System.out.print("\033[H\033[2J");
         System.out.flush();
         System.out.println("Your Final Score");
        }
        System.out.println((int)(score) + " + " + "Bonus:"+(int)(420690/attempt) + " = ");
        System.out.println((int)(score + (420690/attempt)));
        System.out.println("YOU WIN");
        System.exit(0);
    }
}
