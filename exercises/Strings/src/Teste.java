public class Teste {

        public static void main(String[] args) {
            String original = "abcde FGHI ABC abc DEFG   ";
            String s = "potato apple lemon";

            String s01 = original.toLowerCase();
            String s02 = original.toUpperCase();
            String s03 = original.trim();
            String s04 = original.substring(2);
            String s05 = original.substring(2, 9);
            String s06 = original.replace('a', 'x');
            String s07 = original.replace("abc", "xy");

            String[] vect = s.split(" ");

            String word1 = vect[0];
            String word2 = vect[1];
            String word3 = vect[2];

            int i = original.indexOf("bc");
            int j = original.lastIndexOf("bc");

            System.out.print(s01 + "\n");
            System.out.print(s02 + "\n");
            System.out.print(s03 + "\n");
            System.out.print(s04 + "\n");
            System.out.print(s05 + "\n");
            System.out.print(s06 + "\n");
            System.out.print(s07 + "\n");

            System.out.print(i + "\n");
            System.out.print(j + "\n");

            System.out.print(word1);
            System.out.print(word2);
            System.out.print(word3);
        }
    }

