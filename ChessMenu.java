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

public class ChessMenu extends javax.swing.JFrame implements ActionListener{
   JFrame frame=new JFrame("UPGRADE YOUR TROOPS!");

   @Override
   public void actionPerformed(ActionEvent ae){
      System.out.println(ae.getActionCommand());
      if(ae.getActionCommand().equals("exit")){
          frame.setVisible(false);
      }
      else if(ae.getActionCommand().equals("rules")){
         //start rules.txt in resources
         ChessRules rules = new ChessRules();
      }
      else if(ae.getActionCommand().equals("kitty")){
         try{
            Process partay = Runtime.getRuntime().exec("cmd /c laserCat.gif");                 
         }catch(IOException e){e.printStackTrace(); System.out.println("process error");}
      }
   }
   
   public ChessMenu(){
      //JFrame frame=new JFrame("UPGRADE YOUR TROOPS!");
      frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//only when u close the main one
      frame.setLocationRelativeTo(null);
      frame.setSize(180,480);
            
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
      
      //button      
      JButton btn=new JButton("IMMA FIRN MUH LAZUR!!!!");//new
      btn.setActionCommand("kitty");
      btn.addActionListener(this);
      frame.add(btn);
      
      frame.setVisible(true);
   }
}