package module4_Class;
/*
 * TODO 1: Declare the Rectangle class. Make it public for testing purposes.
 */
/*
 * TODO 2: Declare two attributes as shown below.
 * 	length: int (to store length of the rectangle.)
 * 	width: int (to store width of the rectangle.)
 */

/*
 * TODO 3: Declare and define the following methods.
 * 	getPerimeter() : int (calculate and return perimeter of the rectangle.)
 * 	getArea() : int (calculate and return area of the rectangle.)
 */

public class Rectangle {
    int length;
    int width;

    public int getPerimeter(){
        return (2 * (length + width));
    }

    public int getArea(){
        return (length * width);
    }

}
