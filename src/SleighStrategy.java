public class SleighStrategy implements DeliveryStrategy{
    public void deliverGift(Child child){
        System.out.println("DeliverGift by Sleigh to "+ child.getName());
    }

}
