// Demonstrate block scope.
class Scope {
  public static void main(String[] args) {
    int x = 10;  // Known to all code within main. method_scope.
    
    if (x == 10) {  // Start new scope. statement_scope
      int y = 20;   // Known only to this block. statement_scope.
      
      // x and y are both known here
      System.out.print("x and y: " + x + " " + y);
      x = y * 2;
    }
    // y = 100;   // Error! y not known here. He is from statement_scope.
    
    // x is still known here.
    System.out.print("x is " + x);
  }
}
