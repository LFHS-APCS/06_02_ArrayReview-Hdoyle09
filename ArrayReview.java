public class ArrayReview
{

    /**
     * Write a method that will return a String with the name 
     * of each employee from a given array (separated by a space) 
     * who has been with the company for over 20 years.   
     * Assume there are no null employees in the array.
     * IMPORTANT:  Use a regular for loop. 
     */
    public static String getNames(Employee[] data)
    {
    String str = "";
    for (int i=0;i<data.length;i++)
      {
        if(data[i].getYears() > 20)
          str = str + data[i].getName() + " ";
      }
      if (str.length()>0)
        str = str.substring(0, str.length()-1);
        return str;
    }

    /**
     * Suppose that nums is an array of doubles.  
     * Write a method that will find the average of 
     * only the positive numbers in the array.   
     * IMPORTANT:  Use an enhanced for loop.
     */
    public static double average(double[] nums)
    {
      int count=0;
      double sum=0.0; 
      for (double v : nums)
      {
          if (v > 0)
          {
            count++;
            sum += v;
          }   
      }
      if (count > 0)
        return sum/count;
      else return 0.0;
    }
}

