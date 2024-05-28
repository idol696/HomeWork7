public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        int depositBank = 0;
        int deposit = 15000;
        int month = 1;
        while (depositBank < 2_459_000) {
            depositBank += deposit;
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей\r\n", month, depositBank);
            month++;
        }

        System.out.println("Задача 2");
        int count = 1;
        while (count <= 10) {
            System.out.printf("%s ", count);
            count++;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.printf("%s ", i);
        }
        System.out.println();

        System.out.println("Задача 3");
        int peopleBirth = 17;
        int peopleDead = 8;
        int peopleTotal = 12_000_000;
        for (int i = 1; i <= 10; i++) {
            peopleTotal += peopleTotal / 1000 * (peopleBirth - peopleDead);
            System.out.println("Год " + i + ", численность населения составляет " + peopleTotal);
        }

        System.out.println("Задача 4");
        depositBank = 15000;
        month = 1;
        int percent = 7;
        while (depositBank < 12_000_000) {
            float depositPercent = depositBank * ((float) percent / 100);
            depositBank += (int) (depositPercent);
            System.out.printf("Месяц %s, сумма накоплений равна %s рублей\r\n", month, depositBank);
            month++;
        }

        System.out.println("Задача 5");
        depositBank = 15000;
        month = 1;
        percent = 7;
        while (depositBank < 12_000_000) {
            float depositPercent = depositBank * ((float) percent / 100);
            depositBank += (int) depositPercent;
            if (month % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений равна %s рублей\r\n", month, depositBank);
            }
            month++;
        }

        System.out.println("Задача 6");
        depositBank = 15000;
        month = 1;
        percent = 7;
        int yearOfDeposit = 9;
        for (int i = 1; i <= 12 * yearOfDeposit; i++ ) {
            float depositPercent = depositBank * ((float) percent / 100);
            depositBank += (int) depositPercent;
            if (i % 6 == 0) {
                System.out.printf("Месяц %s, сумма накоплений равна %s рублей%n", month, depositBank);
            }
            month++;
        }

        System.out.println("Задача 7");
        int firstFridayDate = 3;
        int dayInMonth = 31;
        for (int i = firstFridayDate; i <= dayInMonth; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число");
        }

        System.out.println("Задача 8");
        int currentYear = 2024;
        for (int i = 0; i < currentYear + 100; i += 79) {
            if (i >= currentYear - 200) {
                System.out.println(i);
            }
        }

    }
}