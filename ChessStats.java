public class ChessStats{

   //to be objectified for each piece
   public static String piece = "";
   public static int upgd=0;//to be added to at start of turn and when a piece is captured
   public static int[][] move;
   public int plc = 0; 
   
   void addUp(){
      upgd++;
   }
   void addUpX(int i){
      upgd += i;
   }
   
}