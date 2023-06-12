/*
Reverse Bits

Reverse the bits of an 32 bit unsigned integer A.

*/

public class Solution {
	public long reverse(long a) {
		long rev = 0;
    for (int i = 0; i < 32; i++, a >>= 1)
        rev = (rev << 1) | (a & 1);
    return rev;
        
	}

}
