package web.model;

public class Car {
    private int id;
    private String model;
    private String Country;

    public Car(int id, String model, String Country) {
        this.id = id;
        this.model = model;
        this.Country = Country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        this.Country = country;
    }

    @Override
    public String toString() {
        return String.format("Car [id = %d, model = %s, ProducingCountry = %s", id, model, Country);
    }


}
