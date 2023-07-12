package mutation_testing;

public class Calculator {
    public int add(int a, int b) {
        if (a < 2) {
            return (a + b) * -1;
        } else {
            return a + b;
        }
    }
}