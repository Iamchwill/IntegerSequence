import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  public ArraySequence(int[] other){
    data = new int[other.length];
    for(int i = 0; i < other.length; i++){
      data[i] = other[i];
    }
  }

  public ArraySequence(IntegerSequence otherseq){
    data = new int[otherseq.length()];
    otherseq.reset();
    currentIndex = 0;
    while(otherseq.hasNext()){
      data[currentIndex] = otherseq.next();
      currentIndex++;
    }
    currentIndex = 0;
    otherseq.reset();
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
