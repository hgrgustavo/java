/* 
package mypackage;            // Package statement
package pkg1[.pkg2[.pkg3]];   // Hierarchy packages statement
package a.b.c;                // Equals to FileSystem pattern: directory_A\directory_B\directory_C  

package mypack;   // CLASSPATH or -classpath must be a path to mypack and must not include himself: C:\MyPrograms\Java ('mypack' SHOULD BE IN THIS DIRECTORY!)
*/

/* A Short Package Example */ 

// A simple package
package mypack;
class Balance {
  String name;
  double bal;
  Balance (String n, double b) {
    name = n;
    bal = b;
  }
  void show() {
    if(bal < 0)
      System.out.print("--> ");
      System.out.println(name + ": $ " + bal);
  }
}
class AccountBalance {
  public static void main (String[] args) {
    Balance current[] = new Balance[3];
    
    current[0] = new Balance("G. H. Gomes", 123.23);
    current[1] = new Balance("D. L. Gomes", 157.02);
    current[2] = new Balance("Vault Guy", 999.00);
    
    for(int i = 0; i < 3; i++) current[i].show();
    }
  }
      
