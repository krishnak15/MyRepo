/*
Class Complex Number

Construct a class called ComplexNumber which stores two properties

real - The real part
imaginary - The imaginary part

The name of the properties should be strictly real and imaginary


Implement the following functionalities inside this class :-

add(ComplexNumber) -> Returns an object of ComplexNumber having sum of the two complex numbers.

subtract(ComplexNumber) -> Returns an object of ComplexNumber having difference of the two complex numbers.

multiply(ComplexNumber) -> Returns an object of ComplexNumber having multiplication of the two complex numbers.

divide(ComplexNumber) -> Returns an object of ComplexNumber having division of the two complex numbers.
*/
class ComplexNumber {
    
    float real, imaginary;
	
    public ComplexNumber()
    {
    }
	// Define constructor here
	public ComplexNumber(float real, float imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }
		
	ComplexNumber add(ComplexNumber x){
		// Complete the function
        ComplexNumber addcn=new ComplexNumber();
        addcn.real=this.real+x.real;
        addcn.imaginary=this.imaginary+x.imaginary;
		return addcn;
	}
	
	ComplexNumber subtract(ComplexNumber x){
		// Complete the function
        ComplexNumber subcn=new ComplexNumber();
        subcn.real=this.real-x.real;
        subcn.imaginary=this.imaginary-x.imaginary;
		return subcn;    
		
	}
		
	ComplexNumber multiply(ComplexNumber x){
		// Complete the function
        ComplexNumber mulcn=new ComplexNumber();
        mulcn.real=(this.real*x.real-this.imaginary*x.imaginary);
        mulcn.imaginary=(this.real*x.imaginary+this.imaginary*x.real);
		return mulcn;   
		
	}
	
	ComplexNumber divide(ComplexNumber x){
		// Complete the function
        ComplexNumber divcn=new ComplexNumber();
        float a=this.real;
        float b=this.imaginary;
        float c=x.real;
        float d=x.imaginary;
        divcn.real=((a*c+b*d)/(c*c+d*d));
        divcn.imaginary=((b*c-a*d)/(c*c+d*d));
		return divcn;
	}
}

/*
    ComplexNumber a = new ComplexNumber(10, 5)
	ComplexNumber b = new ComplexNumber(2, 3)
	ComplexNumber c1 = a.add(b) 
	ComplexNumber c2 = a.subtract(b)
	ComplexNumber c3 = a.multiply(b)
	ComplexNumber c4 = a.divide(b)

*/