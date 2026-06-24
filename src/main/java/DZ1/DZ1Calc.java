package DZ1;

import java.util.Scanner;

public class DZ1Calc {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String choice;

            do {
                // Ввод первого числа
                System.out.print("Введите первое число: ");
                double num1 = scanner.nextDouble();

                // Ввод оператора
                System.out.print("Введите оператор (+, -, *, /) или 'q' для выхода: ");
                char operator = scanner.next().charAt(0);

                // Проверка на выход
                if (operator == 'q' || operator == 'Q') {
                    System.out.println("Выход из калькулятора.");
                    break;
                }

                // Ввод второго числа
                System.out.print("Введите второе число: ");
                double num2 = scanner.nextDouble();

                double result = 0;
                boolean valid = true;

                // Выполнение операции
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Ошибка: деление на ноль!");
                            valid = false;
                        }
                        break;
                    default:
                        System.out.println("Неверный оператор!");
                        valid = false;
                        break;
                }

                // Вывод результата, если операция была корректной
                if (valid) {
                    System.out.println("Результат: " + num1 + " " + operator + " " + num2 + " = " + result);
                }

                System.out.println(); // пустая строка для разделения

            } while (true); // Бесконечный цикл, выход через break

            scanner.close();

        }
    }

