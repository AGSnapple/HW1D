public class Main {
    public static void main(String[] args) {
        double result = 0;
        double expr;
        int n = 2;

        while((expr = function(n++)) >= 1e-6) result += expr;

        System.out.println(result);
    }

    public static double function(int n) {
        return (double)1 / (n*n + n - 2);
    }
}