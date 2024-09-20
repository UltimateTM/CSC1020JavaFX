package week3;

public class FunctionalProgramming {
    public static void main(String[] args) {
        DoMath add = new DoMath() {
            @Override
            public double math(double a, double b) {
                return a + b;
            }
        };
        // System.out.println(add.math(4, 3));

        StringStuff st = new StringStuff() {
            @Override
            public String stringThing(String s) {
                return "";
            }
        };

        mathing(4, 3, add);
        mathing(4, 3, (a, b) -> a * b);
        mathing(4, 4, (a, b) -> a * a);
        mathing(3, 5, (a, b) -> {
            double result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            return result;
        });
        // makes a new method in the background
        // defines the method in the background

        stringStuff("string", s -> s.substring(0, s.length()/2));
        stringStuff("stringbackwards", s -> {
            String result = "";
            for (int i = 1; i < s.length(); i+= 2) {
                result = s.charAt(i) + result;
            }
            return result;
        });


    }

    private static void mathing(double a, double b, DoMath doMath) {
        System.out.println(doMath.math(a, b));
    }

    private static void stringStuff(String s, StringStuff st) {
        //System.out.println(st(s));
    }
}
