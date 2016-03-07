import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class ChessRules extends javax.swing.JFrame{  
   public ChessRules(){
      try{
	//probably unessisary
         File rules=new File("Rules.txt");
	
	//should be seperate
	Runtime rt = Runtime.getRuntime();
	Process pr = rt.exec({"start", "rules.txt"});
	
	/*
         JFrame frame=new JFrame("MEGACHESS: RULES");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//only when u close the main one
         frame.setLocationRelativeTo(null);//want to be in the top left ?
         frame.setSize(360,360);

	
	//text
	JLabel label = new JLabel("WHAT IS MEGACHESS?:
A new game based off chess, but more customizable, so that i can learn more about java swing. What i mean by customizable is that each pawn is normal, and your king is normal as well, but all your other pieces are able to be upgraded using points that you earn each turn, ie at the beginning of turn 2 you get 1 upgrade point (UP) which you can use to change the way a piece you control moves.
points can also be gained by capturing an opponent's piece (1 for pawns and 3 for troops) [this is inspired by traditional piece values, but troops are worth less (might have to drop to 2:1) so that games are not excessively snowball-y

moves can be added to by 1, directionally changed, or their capture conditions altered (like how pawns have a different move and capture condition)

pawns cannot move 2 their first move (slows pace of play to allow for continued development of your ‘troops’ [troops are any piece other than a king or pawn])

HOW TO PLAY MEGACHESS:
ill add this later");
      	frame.getContentPane().add(label);

	will try to open rules as a file
	
         
         frame.setVisible(true);
	*/

      }catch(IOException e){e.printStackTrace(); System.out.println("file error");}//pls dont mess up
   }
}

