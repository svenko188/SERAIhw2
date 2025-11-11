public class DroneStrategy implements DeliveryStrategy{
    public void deliverGift(Child child){
        System.out.println("DeliverGift by Drone to "+ child.getName());
    }
}
