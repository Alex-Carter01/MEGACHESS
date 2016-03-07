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
   @Override
   public void actionPerformed(ActionEvent ae){
      System.out.println(ae.getActionCommand());
   }
   
   public ChessGame(){
      JFrame frame=new JFrame("MEGACHESS : THE ULTIMATE CHESS MASTERPIECE");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setSize(480,480);
      
      //drop-down
      JMenuBar MB = new JMenuBar();
      JMenu MF = new JMenu("File");
      JMenuItem MIE = new JMenuItem("Exit");
      MF.add(MIE);
      MB.add(MF);
      JMenu MF3 = new JMenu("Help");
      JMenuItem MIE3 = new JMenuItem("Rules");
      MF3.add(MIE3);
      MB.add(MF3);
      frame.setJMenuBar(MB);
      
      frame.setVisible(true);
   }
   
   /*
   public static void main(String[] arrs){
      new ChessGame();
      
   }*/
}
