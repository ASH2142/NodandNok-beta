package ru.hg.nodandnok;


import android.support.v4.app.Fragment;

public class Matem extends Fragment{

    public static int gcd(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}
