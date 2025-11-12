

public class Gadget extends Gift implements GadgetInterface {

    private String manufacturer;
    private int price;
    private float weight;


    @Override
    public void sendMessage() {
        System.out.println("I am a Gadget made by" + this.manufacturer);
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


