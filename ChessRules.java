import java.io.IOException;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.OutputStream;

public class ChessRules{  
   public ChessRules(){        
      try{
         Process rules = Runtime.getRuntime().exec("notepad resources/rules.txt");                 
      }catch(IOException e){e.printStackTrace(); System.out.println("process error");}
   }
}

