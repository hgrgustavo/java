import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.print("> Insert a Integer number, Hit ENTER To Confirm: ");
        int A = sc.nextInt();
        System.out.print("> Insert a Integer number, Hit ENTER To Confirm: ");
        int B = sc.nextInt();
      
        System.out.print(". . . Starting Verification . . . \n\n");
        
        verifyier(A, B);
      
    }
    public static void verifyier(int x, int y) {
    	if (x % 2 == 0) {
    		System.out.print(x + " Is Pair\n");
    	}
    	else {
    		System.out.print(x + " Is Impair\n");
    	}
    	if (y % 2 == 0) {
    		System.out.print(y + " Is Pair\n");
    	}
    	else {
    		System.out.print(y + " Is Impair\n");
    	}
    
    }   
}
