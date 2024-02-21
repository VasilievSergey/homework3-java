package gb;

public class ArrayComparator {
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false; // Разные длины массивов
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false; // Не равные элементы
            }
        }

        return true; // Все элементы одинаковы
    }
}
