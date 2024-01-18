import java.util.Scanner;

class InvalidInputError extends Exception {
    @Override
    public String toString() {
        return "can not add 8 and 9";
    }

    @Override
    public String getMessage() {
        return "You entered an invalid string";
    }
}

class Cannotdividebyzero extends Exception {
    @Override
    public String toString() {
        return "Invalid division";
    }

    @Override
    public String getMessage() {
        return "You entered an invalid string";
    }
}

class Bigvalue extends Exception {
    @Override
    public String toString() {
        return "The value is too big to compute";
    }

    @Override
    public String getMessage() {
        return "You entered an invalid string";
    }
}

class CustomCal {
    double add(double a, double b) throws InvalidInputError,Bigvalue {
        if (a > 10000 || b > 10000) {
            throw new Bigvalue();
        }
        if (a == 8 || a == 9 || b == 8 || b == 9) {
            throw new InvalidInputError();
        }
        return a + b;
    }

    double sub(double a, double b) {
        return a - b;
    }

    double mul(double a, double b) {
        return a * b;
    }

    double div(double a, double b) throws Cannotdividebyzero {
        if (b == 0) {
            throw new Cannotdividebyzero();
        }
        return a / b;
    }
}

public class Calculator {
    public static void main(String args[]) throws InvalidInputError, Cannotdividebyzero, Bigvalue {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        CustomCal c = new CustomCal();
        // System.out.println(c.add(a,b));
        System.out.println(c.div(a, b));
    }
}
