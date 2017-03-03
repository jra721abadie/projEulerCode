import java.math.*;

class googleChal{
     public static void main (String[] String){
     double lim = 100;
     double sum1 = 0;
     int zhsum = 0;
     double sum2 = 0;
     int sol;
     
     for (int i = 1; i<= lim; i++){
          double cuntbag = Math.pow(i,2);
          sum1 = sum1+cuntbag;
     }
     for (int x = 1; x<= lim; x++){
      zhsum = (zhsum+x);
     }
     sum2 = Math.pow(zhsum,2);
     
     sol = (int)(sum2-sum1);
     System.out.print(sol);}}
     