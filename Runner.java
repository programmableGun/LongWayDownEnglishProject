//Benjamin Santos English II CRHS 05/14/22
import java.util.Scanner;
public class Runner
{
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();
        Scanner keyboard = new Scanner(System.in);
        Game g = new Game();
        System.out.print("\n\n"+g.getElevator());
        //g.fillQuestion(14);
        while((System.currentTimeMillis()-startTime)/1000 < 3){}
            System. out. println("Press enter to continue");
            try{System.in.read();}
            catch(Exception e){}
            
        while(true){
            g.getQuestion((int)(Math.random()*15)+1);
            //g.getQuestion(1);
            startTime = System.currentTimeMillis();
            while((System.currentTimeMillis()-startTime)/1000 < 1){}
            System.out.print("\n\n\tPress Enter to Continue");
            try{System.in.read();}
            catch(Exception e){}
        }
           
            
        
        //for (int i = 0; i < 3; i++){g.fillQuestion(i);}
        
    }
}
/*
High Scores
 Jake - 64840
 Ben - 60230
 Michael - 60154
 Joy - 59160
 Jenna - 55326
 Noah - 48166
*/
