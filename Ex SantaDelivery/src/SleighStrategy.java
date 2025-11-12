public class SleighStrategy implements DeliveryStrategy{
    public void deliverGift(Child child, Gift gift){
        System.out.println("DeliverGift by Sleigh to "+ child.getName());
    }

}
