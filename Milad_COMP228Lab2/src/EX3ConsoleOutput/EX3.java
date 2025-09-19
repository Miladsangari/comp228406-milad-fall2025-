package EX3ConsoleOutput;

public class EX3 {
    // Method 1: add two ints
    public static int add(int a, int b) {
        return a + b;
    }

    // Method 2: add three ints
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: concatenate two strings
    public static String add(String a, String b) {
        return a + " " + b;
    }

    public static void main(String[] args) {
        System.out.println("add(5, 10) = " + add(5, 10));
        System.out.println("add(2, 4, 6) = " + add(2, 4, 6));
        System.out.println("add(\"Hello\", \"World\") = " + add("Hello", "World"));
    }
}