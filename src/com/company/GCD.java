package com.company;

public class GCD {
    public static int findGCD(int n1, int n2) throws Exception {
        int gcd = 1;
        if (n1 < 1 || n1 > 100 || n2 < 1 || n2 > 100)
            throw new Exception("input out of range");
        for (int i = 1; i <= n1 && i <= n2; ++i) {
            // Checks if i is factor of both integers
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }
        return gcd;
    }
}
