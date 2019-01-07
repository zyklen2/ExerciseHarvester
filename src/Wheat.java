import java.util.Random;
public class Wheat {
     Random rand = new Random();
     int countGrain = 0;
     int posX = 0;
     int posY = 0;

     public Wheat(int inPosX, int inPosY){
         int grainCount = rand.nextInt(500) + 100;
     }

     public int GetPosX(){
          return posX;
     }

     public int GetPosY(){
          return posY;
     }

     public int GetGrainCount(){
          return countGrain;
     }
}
