// Demonstrate a simple lambda expression

// A functional interface

interface myNumber {
  double getValue() {
}

class LambdaDemo {
  public static void main(String[] args) {
    MyNumber myNum;   // Interface reference
    
    // Here, the lambda expression is simply a constant expression.
    // When it is assigned to myNum, a class instance is constructed in which the lambda expression implements
    // The getValue() method in MyNumber.
    myNum = () -> 123.45;
    
    /* Call getValue(), which is provided by previously assigned lambda expression*/
    System.out.print("A fixed value: " + myNum.getValue());
    
    // Here, a more complex expression is used.
    myNum = () -> Math.random() * 100;
    
    // Calling the lambda expression in the previous line.
    System.out.print("A random value: " + myNum.getValue());
    System.out.print("Another random value: " + myNum.getValue());
    
    /* A lambda expression must be compatible with the method defined by the functional interface. Therefore, this won't work: */
 // myNum = () -> "123.45"; // Error!
 }
}

// Demonstrate a lambda expression that takes a parameter.

// Another functional interface
interface NumericTest {
  boolean test(int n);
}

class LambdaDemo {
  public static void main(String[] args) {
    NumericTest isEven = (n) -> (n % 2) == 0;
    
    if(isEven.test(10)) System.out.print("10 is Even");
    if(!isEven.test(9)) System.out.print("9 is not Even");
    
    // Now, use a lambda expression that test if a number is a non-negative (n > -1)
    
    NumericTest isNonNeg = (n) -> n > -1;
    
    if(isNonNeg.test(1)) System.out.print("1 is non-negative");
    if(!isNonNeg.test(-1)) System.out.print("-1 is negative");
  }
}

// Demonstrate a lambda expression that takes two parameters
interface NumericTest2 {
  boolean test(int n, ind d);
}

class LambdaDemo {
  public static void main(String[] args) {
    // Determine if a number is factor of another
    NumericTest2 isFactor = (n, d) -> (n % d) == 0;
    
    if(isFactor.test(10, 2)) System.out.print("2 is a factor of 10");
    if(!isFactor.test(10, 3)) System.out.print("3 is not a factor of 10");
  }
}

// Block lambda that computes the factorial of an int value
interface NumericFunc {
  int func(int n);
}

class BlockLambdaDemo {
  public static void main(String[] args) {
    // This block lambda computes the factorial of an int value.
    NumericFunc factorial = (n) -> {
      int result = 1;
      for(int i = 1; i <= n; i++) 
        result = i * result;
        return result;
    };
    System.out.print("The factorial of 3 is " + factorial.func(3));
    System.out.print("The factorial of 5 is " + factorial.func(5));
  }
}

// A block lambda that reverses the characters in a string.
interface StringFunc {
  String func(String s);
}

class BlockLambdaDemo {
  public static void main(String[] args) {
    // This block lambda reverses the characters in a string.
    StringFunc reverse = (str) -> {
      String result = "";
      for(int i = str.length() - 1; i >= 0; i--)
        result += str.charAt(i);
      return result;
    };
    
    System.out.print("Lambda reversed is " + reverse.func("Lambda"));
    System.out.print("Expression reversed is " + reverse.func("Expression"));
  }
}

// Generic functional interface with lambda expressions

// A generic functional interface
interface SomeFunc<T> {
  T func(T t);
}

class GenericFunctionalInterfaceDemo {
  public static void main(String[] args) {
    SomeFunc<String> reverse = (str) -> {
      String result = "";
      for(int i = str.length() -1; i >= 0; i--)
        result += str.charAt(i);
        return result;
      };
      System.out.print("Lambda reverse is " + reverse.func("Lambda");
      System.out.print("Expression reverse is " + reverse.func("Expressino");
    }
  }
  
  // Integer version of SomeFunc
  SomeFunc<Integer> factorial = (n) -> {
    int result = 1;
    for (int i = 1; i <= n; i++) {
      result = i * result;
    return result;
  };
    System.out.print("The factorial of 3 is " + factorial.func(3));
    System.out.print("The factorial of 5 is " + factorial.func(5));
  }
}
