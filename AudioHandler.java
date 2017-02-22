import java.io.*;
import java.io.FileWriter;
import java.awt.Container;
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class AudioHandler{
      int wait = 0;
      ArrayList<String> list = new ArrayList<String>();          
      ChessAudio audio = new ChessAudio();
      ChessList lis = new ChessList();
      //list = lis.getList();
            
           
      public void addSong(String str){
         lis.addSong(str);
         list = lis.getList();
         play();   
      }
      
      public void delay(int time){
         try{
            Thread.sleep(time*1000);//check the wait time
         }catch(InterruptedException ex) {System.out.println("SLEEP erronious"); Thread.currentThread().interrupt();}
      }
      
      public void play(){
         list = lis.getList();   
         //while(!list.equals(null)){
            for(int i=0; i<list.size(); i++){
               String name = list.get(i);
               switch(name){
                  case "plinky": audio.plinky();
                  delay(104);
                  break;
                  
                  case "aHole": audio.aHoleAlert();
                  delay(304);
                  break;
                  
                  /*
                  case "birthday": audio.birthday();
                  delay(12);
                  break;                  
                  */
                  
                  default: System.out.println("error with song name \n do u even english?!?");
                  delay(1); 
               }
               
               if(i == list.size()-1){
                  i = 0;
               }
            }
         //}  
      }  
      
       
}