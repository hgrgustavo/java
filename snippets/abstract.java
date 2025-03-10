abstract class Point {
  int x = 1, y = 1;
  void move(int dx, dy) {
    x += dx;
    y += dy;
    alert();
  }
  abstract void alert();
}

abstract class ColoredPoint extends Point {
  int color;
}

class SimplePoint extends Point {
  void alert() { }
}

Point p = new Point();  // Compile-time error: Abstract classes CANNOT be instantiated!!!!






