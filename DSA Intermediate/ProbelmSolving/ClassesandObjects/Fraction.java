/*
Class Fraction

Construct a class Fraction which stores a fraction. It should contain the

-Numerator
-Denominator

Assume denominator will never be 0.

The class should support the following functionalities

add(Fraction) -> Returns the sum of two fractions

subtract(Fraction) -> Returns the difference of two fractions

multiply(Fraction) -> Returns the product of two fractions

The fraction returned needs to be in the simplest form. If the fraction is p/q then p and q must be co-prime.

You may define any properties in the class as you see appropriate.

*/
class Fraction {
    int numerator, denominator;		
	// Define constructor here
    Fraction()
    {
        this.numerator = 1;
        this.denominator=1;
    }
    Fraction(int numerator,int denominator)
    {
        this.numerator = numerator;
        this.denominator=denominator;
    }
	Fraction add(Fraction a){
		// Complete the function
        Fraction addf=new Fraction();
        int nhcf=0;        
        addf.denominator=(this.denominator*a.denominator);
        addf.numerator=(this.denominator*a.numerator)+(this.numerator*a.denominator);
        nhcf=this.GCD(addf.numerator,addf.denominator);
        addf.numerator=addf.numerator/nhcf;
        addf.denominator=addf.denominator/nhcf;
        return addf;			
	}		
	Fraction subtract(Fraction a){
		// Complete the function
		Fraction subf=new Fraction();
        int nhcf=0;
        int snumerator=0;
         int abnumerator=0;
        subf.denominator=(this.denominator*a.denominator);
        snumerator=(this.numerator*a.denominator)-(this.denominator*a.numerator);
        abnumerator=Math.abs(snumerator);
        nhcf=this.GCD(abnumerator,subf.denominator);
        subf.numerator=snumerator/nhcf;
        subf.denominator=subf.denominator/nhcf;
        return subf;
	}		
	Fraction multiply(Fraction a){
		// Complete the function
		Fraction addf=new Fraction();
        int nhcf=0;        
        addf.denominator=(this.denominator*a.denominator);
        addf.numerator=a.numerator*this.numerator;
        nhcf=this.GCD(addf.numerator,addf.denominator);
        addf.numerator=addf.numerator/nhcf;
        addf.denominator=addf.denominator/nhcf;
        return addf;
	}
    int GCD(int x, int y)
    {
        // Everything is divisible by 0
        if (x == 0)
            return y;
        if (y == 0)
            return x;  
        // Both the numbers are equal
        if (x == y)
            return x;  
        // x is greater
        if (x > y)
            return GCD(x - y, y);
        return GCD(x, y - x);
    }  
}

/*
    Fraction x = new Fraction(2, 3)  // 2/3
	Fraction y = new Fraction(4, 5) // 4/5
    Fraction z = x.add(y) // 22/15
    Fraction z = x.subtract(y) // -2/15
    Fraction z = x.multiply(y) // 8/15
*/