// A simple example of inheritance

// Create a superclass (also called parent-class)
class A {
  int i, j;
  void showij() {
    System.out.print("i and j: " + i + " " + j);
  }
}

// Create a subclass (also called child-class)
class B extends A {
  int k;
  void showk() {  
    System.out.print("k: " + k);
  }
  void sum() {
    System.out.print("i + j + k: " + (i + j + k));
  }
}

class SimpleInheritance {
  public static void main (String[] args) {
    A superOb = new A();
    B subOb = new B();
    
    // The superclass may be used by itself.
    superOb.i = 10;
    superOb.j = 20;
    System.out.print("Contents of superOb: " + superOb.showij() + "\n");
    
    // The subclass has access to all public members of its superclass!
    subOb.i = 7;
    subOb.j = 8;
    subOb.k = 9;
    System.out.print("Contents of subOb: " + subOb.showij() + " " + subOb.showk() + "\n");
    System.out.print("Sum of i, j and k in subOb: " + subOb.sum()) + "\n");
  }
}

/* In a class hierachy, private members remain private to their class
   This code contains an error and WILL NOT compile.
*/

  // Create a superclass
  class A {
    int i; // public by defautl
    private int j; // private to A
    
    void setij(int x, int y) {
      i = x;
      j = y;
    }
  }
  
  // A's j is not accessible here.
  class B extends A {
    int total;
    
    void sum() {
      total = i + j;  // ERROR, j is not accessible here
    }
  }
  
  class Access {
    public static void main(String[] args) {
      B subOb = new B();
      
      subOb.setij(10, 12);
      
      subOb.sum();
      System.out.print("Total is " + subOb.total);
    }
  }
  
  
  
// A more practical example

// This program uses inheritance to extend Box.
class Box {
  double width;
  double height;
  double depth;
  
  // Construct clone of an object
  Box(Box ob) { // Pass object to constructor
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
  }
  
  // Constructor used when all dimensions specified
  Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }
  
  // Construct used when cube is created
  Box(double len) {
    width = height = depth = len;
  }
  
  // Compute and return volume
  double volume() {
    return width * height * depth;
  }
}

// Here, Box is extended to include weigth.
class BoxWeigth extends Box {
  double weight;  // weigth of box
  
  // Constructor of BoxWeight
  BoxWeight(double w, double h, double d, double m) {
    width = w;
    height = h;
    depth = d;
    weight = m;
  }
}

class DemoBoxWeight {
  public static void main(String[] args) { 
    BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
    BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
    
    vol = mybox1.volume();
    System.out.print("Volume of mybox1 is " + vol);
    System.out.print("Weight of mybox1 is " + mybox1.weight);
    System.out.println();
    
    vol = mybox2.volume();
    System.out.print("Volume of mybox2 is " + vol);
    System.out.print("Weight of mybox2 is " + mybox2.weight);
  }
}

// Here, Box is extended to include color.
class ColorBox extends Box {
  int color;  // color of box
  
  ColorBox(double w, double h, double d, int c) {
    width = w;
    height = h;
    depth = d;
    color = c;
  }
}

// A Superclass Variable Can Reference a Subclass object
class RefDemo {
  public static void main(String[] args) {
    BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
    Box plainbox = new Box();
    double vol;
    
    vol = weightbox.volume();
    System.out.print("Volume of weightbox is " + vol);
    System.out.print("Weight of weightbox is " + weightbox.weight);
    System.out.println();
    
    // assign BoxWeight reference to Box reference
    plainbox = weightbox;
    
    vol = plainbox.volume();  // OK, volume() defined in Box
    System.out.println("Volume of plainbox is " + vol);
    
    // The following statement is invalid because plainbox does not define weight member.
    // System.out.print("Weight of plainbox is " + plainbox.weight);
  }
}

// BoxWeight now uses super to initialize its Box attributes
class BoxWeight extends Box {
  double weight;  // weight of box
  
  // initialize width, height, and depth using super()
  BoxWeight(double w, double h, double d, double m) {
    super(w, h, d);   // Call superclass constructor
    weight = m;
  }
}

// A complete implementation of BoxWeight.
class Box {
  private double widht;
  private double height;
  private double depth;
  
  // construct clone of an object
  Box(Box ob) { // pass object to constructor
  width = ob.width;
  height = ob.height;
  depth = ob.depth;
  
  // constructor used when all dimensions specified
  Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }
  
  // constructor used when no dimensions specified
  Box() {
    width = -1;
    height = -1;  // -1 to indicate an unintialized box
    depth = -1;
  }
  
  // constructor used when cube is created
  Box(double len) {
    width = height = depth = len;
  }
  
  // compute and return volume
  double volume() {
    return width * height * depth;
  }
}

// BoxWeight now fully implements all constructors.
class BoxWeight extends Box {
  double weight;  // weight of box
  
  // construct clone of an object
  BoxWeight(BoxWeight ob) {   // pass object as parameter to constructor
    super(ob);
    weight = ob.weight;
  }
  
  // constructor when all parameters are specified
  BoxWeight(double w, double h, double d, double m) {
    super(w, h, d);
    weight = m;
  }
  
  // default constructor
  BoxWeight() {
    super();
    weight = -1;
  }
  
  // constructor used when cube is created
  BoxWeight(double len, double m) {
    super(len);
    weight = m;
  }
}

class DemoSuper {
  public static void main(String[] args) {
    BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.);
    BoxWeight mybox2 = new BoxWeight(2, 3, 4 , 0.076);
    BoxWeight mybox3 = new BoxWeight(); // default
    BoxWeight mycube = new BoxWeight(3, 2);
    BoxWeight myclone = new BoxWeight(mybox1);
    
    double vol;
    
    vol = mybox1.volume();
    System.out.print("Volume of mybox1 is " + vol);
    System.out.print("Weight of mybox1 is " + mybox1.weight);
    System.out.println();
    
    vol = mybox2.volume();
    System.out.print("Volume of mybox2 is " + vol);
    System.out.print("Weight of mybox2 is " + mybox2.weight);
    System.out.println();
    
    vol = mybox3.volume();
    System.out.print("Volume of mybox3 is " + vol);
    System.out.print("Weight of mybox3 is " + mybox3.weight);
    System.out.println();
    
    vol = myclone.volume();
    System.out.print("Volume of myclone is " + vol);
    System.out.print("Weight of myclone is " + myclone.weight);
    System.out.println();
    
    vol = mycube.volume();
    System.out.print("Volume is mycube is " + vol);
    System.out.print("Weight of volume is " mycube.weight);
    System.out.println();
  }
}

// Using super to overcome name hiding
class A {
  int i;
}

// Create a subclass by extending class A
class B extends A {
  int i;  // This hides the i instance in A
  
  B(int a, int b) {
    super.i = a;  // i in A, overcomed
    i = b;  // i in B
  }
  
  void show() {
    System.out.print("i in superclass: " + super.i);
    System.out.print("i in subclass: " + i);
  }
}

class UseSuper {
  public static void main(String[] args) {
    B subOb = new B(1, 2);
    subOb.show();
  }
}
    
    
    


    
    
    
    
    
    
    
    
    
    
    
    


  
