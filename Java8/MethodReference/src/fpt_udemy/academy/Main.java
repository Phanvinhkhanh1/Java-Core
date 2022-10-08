package fpt_udemy.academy;


@FunctionalInterface
interface AddFunction {
    int add(int a, int b);
}

//Reference to static method
class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }
}

//Reference to instance method of particular object
class MathUtils2 {
    public int add(int a, int b) {
        return a + b;
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a = 1;
        int b = 2;

        System.out.println("Reference to static method : ");
        System.out.println(doAction(a, b, MathUtils::add));
        System.out.println();

        System.out.println("Reference to instance method of particular object");
        MathUtils2 mathUtils2 = new MathUtils2();
        System.out.print(doAction(a, b, mathUtils2::add));
    }

    public static int doAction(int a, int b, AddFunction fun) {
        return fun.add(a, b);
    }
}
