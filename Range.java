import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;

  public Range(int first, int last){
    start = first;
    end = last;
    current = first;
  }

  public void reset() {
    current = start;
  }
}
