package gb;

import static gb.ArrayComparator.compareArrays;


public class Main {
    public static void main(String[] args) {

        // Калькулятор

        System.out.println("Сумма: " + Calculator.sum(5345, 3));
        System.out.println("Произведение: " + Calculator.multiply(9.5, 2.8));
        System.out.println("Деление: " + Calculator.divide(10.4, 7.5));
        System.out.println("Вычитание: " + Calculator.subtract(20, 5));

        // обобщенный метод compareArrays()

        Integer[] intArray1 = {1, 2, 3, 4, 5};
        Integer[] intArray2 = {1, 2, 3, 4, 5};
        Integer[] intArray3 = {1, 7, 3, 4, 6};

        String[] strArray1 = {"one", "two", "three"};
        String[] strArray2 = {"one", "four", "three"};
        String[] strArray3 = {"one", "two", "three"};

        System.out.println("intArray1 = intArray2 ?" + compareArrays(intArray1, intArray2)); // true
        System.out.println("strArray1 = strArray2 ?" + compareArrays(strArray1, strArray2)); // false
        System.out.println("intArray1 = intArray3 ?" + compareArrays(intArray1, intArray3)); // false
        System.out.println("strArray1 = strArray3 ?" + compareArrays(strArray1, strArray3)); // true

        //обобщенный класс Pair
        Pair<Integer, String> pair1 = new Pair<>(23, "Hello");
        Pair<Double, Boolean> pair2 = new Pair<>(9.42, true);

        System.out.println("Pair 1: " + pair1.toString());
        System.out.println("First value of Pair 2: " + pair2.getFirst());
        System.out.println("Second value of Pair 2: " + pair2.getSecond());


    }
}
