import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        // 1. Создаем актеров, режиссеров и авторов
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 185);
        Actor actor2 = new Actor("Анна", "Петрова", Gender.FEMALE, 170);
        Actor actor3 = new Actor("Сергей", "Сидоров", Gender.MALE, 175);

        Director dir1 = new Director("Константин", "Станиславский", Gender.MALE, 50);
        Director dir2 = new Director("Владимир", "Немирович-Данченко", Gender.MALE, 45);

        Person musicAuthor = new Person( "Пётр", " Чайковский", Gender.MALE);
        Person choreographer = new Person("Мариус", " Петипа", Gender.MALE);

        // 2. Создаем три спектакля
        Show drama = new Show("Гамлет", 120, dir1, new ArrayList<>());
        Opera opera = new Opera("Евгений Онегин", 180, dir2, new ArrayList<>(), musicAuthor, "По Пушкину", 40);
        Ballet ballet = new Ballet("Лебединое озеро", 150, dir1, new ArrayList<>(), musicAuthor, "История Одетты", choreographer);

        // 3. Распределяем актёров
        drama.addActor(actor1);
        drama.addActor(actor2);

        opera.addActor(actor2);
        opera.addActor(actor3);

        ballet.addActor(actor1);
        ballet.addActor(actor3);

        // 4. Выводим списки актёров
        System.out.println("--- СПИСКИ АКТЕРОВ ---");
        drama.printCast();
        opera.printCast();
        ballet.printCast();

        // 5. Заменяем актёра в Гамлете (Иванова на Сидорова) и выводим список
        System.out.println("\n--- ЗАМЕНА В ГАМЛЕТЕ ---");
        drama.replaceActor(actor1, actor3);
        drama.printCast();

        // 6. Пробуем заменить несуществующего актёра в Опере
        System.out.println("\n--- ТЕСТ ОШИБКИ ЗАМЕНЫ ---");
        Actor ghostActor = new Actor("Призрак", "Оперы", Gender.MALE, 190);
        opera.replaceActor(ghostActor, actor1);

        // 7. Выводим либретто для оперы и балета
        System.out.println("\n--- ЛИБРЕТТО ---");
        System.out.println(opera);//opera.printLibretto();
        System.out.println(ballet);//ballet.printLibretto();
    }
}
