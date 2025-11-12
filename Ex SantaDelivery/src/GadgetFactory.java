

public class GadgetFactory {

    private Gadget gadget;

    public GadgetFactory(){
        this.gadget = new Gadget();
        this.gadget.setName("DooHickey");
        this.gadget.setManufacturer("ACME");
        this.gadget.setPrice(10000000);
        this.gadget.setWeight(1);
    }

    public GadgetFactory(int type){
        this.gadget = new Gadget();
        if (type == 1){
            this.gadget.setWeight(10.0f);
        }
        else if (type == 2){
            this.gadget.setWeight(50.5f);
        }
        else if (type == 3){
            this.gadget.setWeight(100.1f);
        }
        else {
            this.gadget.setWeight(0);
        }
    }

    public Gadget getGadget() {
        return gadget;
    }

}
