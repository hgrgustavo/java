// New operator allocates memory in heap to an object && New operator returns the address to that object, stored in the reference var.

// Declaring, instantianting and initializing an object
Point originOne = new Point(23, 94);

// New can also declare variables
int height = new Rectangle().height;

// To declare an object with new, the type_class and constructor_type is required
public class Point {
  public int x = 0;
  public int y = 0;
  // Constructor
  public Point(int a, int b) {
    this.x = a;
    this.y = b;
  }
}

// Bigger example
public class Rectangle {
  public int width, height = 0;
  public Point origin;  // reference-var to Point Object
  
  // Four constructors
  public Rectangle() {
    origin = new Point(0, 0);
  }
  public Rectangle(Point p) {
    origin = p;
  }
  public Rectangle(int w, int h) {
    origin = new Point(0, 0);
    width = w;
    height = h;
  }
  public Rectangle(Point p, int w, int h) {
    origin = p;
    width = w;
    height = h;
  }
  
  // a method for moving the rectangle
  public void move(int x, int y) {
    origin.x = x;
    origin.y = y;
  }
  
  // a method for computing the area of the rectangle
  public int getArea() {
    return width * height;
  }
}

Rectangle rectOne = new Rectangle(originOne, 100, 200);
Rectangle rectTwo = new Rectangle(50, 100);
Rectangle rectThree = new Rectangle();
