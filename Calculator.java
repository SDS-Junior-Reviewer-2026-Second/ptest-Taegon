public class Calculator {
    private double result;

    public void plus(double a, double b) {
        result = a + b;
    }

    public void minus(double a, double b) {
        result = a - b;
    }

    public void divide(double a, double b) {
        result = (b != 0) ? (a / b) : Double.NaN;
    }

    public void multiply(double a, double b) {
        result = a * b;
    }

    public void printResult() {
        System.out.println("Result: " + result);
    }
}
