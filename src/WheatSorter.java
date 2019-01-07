public class WheatSorter implements IWheatSorter {
    @Override
    public int compare(IWheat w1, IWheat w2){
        return w1.compareTo(w2);
    }
}
