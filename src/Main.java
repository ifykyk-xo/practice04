import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Завдання 1
        for (int i = 0; i < 7; i++) {
            System.out.println("Java — надійна та кросплатформна мова!");
        }

        // Завдання 2
        System.out.println("Введіть текст:");
        String text = scanner.nextLine();
        System.out.println("Введіть кількість повторень N:");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "] " + text);
        }

        // Завдання 3
        int balance = 0;
        for (int month = 1; month <= 12; month++) {
            balance += 500;
            System.out.println("Місяць " + month + ": " + balance + " грн");
        }

        // Завдання 4
        System.out.println("Введіть курс євро:");
        double rate = scanner.nextDouble();
        for (int euro = 10; euro <= 100; euro += 10) {
            System.out.println(euro + " євро = " + (euro * rate) + " грн");
        }

        // Завдання 5
        System.out.println("Введіть ширину рамки W:");
        int w = scanner.nextInt();
        for (int i = 0; i < w; i++) System.out.print('=');
        System.out.println();

        // Завдання 6
        for (int count = 10; count >= 1; count--) System.out.println(count);
        System.out.println("Старт!");

        // Завдання 7
        int sum = 0;
        System.out.println("Введіть числа (0 — завершити):");
        int num = scanner.nextInt();
        while (num != 0) {
            sum += num;
            num = scanner.nextInt();
        }
        System.out.println("Загальна сума: " + sum);

        // Завдання 8
        System.out.println("Введіть число M:");
        int m = scanner.nextInt();
        for (long power = 1; power <= m; power *= 2) System.out.println(power);

        // Завдання 9
        System.out.println("Введіть ціле додатне число N:");
        int n2 = scanner.nextInt();
        int temp = n2, count2 = 0, sum2 = 0;
        while (temp > 0) {
            sum2 += temp % 10;
            count2++;
            temp /= 10;
        }
        System.out.println("Кількість цифр: " + count2);
        System.out.println("Сума цифр: " + sum2);

        // Завдання 10
        System.out.println("Введіть число для обернення:");
        int n3 = scanner.nextInt();
        int temp3 = n3, reversed = 0;
        while (temp3 > 0) {
            int digit = temp3 % 10;
            reversed = reversed * 10 + digit;
            temp3 /= 10;
        }
        System.out.println("Обернене число: " + reversed);

        // Завдання 11
        System.out.println("Введіть суму S та відсоток P:");
        double s = scanner.nextDouble();
        double p = scanner.nextDouble();
        int years = 0;
        if (s > 0 && p > 0) {
            double target = s * 2;
            double amount = s;
            while (amount < target) {
                amount += amount * (p / 100);
                years++;
            }
            System.out.println("Сума подвоїться через " + years + " років.");
        } else {
            System.out.println("S і P мають бути додатними.");
        }

        // Завдання 12
        System.out.println("Enter N (> 1):");
        int n4 = scanner.nextInt();
        if (n4 > 1) {
            int divisor = 2;
            while (n4 % divisor != 0) divisor++;
            System.out.println("Найменший дільник: " + divisor);
        } else {
            System.out.println("N має бути більшим за 1.");
        }

        // Завдання 13
        int secret = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        System.out.println("Я загадав число від 1 до 100. Відгадайте!");
        int guess;
        do {
            System.out.println("Ваш варіант:");
            guess = scanner.nextInt();
            attempts++;
            if (guess < secret) System.out.println("Більше!");
            else if (guess > secret) System.out.println("Менше!");
        } while (guess != secret);
        System.out.println("Вгадано! Спроб: " + attempts);

        // Завдання 14
        int choice;
        do {
            System.out.println("\n1. Почати нову гру\n2. Завантажити збереження\n3. Налаштування\n0. Вихід");
            System.out.println("Ваш вибір:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> System.out.println("Запуск гри...");
                case 2 -> System.out.println("Завантаження...");
                case 3 -> System.out.println("Відкриття налаштувань...");
                case 0 -> System.out.println("Вихід із програми.");
                default -> System.out.println("Невірний пункт меню.");
            }
        } while (choice != 0);

        // Завдання 15
        int age;
        do {
            System.out.println("Введіть ваш вік (1-120):");
            age = scanner.nextInt();
        } while (age < 1 || age > 120);
        System.out.println("Вік підтверджено: " + age);

        // Завдання 16
        int correctPin = 1234, attempts2 = 0;
        boolean success = false;
        do {
            System.out.println("Введіть PIN-код:");
            int enteredPin = scanner.nextInt();
            attempts2++;
            if (enteredPin == correctPin) success = true;
        } while (!success && attempts2 < 3);
        System.out.println(success ? "Доступ надано." : "Картку заблоковано!");

        // Завдання 17
        char ans;
        do {
            System.out.println("Виконуємо обчислення...");
            System.out.println("Бажаєте продовжити? (y/n):");
            ans = scanner.next().charAt(0);
        } while (ans == 'y' || ans == 'Y');

        // Завдання 18
        int die1, die2, rolls = 0;
        do {
            die1 = (int) (Math.random() * 6) + 1;
            die2 = (int) (Math.random() * 6) + 1;
            rolls++;
            System.out.println("Кидок " + rolls + ": [" + die1 + "][" + die2 + "]");
        } while (die1 != die2);
        System.out.println("Дублі випали після " + rolls + " кидків.");

        // Завдання 19
        System.out.println("Введіть чисельник:");
        int numerator = scanner.nextInt();
        int denominator;
        do {
            System.out.println("Введіть ненульовий знаменник:");
            denominator = scanner.nextInt();
            if (denominator == 0) System.out.println("Знаменник не може дорівнювати нулю.");
        } while (denominator == 0);
        System.out.println("Результат ділення: " + ((double) numerator / denominator));

        // Завдання 20
        int sum3 = 0, count4 = 0;
        while (true) {
            System.out.print("Введіть оцінку (від’ємне число — завершити): ");
            int grade = scanner.nextInt();
            if (grade < 0) break;
            if (grade <= 100) {
                sum3 += grade;
                count4++;
            } else {
                System.out.println("Оцінка має бути не більшою за 100.");
            }
        }
        if (count4 > 0) {
            System.out.println("Кількість оцінок: " + count4);
            System.out.println("Середнє: " + ((double) sum3 / count4));
        } else {
            System.out.println("Оцінок не введено.");
        }

        // Завдання 21
        System.out.println("Введіть A та B:");
        int a = scanner.nextInt(), b = scanner.nextInt();
        for (int i = a; i <= b; i++) if (i % 2 == 0) System.out.println(i);

        // Завдання 22
        System.out.println("Введіть N (0-20):");
        int n5 = scanner.nextInt();
        if (n5 >= 0 && n5 <= 20) {
            long factorial = 1;
            for (int i = 1; i <= n5; i++) factorial *= i;
            System.out.println("Факторіал: " + factorial);
        } else {
            System.out.println("N має бути від 0 до 20.");
        }

        // Завдання 23
        for (int i = 1; i <= 10; i++) System.out.println(i + " " + (i * i) + " " + (i * i * i));

        // Завдання 24
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 || i % 5 == 0) continue;
            System.out.println(i);
        }

        // Завдання 25
        for (int i = 100; i <= 200; i++) {
            if (i % 13 == 0 && i % 7 == 0) {
                System.out.println("Знайдено: " + i);
                break;
            }
        }

            // Завдання 26
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                System.out.println(ch + " - " + (int) ch);
            }


            // Завдання 27
            System.out.println("Введіть N: ");
            int n6 = scanner.nextInt();
            int sum4 = 0;
            for (int i3 = 1; i3 <= n6; i3++) {
                if (i3 % 2 == 0) {
                    sum4 = sum4 - i3;
                } else {
                    sum4 = sum4 + i3;
                }
            }
            System.out.println("Сума: " + sum4);

            // Завдання 28
            System.out.println("Введіть a1: ");
            int a1 = scanner.nextInt();
            System.out.println("Введіть d: ");
            int d = scanner.nextInt();
            System.out.println("Введіть n: ");
            int n7 = scanner.nextInt();
            int sum8 = 0;
            for (int i2 = 0; i2 < n7; i2++) {
                int current = a1 + i2 * d;
                System.out.println(current);
                sum8 = sum8 + current;
            }
            System.out.println("Сума: " + sum8);

        // Завдання 29
        byte b2 = 125;
        for (int i = 1; i <= 6; i++) {
            b2 = (byte) (b2 + 1);
            System.out.println(b2);
        }


        // Завдання 30
        System.out.println("Введіть N: ");
        int n8 = scanner.nextInt();
        int sum9 = 0;
        for (int i = 1; i <= n8; i++) {
            int number = scanner.nextInt();
            sum9 = sum9 + number;
        }

        double average = n8 == 0 ? 0 : (double) sum9 / n8;
        double averageWithoutCasting = n8 == 0 ? 0 : sum9 / n8;
        System.out.println("З преведенням: " + average);
        System.out.println("Без приведення: " + averageWithoutCasting);


        // Завдання 31
        System.out.println("Введіть слово з 5 символів: ");
        String text2 = scanner.next();
        String encrypted = "";
        for (int i = 0; i < 5; i++) {
            char ch = text2.charAt(i);
            encrypted = encrypted + (char) (ch + 1);
        }

        System.out.println("Зашифровано: " + encrypted);


        // Завдання 32
        double price1 = 19.99;
        double price2 = 45.50;
        double price3 = 12.10;
        double price4 = 99.95;
        double price5 = 3.40;

        int hryvnias = (int) price1 + (int) price2 + (int) price3 + (int) price4 + (int) price5;
        double total = price1 + price2 + price3 + price4 + price5;
        int totalKopecks = (int) ((total - hryvnias) * 100);
        System.out.println("Цілі гривні: " + hryvnias);
        System.out.println("Відкинуті копійки: " + totalKopecks);


        // Завдання 33
        for (int i = 1; i <= 50; i++) {
            int percent = (int) (((double) i / 50) * 100);
            System.out.println("Завантажено: " + percent + "%");
        }


        // Завдання 34
        long bigNumber = 3_000_000_000L;
        int number = (int) bigNumber;
        System.out.println("long: " + bigNumber);
        System.out.println("int: " + number);


        // Завдання 35
        for (int i = 0; i <= 10; i++) {
            System.out.println(i / 10.0);
        }


        // Завдання 36
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j) + "\t");
            }

            System.out.println();
        }


        // Завдання 37
        System.out.println("Введіть висоту: ");
        int h = scanner.nextInt();
        System.out.println("Введіть гирину: ");
        int w1 = scanner.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w1; j++) {
                if (i == 1 || i == h || j == i || j == w1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }


        // Завдання 38
        System.out.println("Введіть N: ");
        int n0 = scanner.nextInt();
        for (int i = 1; i <= n0; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // Завдання 39
        System.out.println("Введіть N: ");
        int n10 = scanner.nextInt();
        for (int i = 2; i <= n10; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(i);
            }


        }

        // Завдання 40
        System.out.println("Введіть N: ");
        int n11 = scanner.nextInt();
        for (int i4 = 0; i4 < n11; i4++) {
            for (int j = 0; j < n11; j++) {
                if ((i4 + j) % 2 == 0) {
                    System.out.print("_");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
