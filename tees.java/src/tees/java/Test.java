package tees.java;

public class Test {
    public static void main(String[] args) {
        String str = null;
        switch (str) { // #1
            case "null":
                System.out.println("null string"); // #2
                break;
        }
    }
}