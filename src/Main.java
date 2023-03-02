public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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
                break;
            case 2013:
                System.out.println("Установите облегченную версию приложения по ссылке");
                break;
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
    public static void task4() {
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка карты займёт одни сутки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60){
            System.out.println("доставка карты займёт двое суток");
        }else if (deliveryDistance >60 && deliveryDistance <= 100) {
            System.out.println("Доставка карты займёт трое суток");
        }else{
                System.out.println("Доставка карты не производится");
        }
    }
    public static void task5(){
        int monthNumber = 10;
        switch (monthNumber){
            case 1,2,12:
                System.out.println("Месяца относятся к зиме");
                break;
            case 3,4,5:
                System.out.println("Месяца относятся к весне");
           break;
            case 6,7,8:
                System.out.println("Месяца относятся к лету");
                break;
            case 9,10,11:
                System.out.println("Месяца относятся к осени");
           break;
        }
    }
}