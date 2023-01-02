/*
* Your task is to create a function that does four basic mathematical operations.
*
* The function should take three arguments - operation(string/char), value1(number), value2(number).
* The function should return result of numbers after applying the chosen operation.
 */

public class Math {
    public static void main(String[] args) {
        System.out.println(basicMath("*", 2, 0));
    }

    public static Integer basicMath(String op, int v1, int v2) {
        if (op.equals("+")) return v1 + v2;
        if (op.equals("-")) return v1 - v2;
        if (op.equals("*")) return v1 * v2;
        if (op.equals("/")) {
            if (v2 == 0) throw new IllegalArgumentException("Division by zero");
            return v1 / v2;
        }

        throw new IllegalArgumentException("Unknown operation: " + op);
    }
}
