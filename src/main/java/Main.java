public class Main {
    public static void main(String[] args) {
        int a, b, c;
        float f;
        double d;
        a = 10;
        b = 20;
        c = 20;
        f = 2.5F;

        System.out.println("Арифметические операции");
        System.out.println("Результат сложения a + b = " + (a + b));
        System.out.println("Результат вычитания b - a = " + (b - a));
        System.out.println("Результат умножения a * b = " + (a * b));
        System.out.println("Результат деления b / a = " + (b / a));
        System.out.println("Результат сложения a + f = " + (a + f));
        System.out.println("Результат деления a / f = " + (a / f) + "\n");

        System.out.println("Логические операции");
        System.out.println("b больше чем a? " + (a > b));
        System.out.println("b меньше или равно чем a? " + (a <= b));
        System.out.println("b равно с? " + (b == c));
        System.out.println("b больше или равно с? " + (b >= c) + "\n");

        f = Float.MAX_VALUE;
        d = Double.MAX_VALUE;
        System.out.println("Переполнение при арифметической операции");
        System.out.println("Переполненное значение float: " + (f * 2));
        System.out.println("Переполненное значение double: " + (d * 2));
        System.out.println("Результат деления 0.0/0.0: " + (0.0 / 0.0));
        f = Float.MIN_VALUE;
        System.out.println("Минимальное значение float = " + f);
        System.out.println("Результат деления минимального значения float на 10 = " + (f / 10));












    }
}
