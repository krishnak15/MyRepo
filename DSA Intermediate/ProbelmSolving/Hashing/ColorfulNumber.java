/*

 Colorful Number

 Given a number A, find if it is COLORFUL number or not.

If number A is a COLORFUL number return 1 else, return 0.

What is a COLORFUL Number:

A number can be broken into different contiguous sub-subsequence parts. 
Suppose, a number 3245 can be broken into parts like 3 2 4 5 32 24 45 324 245. 
And this number is a COLORFUL number, since product of every digit of a contiguous subsequence is different.

*/

public class Solution {
    public int colorful(int A) {
       HashSet<Integer> hashSet = new HashSet<>();
    ArrayList<Integer> numbers = new ArrayList<>();

    while (A != 0) {
        int num = A % 10;
        numbers.add(num);
        A /= 10;
    }

    Collections.reverse(numbers);
    int n = numbers.size();

 for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            int prod = 1;
            for (int k = i; k <= j; k++) {
                prod = prod * numbers.get(k);
            }
            if (hashSet.contains(prod))
                return 0;
            hashSet.add(prod);
        }
    }

    return 1;

    }
}
