import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задача 1
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ",то он совершеннолетний");
        }
        if (age <18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия и нужно немного подождать");
        }
        // Задача 2 без Else
        int temperature = 6;
        if (temperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        System.out.println("На улице " + temperature + " градусов, можно идти без шапки");

        // Задача 2 с Else
        int temperature2 = 4;
        if (temperature2 >5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        System.out.println("На улице " + temperature2 + " градуса, нужно надеть шапку");

        // Задача 3
        int speed = 61;
        if (speed <60) {
            System.out.println("Можно ездить спокойно");
        }
        if (speed >60) {
            System.out.println("Придётся заплатить штраф");
        }
        System.out.println("Если скорость " + speed + ", то придётся заплатить штраф");

        int speed2 = 59;
        if (speed2 <60) {
            System.out.println("Можно ездить спокойно");
        } else {
            System.out.println("Придётся заплатить штраф");
        }
        System.out.println("Если скорость " + speed2 + ", то можно ездить спокойно");

        // Задача 4
        int newage = 25;
        if (newage >= 2 && newage <= 6) {
            System.out.println("Нужно ходить в детский сад");
        }
        if (newage >= 7 && newage <=18) {
            System.out.println("Нужно ходить в школу");
        }
        if (newage > 18 && newage < 24) {
            System.out.println("Нужно ходить в университет");
        }
        if (newage >=24) {
            System.out.println("Нужно ходить на работу");
        }
        System.out.println("Если возраст человека равен " + newage + ",то ему нужно ходить на работу ");

        // Задача 5
        int ages = 4;
        if (ages < 5) {
            System.out.println("Нельзя кататься на аттракционе");
        }
        if (ages > 5 && ages < 14) {
            System.out.println("Можно кататься в сопровождении");
        }
        if (ages > 14) {
            System.out.println("Можно кататься без сопровождения");
        }
        System.out.println("Если возраст ребёнка равен " + ages + ",то ему нельзя кататься на аттракционе");

        // Задача 5 с else
        int vozrast = 17;
        if (vozrast < 5 || vozrast > 5 && vozrast <14) {
            System.out.println("Нельзя кататься на аттракционе");
        } else {
            System.out.println("Можно кататься в сопровождении");
        }
        if (vozrast > 14) {
            System.out.println("Можно кататься без сопровождения");
        }
        System.out.println("Если возраст ребёнка равен " + vozrast + ",то ему можно кататься на аттракционе без сопровождения");

        // Задача 6
        int totalSeats = 102;
        int seat = 60;
        int stand = totalSeats - seat;
        int usedSeat = 60;
        int usedStand = 42;
        System.out.println("Всего стоячих мест в вагоне- " + stand);
        if (usedSeat < 60) {
            System.out.println("Сидячие места в вагоне есть");
        } else if (usedSeat >= 60) {
            System.out.println("Сидячих мест в вагоне нет");
            if (usedStand < 42) {
                System.out.println("Стоячие места в вагоне есть");
            } else if (usedStand >= 42) {
                System.out.println("Стоячих мест в вагоне нет");
                System.out.println("В вагоне занято  " + (usedSeat + usedStand) + " места. Свободных мест нет");
            }
            // Задача 7
            int one = 1345;
            int two = 256;
            int three = 178;
            if (one > two) {
                if (one >= three) {
                    System.out.println("Максимальное число-" + one);
                } else {
                    System.out.println("Максимальное число-" + three);
                }
            } else if (two > one) {
                if (two >= three) {
                    System.out.println("Максимальное число-" + two);
                } else {
                    System.out.println("Максимальное число-" + three);
                }
            } else {
                if (one > three) {
                    System.out.println("Максимальное число-" + one);
                } else if (three > one) {
                    System.out.println("Максимальное число-" + three);
                } else {
                    System.out.println("Все три числа равны!");
                }
            }
        }      }   }