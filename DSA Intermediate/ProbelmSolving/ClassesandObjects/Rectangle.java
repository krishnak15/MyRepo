/*
Class Rectangle

Construct a class Rectangle that represents a rectangle.
The class should support the following functionalities:-
perimeter() -> returns the perimeter of the rectangle
area() -> returns the area of the rectangle
You may define any properties in the class as you see appropriate.
*/
class Rectangle {
    // Define properties here
    int length;
	int breadth;
    
    // Define constructor here

	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}

    int perimeter(){
		// Complete the function
		return 2*(this.length+this.breadth);
		
	}
	
	int area(){
		return (this.length*this.breadth);
		// Complete the function
		
	}
}

/*
    Rectangle a = new Rectangle(2, 3)  // Length = 2, Breadth = 3
	a.perimeter() // Should give 10
    a.area() // Should give 6
*/