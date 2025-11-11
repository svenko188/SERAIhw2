public class Child {


    private String name;
    private int age;
    private String location;
    private String giftPref;


    public Child(String name, int age, String location, String giftPref) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.giftPref = giftPref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGiftPref() {
        return giftPref;
    }

    public void setGiftPref(String giftPref) {
        this.giftPref = giftPref;
    }
}
