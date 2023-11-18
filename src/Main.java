public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1(){
        int[] arr = generateRandomArray();
        System.out.println("Задача 1");
        for (int j : arr) {
            System.out.println("Сумма трат за месяц составила " + j + " рублей.");
        }
    }

    public static void task2(){
        int[] arr = generateRandomArray();
        System.out.println("Задача 2");
        int maxExpenses = -1;
        int minExpenses = 200_001;
        for (int j : arr) {
            if (j > maxExpenses) {
                maxExpenses = j;
            } else if (j < minExpenses) {
                minExpenses = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpenses + " рублей. Максимальная сумма трат за день составила " + maxExpenses + " рублей.");
    }

    public static void task3(){
        int[] arr = generateRandomArray();
        System.out.println("Задача 3");
        double allExpenses = arr[0];
        for (int i = 1; i < arr.length; i++) {
            allExpenses = allExpenses + arr[i];
        }
        double averageExpenses = allExpenses / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.", averageExpenses);
        System.out.println();
    }

    public static void task4(){
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i] + " ");
        }
    }
}