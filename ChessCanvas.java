import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.*;

public class ChessCanvas extends JFrame{
public static final int WIDTH = 650;
public static final int HEIGHT = 670;
public static final int SQUARE = 76;
public static final int SIDE = 21;
public static final int TOP = 18;
public static final int PBUF =   8;

//default starting positions
//public static final int  = ;

public boolean reset = true;


   
//DEFAULT CANVAS REDRAW  
   public ChessCanvas(){
      SwingUtilities.invokeLater(new Runnable() {
      public void run() {
         setLocationRelativeTo(null);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setResizable(false);
         setSize(WIDTH,HEIGHT);
         setVisible(true); 
         MyCanvas can = new MyCanvas();   
         setLayout(new BorderLayout());
         setTitle("MEGACHESS : THE ULTIMATE CHESS MASTERPIECE");
         add(can, BorderLayout.CENTER);
         //setVisible(true);
      }
      });
   }
   
   public class MyCanvas extends Canvas{
   File xbor, bki, bpi, bto, wki, wpi;
   BufferedImage board, bk, bp, bt, wk, wp;
   volatile int threadcount = 0;
   public MyCanvas(){
   try{
      //board
      xbor = new File("Resources/Images/ChessBoardBrown.jpg");      
         FileInputStream fis = new FileInputStream(xbor);  
       board = ImageIO.read(fis);
      //black king
       bki = new File("Resources/Images/B_King.png");         
       bk = ImageIO.read(bki);
      //black pawn
       bpi = new File("Resources/Images/B_Pawn.png");//made sure right pixel count        
       bp = ImageIO.read(bpi);
      //black troop
      //testing
       bto = new File("Resources/Images/B_Troop.png");         
       bt = ImageIO.read(bto);
      //White king
       wki = new File("Resources/Images/W_King.png");         
       wk = ImageIO.read(wki);
      //white pawn
       wpi = new File("Resources/Images/W_Pawn.png");         
       wp = ImageIO.read(wpi);
   
   }catch(IOException e){e.printStackTrace(); System.out.println("process error");}
   }
      @Override
      public void paint(Graphics g){
            //loading screen
            if(board == null ||
               bk == null ||
               bp == null ||
               bt == null ||
               wk == null ||
               wp == null) {
               final MyCanvas mc = this;
               if(threadcount < 20) {
                  SwingUtilities.invokeLater(new Runnable() {
                     @Override
                     public void run() {
                        (new Thread(new Runnable() {
                           public void run() {
                              try {
                                 Thread.sleep(200);
                                 mc.repaint();
                                 threadcount++;
                              } catch(InterruptedException ie) {
                                 //do nothing
                              }
                           }
                        })).start();
                     }
                  });
                  g.setColor(Color.GREEN);
                  g.fillRect(0, 0, 100, 100);
                  g.setColor(Color.WHITE);
                  g.drawString("Loading...", 30, 30);
               } else {
                  g.setColor(Color.RED);
                  g.fillRect(0, 0, 100, 100);
                  g.setColor(Color.WHITE);
                  g.drawString("helo ur cansur has hapnd", 50, 30);
               }
               return;
            }//end load screen
            
                        
            //images
            //board
            g.drawImage(board, 00, 00, null);
            
            //BASE CONDITION --- RESET THE BOARD ***
            if(reset = true){
            //B King
            g.drawImage(bk, 249, 550, null);
            //B Pawns
            g.drawImage(bp, SIDE+PBUF, 474, null);//1
            g.drawImage(bp, SIDE+SQUARE+PBUF, 474, null);//2
            g.drawImage(bp, 173+8, 474, null);//3      //side+2*square+pbuf
            g.drawImage(bp, 249+8, 474, null);//4
            g.drawImage(bp, 325+8, 474, null);//5
            g.drawImage(bp, 401+8, 474, null);//6
            g.drawImage(bp, 477+8, 474, null);//7
            g.drawImage(bp, 553+8, 474, null);//8
            //B Troop
            g.drawImage(bt, 173, 550, null);//testing
            //W King
            g.drawImage(wk, 249, 18, null);
            //W Pawn
            g.drawImage(wp, 21+8, 94, null);//1
            g.drawImage(wp, 97+8, 94, null);//2
            g.drawImage(wp, 173+8, 94, null);//3
            g.drawImage(wp, 249+8, 94, null);//4
            g.drawImage(wp, 325+8, 94, null);//5
            g.drawImage(wp, 401+8, 94, null);//6
            g.drawImage(wp, 477+8, 94, null);//7
            g.drawImage(wp, 553+8, 94, null);//8
            
         }else{//if you dont want to reset the board (normal)
            //*****NORMAL****** use vars to pas to this method
         }                                       
      }
   }
}