import java.util.function.BiFunction;

public class Calculadora {

        public static void main(String[] args) {

            //<>

            //BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;
            BiFunction<Integer, Integer, Integer> multiplicacion = (x, y) -> x * y;
            BiFunction<Integer, Integer, String> suma = (x, y) -> "la suma es: " + (x + y);
            BiFunction<Integer, Integer, Integer> resta = (x, y) -> (x - y);
            BiFunction<Integer, Integer, Integer> division = (x, y) -> (x / y);

            System.out.println("los valores para las operaciones son: X = 10  Y = 5");
            System.out.print("la multiplicacion es: ");
            System.out.println(multiplicacion.apply(10,5));
            System.out.println(suma.apply(10,5));
            System.out.print("la resta es: ");
            System.out.println(resta.apply(10,5));
            System.out.print("la division es: ");
            System.out.println(division.apply(10,5));
        }
    }

