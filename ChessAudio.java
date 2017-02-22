import java.lang.Thread;
import javax.sound.sampled.*;
import java.io.*;



public class ChessAudio implements Runnable{
   static String mus;
   //int wait=0;
   
   //AudioHandler audHand = new AudioHandler();
       
   public void plinky(){
      //System.out.println("plinky af");
      mus = "music.wav";
      //wait=104;
      run();
   }   
   public void aHoleAlert(){
      //System.out.println("this guy again");
      mus = "cameron.wav";
      //wait=339;
      run();
   }
   
   /*
   public void birthday(){
      //System.out.println("happy b-day big boy!");
      mus = "birthday.wav";
      run();
   } */  
   
   /*
   public void lifehax(){
      System.out.println("heaiiilll yeah!");
      mus = "lifehax.wav";//currently mp3
      run();
   }*/
   
   public void run() {
		try {         
            File yourFile = new File(mus);
            AudioInputStream stream;
   			AudioFormat format;
   			DataLine.Info info;
   			Clip clip;
            //System.out.println("\n singin, ay mama");
   			stream = AudioSystem.getAudioInputStream(yourFile);
   			format = stream.getFormat();
   			info = new DataLine.Info(Clip.class, format);//erronious
   			clip = (Clip)AudioSystem.getLine(info);
   			clip.open(stream);
            clip.start();
            /*
            try{
               Thread.sleep(wait*1000);//check the wait time
            }catch(InterruptedException ex) {Thread.currentThread().interrupt();}
            */
            //System.out.println("finis the sing, mum");
            
      } catch (Exception e){System.out.println("ERROR WITH AUDIO"); System.out.println("error playing: " + mus); e.printStackTrace();}
   }
}