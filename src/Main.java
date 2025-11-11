import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        int b = 2;
        int c = 3;
        BookFactory bookFactory1 = new BookFactory(a);
        bookFactory1.getBook().readBook();


        BookFactory bookFactory2 = new BookFactory(b);
        bookFactory2.getBook().readBook();

        BookFactory bookFactory3 = new BookFactory(c);
        bookFactory3.getBook().readBook();



        GadgetFactory gadgetFactory1 = new GadgetFactory(a);
        System.out.println(gadgetFactory1.getGadget().getWeight());

        GadgetFactory gadgetFactory2 = new GadgetFactory(b);
        System.out.println(gadgetFactory2.getGadget().getWeight());

        GadgetFactory gadgetFactory3 = new GadgetFactory(c);
        System.out.println(gadgetFactory3.getGadget().getWeight());



        String location = null;

        List<Child> LsChild =  new ArrayList<>();

        for (int i=0; i<=5;i++) {
            Child child = new Child("name"+i,i,"City","Gadget");
            LsChild.add(child);
        }

        for (int i=6; i<=10;i++) {
            if (i<=8) {
                location = "Island";
            }
            else{location = "Mountain";}
            Child child = new Child("name"+i,i,location,"Book");
            LsChild.add(child);
        }

        for (Child child : LsChild) {
            if(child.getLocation().equals("Island")){
                DeliveryContext deliveryContext = new DeliveryContext(new BoatStrategy());
                deliveryContext.deliverGift(child);
            }
            else if(child.getLocation().equals("Mountain")){
                DeliveryContext deliveryContext = new DeliveryContext(new SleighStrategy());
                deliveryContext.deliverGift(child);
            }
            else if(child.getLocation().equals("City")){
                DeliveryContext deliveryContext = new DeliveryContext(new DroneStrategy());
                deliveryContext.deliverGift(child);
            }
        }
    }
}
