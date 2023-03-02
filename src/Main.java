public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите приложение для IOS по ссылке");
        } else {
            System.out.println("Установите приложение для Android по ссылке");
        }
    }

    public static void task2() {
        int clientDeviceYear = 2013;
        switch (clientDeviceYear) {
            case 2016:
                System.out.println("Установите обычную версию приложения по ссылке");
            case 2013:
                System.out.println("Установите облегченную версию приложения по ссылке");
        }
    }

}