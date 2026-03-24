import java.util.*;

class week3assignments {
    static int linearFirst(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals(key)) return i;
        return -1;
    }

    static int linearLast(String[] arr, String key) {
        for (int i = arr.length - 1; i >= 0; i--)
            if (arr[i].equals(key)) return i;
        return -1;
    }

    static int binarySearch(String[] arr, String key) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m].equals(key)) return m;
            if (arr[m].compareTo(key) < 0) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] arr = {"accA", "accB", "accB", "accC"};

        System.out.println(linearFirst(arr, "accB"));
        System.out.println(linearLast(arr, "accB"));
        System.out.println(binarySearch(arr, "accB"));

        int count = 0;
        for (String s : arr) if (s.equals("accB")) count++;
        System.out.println(count);
    }
}