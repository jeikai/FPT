package InitializerBlock;

class Animal {
    String type;
    Animal() {
        System.out.println("Đây là constructor của Animal");
    }
}
public class DemoInitializerBlock extends Animal{
    int age;
    DemoInitializerBlock() {
        super();
        age = 10;
        System.out.println("Đây là constructor của DemoInitializerBlock có thuộc tính age lúc này bằng: " + age);
    }
    { System.out.println(age); }
    public static void main(String[] args) {
        DemoInitializerBlock demo1 = new DemoInitializerBlock();
    }

}
