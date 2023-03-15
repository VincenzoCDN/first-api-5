package co.develhope.firstapi5.DTO;


import javax.validation.constraints.NotBlank;



public class CarDTO {
    @NotBlank (message="Mandatory!")
    private String id;
    @NotBlank (message="Mandatory!")
    private String modelName;
    private double price;


    public CarDTO(String ciao, String s) {

    }

    public CarDTO(String id, String modelName, double price) {
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getModelName() {
        return modelName;
    }

    public double getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "id: " + id + ". Name: " + modelName + ". Price: " + price + "€.";
    }
}
