import java.util.function.*;

class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    // Ошибка деления на ноль! Добавил исключение "Деление на ноль".
    BinaryOperator<Integer> devide = (x, y) -> {try {return x / y;} catch (Exception e) {throw new RuntimeException (e);}};
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}