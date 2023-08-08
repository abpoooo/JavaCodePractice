package _02_leetcodes;
//https://leetcode.com/problems/number-of-1-bits/
public class NumberOf1Bits {
    // you need to treat n as an unsigned value
    // input is binary and totally should be 32 bytes, and n&1 is bitwise AND when it equals 1 counter +1, then next
    // is n>>1 which is divide by 2
    public int hammingWeight(int n) {
        int counter = 0;
        for (int i = 0; i < 32; i++) {
            if ((n&1) == 1) counter++;
            n>>=1;
        }
        return counter;
    }
}
