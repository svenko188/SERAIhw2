public class BoatStrategy implements DeliveryStrategy{
    public void deliverGift(Child child){
        System.out.println("DeliverGift by Boat to "+ child.getName());
    }
}
