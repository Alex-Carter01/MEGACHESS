import javax.swing.*;
import java.io.FileWriter;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;

public class ChessIntro extends javax.swing.JFrame implements ActionListener{

   
   
   @Override
   public void actionPerformed(ActionEvent ae){
      System.out.println(ae.getActionCommand());
      if(ae.getActionCommand().equals("start")){
         //if they press the button
         ChessGame chess = new ChessGame();
         ChessMenu menu = new ChessMenu();
         //need to kill the start menu
      }
      else if(ae.getActionCommand().equals("rules")){
         //start rules.txt in resources
         ChessRules rules = new ChessRules();
      }
   }
   
   public ChessIntro(){
      JFrame frame=new JFrame("Start Menu");//MEGACHESS : THE ULTIMATE CHESS MASTERPIECE
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setSize(320,160);
      
      //label
      JLabel label = new JLabel("testing...");
      frame.getContentPane().add(label);
      
      //drop-down
      JMenuBar MB = new JMenuBar();
      JMenu MF = new JMenu("File");
      JMenuItem MIE = new JMenuItem("Exit");
      MF.add(MIE);
      MB.add(MF);
      JMenu MF2 = new JMenu("Party");
      JMenuItem MIE2 = new JMenuItem("Dance");
      MF2.add(MIE2);
      MB.add(MF2); 
      JMenu MF3 = new JMenu("Help");
      JMenuItem MIE3 = new JMenuItem("Rules");
      //MIE3.addActionListener(new MenuAction(/*help here pls*/));
      MIE3.setActionCommand("Rules");
      MIE3.addActionListener(this);
      MF3.add(MIE3);
      MB.add(MF3);
      frame.setJMenuBar(MB);
            
      //button
      JButton btn=new JButton("Press to Start!");//new
      btn.setActionCommand("start");
      btn.addActionListener(this);
      frame.add(btn);
      
      //last
      frame.setVisible(true);
   }
   
   public static boolean gameOver(){
      //checks if the king is alive
      return false;
   }
   
   public static void welcome(){
      System.out.println(" __  __ ______ _____          _____ _    _ ______  _____ _____ ");
      System.out.println("|  \\/  |  ____/ ____|   /\\   / ____| |  | |  ____|/ ____/ ____|");
      System.out.println("| \\  / | |__ | |  __   /  \\ | |    | |__| | |__  | (___| (___  ");
      System.out.println("| |\\/| |  __|| | |_ | / /\\ \\| |    |  __  |  __|  \\___ \\\\___ \\ ");
      System.out.println("| |  | | |___| |__| |/ ____ \\ |____| |  | | |____ ____) |___) |");
      System.out.println("|_|  |_|______\\_____/_/    \\_\\_____|_|  |_|______|_____/_____/  \n ");
   }
   
   //CURRENTLY OUT OF ORDER
   public static void pF(File file){
      //currently prints all on 1 line, not functional
      try{
         Scanner sc=new Scanner(file);
         JFrame fr = new JFrame("test of the emergency broadcasting system");
         fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         fr.setLocationRelativeTo(null);
         fr.setSize(520,480);
         //JLabel label = new JLabel("welcome to chess");  
	     
   
         while(sc.hasNext()){
            String str=sc.nextLine();
            System.out.println(str); //this should make a new window
            JLabel lab = new JLabel(str);
            fr.getContentPane().add(lab);
            //fr.setVisible(true);
         }
         fr.setVisible(true);
      }catch(IOException e){e.printStackTrace(); System.out.println("file error with printing");}
   }

  
   public static void main(String[] arrs){
      try{
         System.out.println("HELLO, AND WELCOME TO MEGA CHESS \n");
         welcome();
         File tit = new File("Title.txt");
         Scanner fileScan = new Scanner(tit);
         //pF(fil);
         
         Scanner scan = new Scanner(System.in);
         //ChessGame chess = new ChessGame();   
         new ChessIntro();
      }catch(IOException e){e.printStackTrace(); System.out.println("file error with printing");}
   }
}
