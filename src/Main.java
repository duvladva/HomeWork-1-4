public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");
        int clientOs = 1;
        System.out.println("Переменная clientOs имеет значение: "+clientOs);
        if (clientOs==1) {
            System.out.println("Установите версию приложения для Android по ссылке: ");
        } else if (clientOs==0) {
            System.out.println("Установите версию приложения для iOS по ссылке: ");
        }

        System.out.println();
        // Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear=2005;
        System.out.println("Переменная clientOs имеет значение: "+clientOs);
        System.out.println("Переменная clientDeviceYear имеет значение: "+clientDeviceYear);
        if (clientOs==1) {if (clientDeviceYear>2015)
        {System.out.println("Установите версию приложения для Android по ссылке: ");}
            else {System.out.println("Установите облегченную версию приложения для Android по ссылке: ");}
        } else if (clientOs==0) {if (clientDeviceYear>2015)
        {System.out.println("Установите версию приложения для iOS по ссылке: ");}
            else {System.out.println("Установите облегченную версию приложения для iOS по ссылке: ");}
        }
        System.out.println();
        // Задание 3
        System.out.println("Задание 3");
        int year = 300;
        System.out.println("Переменная year имеет значение: "+ year +" год.");
        if (year % 4 ==0 && (year % 100 !=0 || year % 400 ==0))
        {System.out.println(year+" год - это високосный год!");}
        else {System.out.println(year+" год - это НЕ високосный год!");}
        System.out.println();
        // Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 141;
        int deliveryDays;
        if (deliveryDistance<=20){deliveryDays=1;}
        else if ((deliveryDistance-20)%40 != 0){deliveryDays = 2+(deliveryDistance-20)/40;}
        else {deliveryDays = 1+(deliveryDistance-20)/40;}
        System.out.println("Расстояние от офиса банка до адреса доставки: "+deliveryDistance+ " км.");
        System.out.println("Потребуется "+deliveryDays+" дней.");
        System.out.println();
        // Задание 5
        System.out.println("Задание 5");
        int monthNumber = 17;
        System.out.println("Вопрос, к какому времени года принадлежит месяц с порядковым номером в году: "+monthNumber+" ?");
        System.out.println("Ответ: ");
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Это зимний месяц.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц.");
                break;
            default:
                System.out.println("В году не существует месяца с таким номером.");
        }

    }

}