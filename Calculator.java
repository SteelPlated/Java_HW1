import java.util.Scanner;

public class Calculator {
    public static void main(String args[])
    {
        float a, b, res;
        char choice;
        Scanner scan = new Scanner(System.in);

        do
        {
            System.out.print("1. Сложение\n");
            System.out.print("2. Вычитание\n");
            System.out.print("3. Умножение\n");
            System.out.print("4. Деление\n");
            System.out.print("5. Выход\n\n");
            System.out.print("Введите номер действия : ");
            choice = scan.next().charAt(0);
            switch(choice)
            {
                case '1' :
                System.out.print("Введите первое число : ");
                a = scan.nextFloat();
                System.out.print("Введите второе число : ");
                b = scan.nextFloat();
                res = a + b;
                System.out.print("Ответ = " + res);
                break;
                case '2' :
                System.out.print("Введите первое число : ");
                a = scan.nextFloat();
                System.out.print("Введите второе число : ");
                b = scan.nextFloat();
                res = a - b;
                System.out.print("Ответ = " + res);
                break;
                case '3' :
                System.out.print("Введите первое число : ");
                a = scan.nextFloat();
                System.out.print("Введите второе число : ");
                b = scan.nextFloat();
                res = a * b;
                System.out.print("Ответ = " + res);
                break;
                case '4' :
                System.out.print("Введите первое число : ");
                a = scan.nextFloat();
                System.out.print("Введите второе число : ");
                b = scan.nextFloat();
                res = a / b;
                System.out.print("Ответ = " + res);
                break;
                case '5' :
                System.exit(0);
                break;
                default : System.out.print("Неверное действие!!!");
                break;
            }
            System.out.print("\n---------------------------------------\n");
        }while(choice != 5);
    }
}
