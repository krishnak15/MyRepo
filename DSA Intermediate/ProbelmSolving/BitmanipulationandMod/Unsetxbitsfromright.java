/*
Unset x bits from right

Given an integer A. Unset B bits from the right of A in binary.
For eg:-
A = 93, B = 4
A in binary = 1011101
A should become = 1010000 = 80. Therefore return 80.

*/

public class Solution {
    public Long solve(Long A, int B) {
        long num=(A>>B);
             
        return num<<B;

    }
}
