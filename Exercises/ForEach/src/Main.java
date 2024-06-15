public class Main {
    public static void main(String[] args) {
        String[] vector = new String[] {"Maria", "Bob", "Alex"};
        // Enhanced Loop (for each example)
        for (String s : vector) {
            System.out.print(s);
        }
        for(String obj : vector) {
            System.out.print(obj);
        }
        /*
        for(reference_type, local_var_name : reference_var) { // ... body; }
         */
    }
}
