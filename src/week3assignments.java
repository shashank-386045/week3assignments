import java.util.*;

class week3assignments {
    static class Client {
        String name;
        int risk;
        int balance;

        Client(String n, int r, int b) {
            name = n;
            risk = r;
            balance = b;
        }

        public String toString() {
            return name + ":" + risk;
        }
    }

    static void bubbleSort(Client[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].risk > arr[j + 1].risk) {
                    Client temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void insertionSort(Client[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;
            while (j >= 0 && (arr[j].risk < key.risk ||
                    (arr[j].risk == key.risk && arr[j].balance < key.balance))) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Client[] arr = {
                new Client("A", 20, 1000),
                new Client("B", 50, 2000),
                new Client("C", 80, 1500)
        };

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length && i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}