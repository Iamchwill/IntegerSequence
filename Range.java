import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;

  public Range(int first, int last){
    if (first > last) throw new IllegalArgumentException();
    start = first;
    end = last;
    current = first;
  }

  public void reset() {
    current = start;
  }

  public int length(){
    return end - start + 1;
  }

  public boolean hasNext(){
    return current <= end;
  }

  public int next(){
    if (hasNext()){
      current++;
      return current - 1;
    }
    throw new NoSuchElementException();
  }
}
