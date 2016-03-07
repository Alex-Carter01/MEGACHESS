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
   @Override
   public void actionPerformed(ActionEvent ae){
      System.out.println(ae.getActionCommand());
   }
   
   public ChessMenu(){
      JFrame frame=new JFrame("UPGRADE YOUR TROOPS!");
      frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//only when u close the main one
      frame.setLocationRelativeTo(null);
      frame.setSize(180,480);
            
      //drop-down
      JMenuBar MB = new JMenuBar();
      JMenu MF3 = new JMenu("Help");
      JMenuItem MIE3 = new JMenuItem("Rules");
      MF3.add(MIE3);
      MB.add(MF3);
      frame.setJMenuBar(MB);
      
      frame.setVisible(true);
   }
}
