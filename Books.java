package labOne;

import java.util.Arrays;

public class Books {

    private String nameOfBook;

    private PublishingHouses name;

    private int yearOfRelease;

    private String[] allAuthors;

    public Books(String nameOfBook, int yearOfRelease, PublishingHouses name) throws Exception {

        if (nameOfBook != null) {

            this.nameOfBook = nameOfBook;

        } else {

            throw new Exception("Введите название книги, отличное от " + null);

        }

        if (yearOfRelease > 0) {

            this.yearOfRelease = yearOfRelease;

        } else {

            throw new Exception("Введите год издания больше нуля");

        }

        if (name != null) {

            this.name = name;

        } else {

            throw new Exception("Введите значение, отличное от " + null);

        }

    }

    public Books(String nameOfBook, String author, int yearOfRelease, PublishingHouses name) throws Exception {

        if (nameOfBook != null) {

            this.nameOfBook = nameOfBook;

        } else {

            throw new Exception("Введите название книги, отличное от " + null);

        }


        if (author != null) {

            this.allAuthors = new String[]{author};            // присваивание упрощено и записано одной строкой, а не тремя

        } else {

            throw new Exception("Введите имя автора, отличное от " + null);

        }


        if (yearOfRelease > 0) {

            this.yearOfRelease = yearOfRelease;

        } else {

            throw new Exception("Введите год издания больше нуля");

        }

        if (name != null) {

            this.name = name;

        } else {

            throw new Exception("Введите значение, отличное от " + null);

        }

    }

    public Books(String nameOfBook, String[] allAuthors, int yearOfRelease, PublishingHouses name) throws Exception {

        if (nameOfBook != null) {

            this.nameOfBook = nameOfBook;

        } else {

            throw new Exception("Введите название книги, отличное от " + null);

        }

        for (String allAuthor : allAuthors) {

            if (allAuthor == null) {                                                  // код проверки на пустые ссылки сокращен

                throw new Exception("Массив авторов содержит пустые ссылки");

            } else {

                this.allAuthors = allAuthors;

            }
        }

        if (yearOfRelease > 0) {

            this.yearOfRelease = yearOfRelease;

        } else {

            throw new Exception("Введите год издания больше нуля");

        }

        if (name != null) {

            this.name = name;

        } else {

            throw new Exception("Введите значение, отличное от " + null);

        }

    }

    public void print() {

        System.out.println("Название книги : " + nameOfBook);

        if (allAuthors != null) {
            System.out.println("Авторы книги : " + Arrays.toString(allAuthors)
                    .replace("[", "")
                    .replace("]", "")
            );
        }

        System.out.println("Издательство : " + name.getNameOfPublishingHouse() + ", " + name.getCity() + "\n" +             //  вместо двух методов println использован один

                           "Год издания : " + yearOfRelease);

        // System.out.println("Год издания : " + yearOfRelease);

    }

    public static void printAll(Books[] books) {

        for (Books book : books) {

            book.print();

        }

    }

    public String getNameOfBook() {

        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) throws Exception {

        if (nameOfBook != null) {

            this.nameOfBook = nameOfBook;

        } else {

            throw new Exception("Введите название книги, отличное от " + null);

        }

    }

    public PublishingHouses getName() {

        return name;
    }

    public void setName(PublishingHouses name) throws Exception {

        if (name != null) {

            this.name = name;

        } else {

            throw new Exception("Введите издательство, отличное от " + null);

        }

    }

    public int getYearOfRelease() {

        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) throws Exception {

        if (yearOfRelease > 0) {

            this.yearOfRelease = yearOfRelease;

        } else {

            throw new Exception("Введите год издания больше нуля");

        }
    }

    public String[] getAuthors() {

        return allAuthors;
    }

    public void setAllAuthors(String[] allAuthors) throws Exception {

        for (String allAuthor : allAuthors) {

            if (allAuthor == null) {                                                  // код проверки на пустые ссылки сокращен

                throw new Exception("Массив авторов содержит пустые ссылки");

            } else {

                this.allAuthors = allAuthors;

            }
        }

    }

    public int getNumberAllAuthors() {           // метод, возвращающий количество авторов книги

        return allAuthors.length;

    }

    public String getAuthor(int indexAuthor) throws Exception {                          // метод, возращающий автора по заданному индексу

        String author = "";

        if (indexAuthor >= 0 && indexAuthor < allAuthors.length) {

            for (int i = 0; i < allAuthors.length; i++) {

                if (indexAuthor == i) {

                    return allAuthors[i];

                }

            }

        } else {

            throw new Exception("Веден неккоректный индекс автора");

        }

        return author;

    }

}

