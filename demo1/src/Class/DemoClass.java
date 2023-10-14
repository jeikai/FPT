package Class;
class Address {
    String address;
    int postcode;
    Address() {
        System.out.println("This is constructor of Address Class");
    }
    public int getPostcode() {
        return postcode;
    }
}
public class DemoClass extends Address{
    private String name;
    private int age;
    public DemoClass() {
        super();
        name = "Phúc";
        System.out.println("This is Constructor of Demo Class");
    }
    public DemoClass(String _name) {
        this();
        System.out.println("This is Constructor with parameter name: " + _name);
    }
    public String getName() {
        return name;
    }

    public String getName(String partner) {
        return name + " get marriaged with " + partner;
    }

    @Override
    public int getPostcode() {
        return super.postcode;
    }
    public static void main(String[] args) {
        DemoClass demo1 = new DemoClass("Quang Phúc");
        System.out.println(demo1.getName());
        demo1.name = "Quang phú";
        System.out.println(demo1.getName("Thuy"));
    }
}
