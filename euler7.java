import java.util.*;

public class FindPrimesHashMap {
    public static void getPrime(int x) {
        int n = (x * ((int)Math.sqrt(x) / 10)) + x;
        int nSqrt = (int)Math.floor(Math.sqrt(n));
        int j = 0;
        int k = 0;
        Map<Integer, Boolean> primeMap = new HashMap<Integer, Boolean>();
        Set<Map.Entry<Integer, Boolean>> primes = primeMap.entrySet();
        ArrayList<Integer> primeArray = new ArrayList<Integer>();

        for (int a = 2; a < n; a++) {
            primeMap.put(a, true);
        }

        for (int i = 2; i <= nSqrt; i++) {
            if (primeMap.get(i)) {
                while (true) {
                    j = (i * i) + (k * i);
                    k++;

                    if (j > n) {
                        break;
                    }
                    primeMap.put(j, false);
                }
                j = 0;
                k = 0;
             }
        } 

        for (Map.Entry<Integer, Boolean> entry : primes) {
            if (entry.getValue()) {
                primeArray.add(entry.getKey());
            }
        }
        Collections.sort(primeArray);
        System.out.println(primeArray.get(x - 1));
    }}