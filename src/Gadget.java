

public class Gadget implements GadgetInterface {

    private String name;
    private String manufacturer;
    private int price;
    private float weight;


    @Override
    public void sendMessage() {
        System.out.println("I am " + this.name + "and  I'm made by" + this.manufacturer);
    }


    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }




    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}


