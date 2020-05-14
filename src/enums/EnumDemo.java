package enums;

public class EnumDemo {
    public static void main(String[] args) {
        Apple apple;

        apple = Apple.RedDel;

        // вывести значение перечислимого типа
        System.out.println("Значение apple " + apple);
        System.out.println();

        apple = Apple.Golden;

        if (apple == Apple.Golden) {
            System.out.println("Переменная apple содержит Golden \n");
        }

        switch (apple) {
            case Jonathan:
                System.out.println("Сорт Jonathan красный");
                break;
            case Golden:
                System.out.println("Сорт Golden желтый");
                break;
            case RedDel:
                System.out.println("Сорт Reddel желтый");
                break;
        }

        for (Apple a : Apple.values()) {
            System.out.println(a + " стоит " + a.getPrice() + " " + a.ordinal());
        }

        apple = Apple.valueOf("Winesap");
        System.out.println("Переменная apple содержит " + apple.getPrice());
    }
}
