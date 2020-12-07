public class Tester{
  public static void main(String args[]){
    IntegerSequence r =  new Range(10,20);
    IntegerSequence x =  new Range(10,30);
    System.out.println(r.length());
    while(x.hasNext()){
     System.out.print(r.next());
     x.next();
      if(r.hasNext())
         System.out.print( ", " );
      else r.reset();
   }
   System.out.println();
  }
}
