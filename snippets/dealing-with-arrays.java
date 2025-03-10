// Declaring an integer array 
int[] nums;

// Creating an array, allocating it in memory and assigning to 'nums'
nums = new int[7];

// Giving values to 'nums' array indexes
nums[0] =  6;
nums[1] = 19;
nums[2] = 44;
nums[3] = 42;
nums[4] = 10;
nums[5] = 20;
nums[6] =  1;

// Declaring array 'pets' of type 'Dog'
Dog[] pets;

// Assigning an array 'Dog' of 7 length to 'pets'
pets = new Dog[7];

// Creating Dog objects to compose our array 'pets'
pets[0] = new Dog();
pets[1] = new Dog();

// Controlling dog 'Fido'
Dog fido = new Dog();
fido.name = "Fido";
fido.bark();
fido.chaseCat();

// Objects inside an array
Dog[] myDogs = new Dog[3];
myDogs[0] = new Dog();
myDogs[0].name = "Fido";
myDogs[0].bark();

// A dog example
class Dog {
  String name;
  public static void main (String[] args) {
    // Make a Dog object and access it
    Dog dog1 = new Dog();
    dog1.bark();
    dog1.name = "Bart";
    
    // Make a Dog array and put some dogs in it
    Dog[] myDogs = new Dog[3];
    myDogs[0] = new Dog();
    myDogs[1] = new Dog();
    myDogs[2] = new dog1;
    
    // now access the Dogs using the array
    // references
    myDogs[0].name = "Fred";
    myDogs[1].name = "Marge";
    
    // What is myDogs[2] name?
    System.out.print("Last Dogs Name Is " + myDogs[2].name);
    
    // Looping through the array and making all dogs bark :/
    int x = 0;
    while(x < myDogs.length) {
      myDogs[x].bark();
      x++;
      }
    }
    
    public void bark() {
      System.out.print(name + "says Ruff!");
    }
    public void eat() {};
    public void chaseCat() {};
  }
  
  // The code above will compile? Yes
  class Books {
    String title;
    String author;
  }
  class BooksTestDrive {
    public static void main(String[] args) {
      Books[] myBooks = new Books[3];
      
      int x = 0;
      
      myBooks[0].title = "The Grapes of Java";
      myBooks[0].author = "Bob";
      
      myBooks[1].title = "The Java Gatsby";
      myBooks[1].author = "Sue";
      
      myBooks[2].title = "The Java Cookbook";
      myBooks[2].author = "Ian";
      
      while(i < 3) {
        System.out.print(myBooks[i].title);
        System.out.print(" by ");
        System.out.print(myBooks[i].author);
        x++;
        }
      }
    }
    
    // Or this code will compile? No
    
    class Hobbits {
      String name;
      
      public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = 0;
        
        while (z < 4) {
          z++;
          h[z] = new Hobbits();
          h[z].name = "Bilbo";
          if (z == 1) {
            h[z].name = "Sam";
          }
          System.out.print(h[z].name + " is a ");
          System.out.print("good Hobbit name");
          }
        }
      }

// Rebuilding the code
class TestArrays {
  public static void main (String[] args) {
    int y = 0;
    
    int ref = index[y];
    
    int[] index = new int[4];
    index[0] = 1;
    index[1] = 3;
    index[2] = 0;
    index[3] = 2;
    
    String[] islands = new String[4];
    islands[0] = "Bermuda";
    islands[1] = "Fiji";
    islands[2] = "Azores";
    islands[3] = "Cozumel";
    
    while (y < 4) {
      System.out.print("island = ");
      System.out.print(islands[ref];
      
      y = y + 1;
      }
    }
  }
      
      
      
    
    
