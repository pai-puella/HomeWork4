
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int age = 22;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println();
        System.out.println("Задача 2");
        int tempOut = 14;

        if (tempOut < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        System.out.println("На улице " + tempOut + " градусов");
        }
    }