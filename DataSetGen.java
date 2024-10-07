/**
   Finds the average of a set of data values.
   @author Yohannes Belai
*/
public class DataSetGen<T extends Measurable>{
   private double sum;
   private int count;
   private T maximum;

   /**
      An empty data set is constructed.
   */
   public DataSetGen(){
      sum = 0;
      count = 0;
      maximum = null;
   }

   /**
      A data value is added to the data set.
      @param x a data value
   */
   public void add(T x){
      sum = sum + x.getMeasure();
      if (count == 0 || maximum.getMeasure() < x.getMeasure())
         maximum = x;
      count++;
   }

   /**
      Computes the average of the added data.
      @return the average or 0 if no data has been added
   */
   public double getAverage() {
      if (count == 0) return 0;
      else return sum / count;}

   /**
      Computes the largest of the added data.
      @return the maximum or null if no data has been added
   */
   public T getMaximum(){
      return maximum;
   }
}
