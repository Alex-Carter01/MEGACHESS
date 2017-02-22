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
import java.io.OutputStream;
import java.util.*;
import java.text.*;

public class ChessIntro extends javax.swing.JFrame implements ActionListener{
   JFrame frame = new JFrame("Start Menu");//MEGACHESS : THE ULTIMATE CHESS MASTERPIECE
   static AudioHandler ca = new AudioHandler();    
   
   @Override
   public void actionPerformed(ActionEvent ae){
      System.out.println(ae.getActionCommand());//this is just for testing
      if(ae.getActionCommand().equals("start")){
         //if they press the button
         //ChessGame chess = new ChessGame();
         ChessMenu menu = new ChessMenu();
         ChessCanvas canvas = new ChessCanvas();
         ChessClock clock = new ChessClock();
         //testing
         System.out.println(clock.getTime());
         
         //need to kill the start menu
         frame.setVisible(false);
      }
         
      else if(ae.getActionCommand().equals("exit")){
          frame.setVisible(false);
          System.exit(1);
      }
      else if(ae.getActionCommand().equals("rules")){
         //start rules.txt in resources
         ChessRules rules = new ChessRules();
         
      }
      else if(ae.getActionCommand().equals("dance")){
         try{
            Process partay = Runtime.getRuntime().exec("cmd /c start chrome.exe danceparty.com");
            ChessAudio ca = new ChessAudio();  
            ca.aHoleAlert();                 
         }catch(IOException e){e.printStackTrace(); System.out.println("process error");}
      }
      else if(ae.getActionCommand().equals("pizza")){
         try{
            Process partay = Runtime.getRuntime().exec("cmd /c start chrome.exe pizzaparty.com");                 
         }catch(IOException e){e.printStackTrace(); System.out.println("process error");}
      }
      else if(ae.getActionCommand().equals("cheese")){
         try{
            Process partay = Runtime.getRuntime().exec("cmd /c start chrome.exe chuckecheese.com");                 
         }catch(IOException e){e.printStackTrace(); System.out.println("process error");}
         //ca.addSong("birthday");
      }
   }
   
   public ChessIntro(){
      //JFrame frame=new JFrame("Start Menu");//MEGACHESS : THE ULTIMATE CHESS MASTERPIECE
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
      MIE.setActionCommand("exit");
      MIE.addActionListener(this);
      MF.add(MIE);
      MB.add(MF); 
      JMenu MF2 = new JMenu("Party");
      JMenuItem MIE2 = new JMenuItem("Dance");
      MIE2.setActionCommand("dance");
      MIE2.addActionListener(this);
      MF2.add(MIE2);
      JMenuItem MIE5 = new JMenuItem("Birthday");
      MIE5.setActionCommand("cheese");
      MIE5.addActionListener(this);
      MF2.add(MIE5);
      JMenuItem MIE4 = new JMenuItem("Pizza");
      MIE4.setActionCommand("pizza");
      MIE4.addActionListener(this);
      MF2.add(MIE4);
      MB.add(MF2); 
      JMenu MF3 = new JMenu("Help");
      JMenuItem MIE3 = new JMenuItem("Rules");
      MIE3.setActionCommand("rules");
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
   
   //lol, when u literally never use this method
   public static boolean gameOver(){
      //checks if the king is alive
      //see if there is a piece on top of 
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
   
   public static void audioStart(){//litterally adding songs to the playlists
      //AudioHandler ca = new AudioHandler();
      ca.addSong("plinky"); 
      ca.addSong("aHole");//cameron organ stuff
   }
   
   public static void calanderHandler(){
      //this seems like a good way to get date
      DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
      Date date = new Date();
      System.out.println(dateFormat.format(date)+"\n");//here is the date yaya  
   }
   
  public static void main(String[] args){//lol only main method in this thing
         System.out.println("HELLO, AND WELCOME TO MEGACHESS");
         System.out.println("For more information go to www.MegaChess.com (jk lol thats not my website) \n");//hope the troll is real
         welcome();
         new ChessIntro();         
         calanderHandler(); //keep this in front of audio since audio will have errors if audio device isnt plugged in   
         audioStart();                     
      }
}
