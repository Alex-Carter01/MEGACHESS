import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class ChessList{
   ArrayList<String> list = new ArrayList<String>();
   
   public void addSong(String str){
      list.add(str);
   }
   
   public ArrayList<String> getList(){
      return list;
   }
}