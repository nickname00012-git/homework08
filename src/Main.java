public class Main {
    public static void main(String[] args) {


        // Heading
        System.out.println();
        System.out.println();
        System.out.println("<<<<  Homework 08  >>>>");
        System.out.println();

        int taskN = 0;

        // Task 1

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        int deposit = 0;
        int monthNumber = 0;
        while (deposit <= 2_459_000) {
            monthNumber++;
            deposit = deposit + 15000;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна: " + deposit);
        }
        System.out.println();
        System.out.println();

        // Task 2

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        int j = 0;
        while (j < 10) {
            j++;
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 10; i >= 1; i -= 1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();


        // Task 3

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        int peopleTotal = 12_000_000;
        for (int yearNumber = 1; yearNumber <= 10; yearNumber += 1) {
            peopleTotal = peopleTotal + peopleTotal / 1000 * (17 - 8);
            System.out.println("Год " + yearNumber + ", численность населения составляет " + peopleTotal + ".");
        }
        System.out.println();
        System.out.println();

        // Task 4

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        double deposit2 = 15000;
        monthNumber = 0;
        do {
            monthNumber++;
            deposit2 = deposit2 * 1.07;
            System.out.print("Месяц " + monthNumber + ", сумма накоплений равна: ");
            System.out.printf("%.2f", deposit2);
            System.out.println(" рублей.");
        }
        while (deposit2 < 12_000_000);
        System.out.println();
        System.out.println();

        // Task 5

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        deposit2 = 15000;
        monthNumber = 0;
        do {
            monthNumber++;
            deposit2 = deposit2 * 1.07;
            if (monthNumber % 6 == 0) {
                System.out.print("Месяц " + monthNumber + ", сумма накоплений равна: ");
                System.out.printf("%.2f", deposit2);
                System.out.println(" рублей.");
            }
        }
        while (deposit2 < 12_000_000);
//       System.out.print("Месяц " + monthNumber + ", сумма накоплений равна: ");
//       System.out.printf("%.2f", deposit2);
//       System.out.println();
        System.out.println();
        System.out.println();

        // Task 6

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        deposit2 = 15000;
        monthNumber = 1;
        int totalMonths = 12 * 9;
        for (; monthNumber <= totalMonths; monthNumber++) {
            deposit2 = deposit2 * 1.07;
            if (monthNumber % 6 == 0) {
                System.out.print("За " + (double) monthNumber / 12 + " лет сумма накоплений составит: ");
                System.out.printf("%.2f", deposit2);
                System.out.println(" рублей.");
            }
        }
        System.out.println();
        System.out.println();

        // Task 7

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        int dateOnFriday = 3;
        do {
            System.out.println("Сегодня пятница, " + dateOnFriday + "-е число. Необходимо подготовить отчет.");
            dateOnFriday += 7;
        } while (dateOnFriday <= 31);
        System.out.println();
        System.out.println();

        // Task 8

        taskN += 1;
        System.out.println("Task " + taskN + ".");
        System.out.println("=======");
        System.out.println();

        // период обращения кометы
        // int cometArrivalPeriod = 79;
        // текущий год
        // int currentYear = 2024;
        // Определение года начала исследуемого интервала
        int startYear = 2024 - 200;
        // Определение года окончания исследуемого интервала
        int endYear = 2024 + 100;
        // Определение первого появления кометы в исследуемом интервале
        int cometArrivalYear = startYear - startYear % 79 + 79;
        do {
//            System.out.println("startYear % cometArrivalPeriod " + startYear % cometArrivalPeriod);
            System.out.println(cometArrivalYear);
            cometArrivalYear += 79;
        } while (cometArrivalYear <= endYear);

        System.out.println();
        System.out.println();

    }
}

