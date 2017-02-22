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

public class ChessGame extends javax.swing.JFrame implements ActionListener{
   JFrame frame=new JFrame("MEGACHESS : THE ULTIMATE CHESS MASTERPIECE");
   
   @Override
   public void actionPerformed(ActionEvent ae){
      System.out.println(ae.getActionCommand());
      if(ae.getActionCommand().equals("exit")){
          frame.setVisible(false);
          System.exit(1);
      }
      else if(ae.getActionCommand().equals("rules")){
         //start rules.txt in resources
         ChessRules rules = new ChessRules();
      }
   }
   
   public ChessGame(){
      //JFrame frame=new JFrame("MEGACHESS : THE ULTIMATE CHESS MASTERPIECE");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setSize(780,790);
      frame.setResizable(false);
      
      //drop-down
      JMenuBar MB = new JMenuBar();
      JMenu MF = new JMenu("File");
      JMenuItem MIE = new JMenuItem("Exit");
      MIE.setActionCommand("exit");
      MIE.addActionListener(this);
      MF.add(MIE);
      MB.add(MF);
      JMenu MF3 = new JMenu("Help");
      JMenuItem MIE3 = new JMenuItem("Rules");
      MIE3.setActionCommand("rules");
      MIE3.addActionListener(this);
      MF3.add(MIE3);
      MB.add(MF3);
      frame.setJMenuBar(MB);
      
      //board (image)
      ImageIcon im = new ImageIcon("ChessBoard.PNG");
      JLabel la = new JLabel(im);
      frame.add(la);
      
      //end
      frame.setVisible(true);
   }
   
   /*
   public static void main(String[] arrs){
      new ChessGame();
      
   }*/
}