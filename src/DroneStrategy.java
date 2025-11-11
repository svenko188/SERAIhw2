public class DroneStrategy implements DeliveryStrategy{
    public void deliverGift(Child child, Gift gift){

        System.out.println("Deliver "+ gift.getName()+ " by Drone to "+ child.getName());
    }
}
