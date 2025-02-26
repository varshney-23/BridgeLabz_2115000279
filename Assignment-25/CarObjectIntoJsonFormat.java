import com.fasterxml.jackson.databind.ObjectMapper;

class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
}

public class CarObjectIntoJsonFormat {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Car car = new Car("Tesla", "Model S", 2023);
        String json = mapper.writeValueAsString(car);
        System.out.println(json);
    }
}
