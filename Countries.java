package labOne;

import java.io.IOException;

public class Countries {

    private String nameOfCountry;

    private int squareOfCountry;

    private int populationOfCountry;

    private String capitalOfCountry;

    private int populationOfCapital;

    public Countries(String nameOfCountry, int squareOfCountry, int populationOfCountry, String capitalOfCountry, int populationOfCapital) throws Exception { // конструктор, инициализирующий значение всех полей объекта с проверкой принимаемых аргументов

        if (nameOfCountry != null) {

            this.nameOfCountry = nameOfCountry;

        } else {

            throw new Exception("Введите название страны, отличное от " + null);      // сообщение об ошибке реализовано с помощью создания исключения

        }

        if (squareOfCountry > 0) {

            this.squareOfCountry = squareOfCountry;

        } else {

            throw new Exception("Введите значение площади страны больше нуля");

        }

        if (populationOfCountry > 0) {

            this.populationOfCountry = populationOfCountry;

        } else {

            throw new Exception("Введите количество населения страны больше нуля");

        }

        if (capitalOfCountry != null) {

            this.capitalOfCountry = capitalOfCountry;

        } else {

            throw new Exception("Введите название столицы, отличное от " + null);

        }

        if (populationOfCapital > 0) {

            this.populationOfCapital = populationOfCapital;

        } else {

            throw new Exception("Введите количество населения столицы больше нуля");

        }

    }

    public Countries(String nameOfCountry, int squareOfCountry, int populationOfCountry) throws Exception { // конструктор для горовдов-государств с проверкой принимаемых аргументов

        if (nameOfCountry != null) {

            this.nameOfCountry = nameOfCountry;

        } else {

            throw new Exception("Введите название страны, отличное от " + null);

        }

        if (squareOfCountry > 0) {

            this.squareOfCountry = squareOfCountry;

        } else {

            throw new Exception("Введите значение площади страны больше нуля");

        }

        if (populationOfCountry > 0) {

            this.populationOfCountry = populationOfCountry;

        } else {

            throw new Exception("Введите количество населения страны больше нуля");

        }

    }

    public Countries(String nameOfCountry, int squareOfCountry, String capitalOfCountry) throws Exception {  // доработанный конструктор, для случая когда население страны и столицы неизвестно с проверкой принимаемых аргументов

        if (nameOfCountry != null) {

            this.nameOfCountry = nameOfCountry;

        } else {

            throw new Exception("Введите название страны, отличное от " + null);

        }

        if (squareOfCountry > 0) {

            this.squareOfCountry = squareOfCountry;

        } else {

            throw new Exception("Введите значение площади страны больше нуля");

        }

        this.capitalOfCountry = capitalOfCountry;

    }

    public void resetCapital()                                                                     // метод, задающий/сбрасывающий данные о столице

    {

        capitalOfCountry = null;

    }

    public void print() {

        //  System.out.println("Название страны : " + nameOfCountry);                               //  вместо двух методов println использован один

        System.out.println("Название страны : " + nameOfCountry + "\n" +

                           "Площадь страны : "  + squareOfCountry + " кв. км.");

        if (populationOfCountry != 0) {

            System.out.println("Численность населения страны : " + populationOfCountry + " человек");

        }

        if (capitalOfCountry != null) {

            System.out.println("Столица страны : " + capitalOfCountry);

            if (populationOfCapital != 0) {

                System.out.println("Численность населения столицы : " + populationOfCapital + " человек");

            }

        }

    }

    public static void printAll(Countries[] countries) {

        for (Countries country : countries) {

            country.print();

        }

    }

    public String getNameOfCountry() {

        return nameOfCountry;
    }

    public void setNameOfCountry(String nameOfCountry) throws Exception {

        if (nameOfCountry != null) {

            this.nameOfCountry = nameOfCountry;

        } else {

            throw new Exception("Введите название страны, отличное от " + null);

        }

    }

    public int getSquareOfCountry() {

        return squareOfCountry;
    }

    public void setSquareOfCountry(int squareOfCountry) throws Exception {

        if (squareOfCountry > 0) {

            this.squareOfCountry = squareOfCountry;

        } else {

            throw new Exception("Введите значение площади страны больше нуля");

        }
    }

    public int getPopulationOfCountry() {

        return populationOfCountry;
    }

    public void setPopulationOfCountry(int populationOfCountry) throws Exception {

        if (populationOfCountry > 0) {

            this.populationOfCountry = populationOfCountry;

        } else {

            throw new Exception("Введите количество населения страны больше нуля");

        }
    }

    public String getCapitalOfCountry() {

        return capitalOfCountry;
    }

    public void setCapitalOfCountry(String capitalOfCountry) throws Exception {

        if (capitalOfCountry != null) {

            this.capitalOfCountry = capitalOfCountry;

        } else {

            throw new Exception("Введите название столицы, отличное от " + null);

        }
    }

    public int getPopulationOfCapital() {

        return populationOfCapital;
    }

    public void setPopulationOfCapital(int populationOfCapital) throws Exception {

        if (populationOfCapital > 0) {

            this.populationOfCapital = populationOfCapital;

        } else {

            throw new Exception("Введите количество населения столицы больше нуля");

        }
    }

    public String getPopulationDensity() {

        String str = "";

        if (populationOfCountry != 0) {

            str = "Плотность населения страны " + nameOfCountry + ": " + (populationOfCountry / squareOfCountry) + " человек на кв. км.";

        } else {

            str = "Плотность населения страны неизвестна";

        }

        return str;

    }

}




