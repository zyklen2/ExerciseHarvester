package Field;

import java.util.Random;

//Wheat, implements IWheat, which extends Comparable (Interfaces/Generalization/Overwriting)
public class Wheat implements IWheat {
     private Random rand = new Random();
     private int countGrain = 0;

     //Initializes new Wheat with random grain count (pseudo-random)
     public Wheat(){
         countGrain = rand.nextInt(500) + 100;
     }

     @Override
     public int getGrainCount(){
          return countGrain;
     }

    @Override
    public int compareTo(IWheat otherWheat){
         return this.getGrainCount() - otherWheat.getGrainCount();
    }

    @Override
    public String toString(){
         return "Grains: " + getGrainCount();
    }
}
