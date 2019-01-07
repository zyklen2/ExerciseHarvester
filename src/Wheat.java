import java.util.Random;
public class Wheat implements IWheat{
     Random rand = new Random();
     int countGrain = 0;

     public Wheat(){
         int grainCount = rand.nextInt(500) + 100;
     }

     public int getGrainCount(){
          return countGrain;
     }

    @Override
    public int compareTo(IWheat otherWheat){
         return otherWheat.getGrainCount() - this.getGrainCount();
    }
}
