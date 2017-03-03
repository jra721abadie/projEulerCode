import java.util.*;
// try this algo https://en.wikipedia.org/wiki/Gauss%E2%80%93Legendre_algorithm?scrlybrkr=95161642

    public class pi_calculator
    {
      
    public static void main(String [] args) {
    Scanner scan = new Scanner (System.in);
    int numberOfTerms = 0; {
    numberOfTerms += scan.nextInt();
    double startTime = System.nanoTime();
    double piSum = 0;
  
    if ( numberOfTerms > 0 && numberOfTerms <= 2147483647 ) {
       for( int i = 0; i <= numberOfTerms; i++ ){
            piSum += 4.0 * (Math.pow(-1, i)/(2*i+1));
       }
       double endTime = System.nanoTime();
       double duration = (endTime - startTime)/1000000;
       System.out.print( "Your pi estimate: " + piSum +"\n in: " + duration + "ms" );
    }
    else {
       
     System.out.print("ERROR");
    }
  

    }
    }}