public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Perform calculations
        calculator.plus(10, 5);
        calculator.printResult(); // Result: 15.0

        calculator.minus(10, 5);
        calculator.printResult(); // Result: 5.0

        calculator.multiply(10, 5);
        calculator.printResult(); // Result: 50.0

        calculator.divide(10, 5);
        calculator.printResult(); // Result: 2.0

        calculator.divide(10, 0); // Error: Division by zero
        calculator.printResult(); // Result: NaN
    }
}
