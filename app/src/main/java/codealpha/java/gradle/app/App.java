package codealpha.java.gradle.app;

public class App {
    public String getGreeting() {
        return "Simple Command-Line Calculator is ready.";
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        App calculator = new App();
        System.out.println(calculator.getGreeting());

        // Check if we have exactly 3 arguments
        if (args.length != 3) {
            // If we have 1 argument, try to split it by spaces
            if (args.length == 1) {
                args = args[0].split("\\s+");
                if (args.length != 3) {
                    printUsage();
                    return;
                }
            } else {
                printUsage();
                return;
            }
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            String operator = args[1];
            // Special handling for multiplication operator
            if (operator.equals("x") || operator.equals("X") || operator.equals("*")) {
                operator = "*";
            }
            double num2 = Double.parseDouble(args[2]);
            double result = 0;

            switch (operator) {
                case "+":
                    result = calculator.add(num1, num2);
                    break;
                case "-":
                    result = calculator.subtract(num1, num2);
                    break;
                case "*":
                    result = calculator.multiply(num1, num2);
                    break;
                case "/":
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator. Use +, -, *, or /");
                    return;
            }
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter valid numbers.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static void printUsage() {
        System.out.println("Usage: gradle run --args='<num1> <operator> <num2>'");
        System.out.println("Example 1: gradle run --args='10 + 5'");
        System.out.println("Example 2: gradle run --args=\"25 * 4\"");
        System.out.println("Example 3: gradle run --args='8 / 2'");
    }
}
