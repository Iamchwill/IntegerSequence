import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  public ArraySequence(int[] other){
    data = other;
    currentIndex = 0;
  }

  public void reset() {
    currentIndex = 0;
  }

  public int length(){
    return data.length;
  }

  public boolean hasNext(){
    return currentIndex < data.length;
  }

  public int next(){
    if (hasNext()){
      currentIndex++;
      return data[currentIndex - 1];
    }
    throw new NoSuchElementException();
  }
}
