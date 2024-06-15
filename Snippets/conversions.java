/*class Conversions {
    static class Cast {
        int a;
        byte b = (byte) a;

    }
}

class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.print("\n Conversion of int to byte.");
        b = (byte) i;
        System.out.print("i and b: " + i + " " + b);

        System.out.print("\n Conversion of double to int. ");
        i = (int) d;
        System.out.print("d and i: " + d + " " + i);

        System.out.print("\nConversion of double to byte.");
        b = (byte) d;
        System.out.print("d and b: " + d + " " + b);
    }
}

 */

class Animal {
    public void fazBarulho() {
        System.out.println("silêncio");
    }
}
class Dog extends Animal {
    @Override
    public void fazBarulho() {
        System.out.println("au au");
    }
}
class Cat extends Animal {
    @Override
    public void fazBarulho() {
        System.out.println("miau");
    }
}
class Ideone {
    public static void main(String[] args) {

    }

}
