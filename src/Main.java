public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
    public static void task3(){
        int year = 2021;
        int everyYear = 4;
        int vesYear = year / everyYear;
        if (vesYear == 4){
            System.out.println("Год является високосным");
        }else{
            System.out.println("Год не является висикосным");
        }
    }
}