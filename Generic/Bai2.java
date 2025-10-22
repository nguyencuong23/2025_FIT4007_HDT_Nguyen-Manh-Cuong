package Generic;

class FindMax {
    public static <T extends Comparable<? super T>> T findMax(T[] arr) {
        if (arr == null || arr.length == 0) return null;
        T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }
        return max;
    }
}

public class Bai2 {
    public static void main(String[] args) {
        Integer[] numbers = {3, 8, 5, 12, 7};
        String[] words = {"apple", "banana", "pear", "orange"};

        System.out.println("Max Integer: " + FindMax.findMax(numbers));
        System.out.println("Max String: " + FindMax.findMax(words));
    }
}

