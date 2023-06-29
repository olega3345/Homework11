public class Main {
    public static void main(String[] args) {
        checkLeapYear(2001);
        checkClientOS(1, 2015);
        deliveryDays(95);
    }
    public static void checkLeapYear (int year) {
        System.out.println("Задача 1");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " високосный");
        } else {
            System.out.println("Год " + year + " невисокосный");
        }
    }
    public static void checkClientOS (int clientOS, int clientDeviceYear) {
        System.out.println("Задача 2");
        int iOs = 1;
        int android = 0;
        if (clientOS == iOs && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == android && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите приложение по ссылке");
        }
    }
    public static void deliveryDays (int deliveryDistance) {
        System.out.println("Задача 3");
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Доставки нет");
        }
    }
}
