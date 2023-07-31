package labOne;

public class Main {

    public static void main(String[] args) {

        System.out.println("Лабораторная №1: классы-модели");

        System.out.println();

        System.out.println("1. Страны");

        System.out.println();

        try {                                                                                                      // код, где может возникнуть исключение

            Countries[] arrayCountries = {

                    new Countries("Russia", 17_100_000, 146_700_000, "Moscow", 12_600_000),

                    new Countries("Finland", 338_000, 5_500_000, "Helsinki", 665_000),

                    new Countries("France", 643_800, 67_800_000, "Paris", 2_100_000),

                    new Countries("Andorra", 467, 85_400, "Andorra la Villa", 22_600),

                    new Countries("Singapore", 725, 5_700_000),

                    new Countries("Nigeria", 923_000, "Abuja")

            };

            //  arrayCountries [0].setNameOfCountry(null);                               // закомментированные строки для проверки работы  методов

            // arrayCountries[0].setSquareOfCountry(0);

            //  arrayCountries[0].setPopulationOfCountry(0);

            // arrayCountries[0].setCapitalOfCountry(null);

            //  arrayCountries[0].setPopulationOfCapital(0);

            Countries.printAll(arrayCountries);

        } catch (
                Exception e) {                                                  // обработка случая, при возникновении исключения

            System.out.println(e);

        }

        System.out.println();

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("2. Книги");

        System.out.println();

        try {

            PublishingHouses prospect = new PublishingHouses("Проспект", "Москва");

            PublishingHouses piter = new PublishingHouses("Питер", "Санкт-Петербург");

            PublishingHouses bhv = new PublishingHouses("БХВ", "Санкт-Петебург");

            PublishingHouses dialect = new PublishingHouses("Диалектика", "Киев");

            Books[] arrayBooks = {

                    new Books("Computer Science: основы программирования на Java, ООП, алгоритмы и структуры данных", new String[]{"Седжвик Роберт", "Уэйн Кевин"}, 2018, piter),

                    new Books("Разработка требований к программному обеспечению. 3-е издание, дополненное", "Вигерс Карл", 2019, bhv),

                    new Books("Java. Полное руководство, 10-е издание", "Шилт Герберт", 2018, dialect),

                    new Books("C/C++. Процедурное программирование", "Полубенцева М.И.", 2017, bhv),

                    new Books("Конституция РФ", 2020, prospect)

            };

             // arrayBooks[0].setNameOfBook(null);                        // закомментированные строки для проверки работы  методов

            // arrayBooks[0].setName(null);

            // arrayBooks[0].setAllAuthors(new String[]{"Седжвик Роберт", "Уэйн Кевин", null});


            Books.printAll(arrayBooks);

            for (int i = 0; i < arrayBooks.length; i++) {

                if ((arrayBooks[1].getName().getNameOfPublishingHouse()).equals("БХВ")) {

                    arrayBooks[1].getName().setCity("Санкт-Петербург");

                }

            }

            System.out.println();

            System.out.println("При вводе информации об издательстве БХВ была допущена ошибка, название города данного издательства откорректировано для всех книг");

            System.out.println();

            Books.printAll(arrayBooks);

        } catch (Exception e) {

            System.out.println(e);

        }

    }

}
