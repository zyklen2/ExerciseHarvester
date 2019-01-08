package Field;

import java.util.Random;
public class Wheat implements IWheat {
     private Random rand = new Random();
     private int countGrain = 0;

     public Wheat(){
         int grainCount = rand.nextInt(500) + 100;
     }

     public int getGrainCount(){
          return countGrain;
     }

    @Override
    public int compareTo(IWheat otherWheat){
         return this.getGrainCount() - otherWheat.getGrainCount();
    }
}
