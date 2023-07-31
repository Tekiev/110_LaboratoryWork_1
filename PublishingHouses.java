package labOne;

public class PublishingHouses {

    private String nameOfPublishingHouse;

    private String city;

    public PublishingHouses (String nameOfPublishingHouse, String city) throws Exception {

        if (nameOfPublishingHouse != null) {

            this.nameOfPublishingHouse = nameOfPublishingHouse;

        } else {

            throw new Exception ("Введите название издательства, отличное от " + null);                        // сообщение об ошибке реализовано с помощью создания исключения

        }

        if (city != null) {

            this.city = city;

        } else {

            throw new Exception ("Введите название города, отличное от " + null);

        }

    }

    public String getNameOfPublishingHouse() {

        return nameOfPublishingHouse;
    }

    public void setNameOfPublishingHouse (String nameOfPublishingHouse) throws Exception {

        if (nameOfPublishingHouse != null) {

            this.nameOfPublishingHouse = nameOfPublishingHouse;

        } else {

            throw new Exception ("Введите название издательства, отличное от " + null);

        }

    }

    public String getCity() {

        return city;
    }

    public void setCity (String city) throws Exception {

        if (city != null) {

            this.city = city;

        } else {

            throw new Exception ("Введите название города, отличное от " + null);

        }

    }

}
