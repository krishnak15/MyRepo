/*
Class Circle

Construct a class Circle that represents a Circle.

The class should support the following functionalities:-
perimeter() -> returns the perimeter of the circle
area() -> returns the area of the circle

Assume Π (pi) = 3.14 for calculations.
You may define any properties in the class as you see appropriate.

*/

class Circle {
    // Define properties here
    float radius;
    
    // Define constructor here
    public Circle(float radius)
    {
        this.radius=radius;
    }

    float perimeter(){
        return (float)(2*3.14*this.radius) ;
		// Complete the function
		
	}
	
	float area(){
        return (float)3.14*this.radius*this.radius;
		// Complete the function
		
	}
}

/*
    Circle a = new Circle(3)  // Radius = 3
	a.perimeter() // 18.84
    a.area() // 28.26
*/