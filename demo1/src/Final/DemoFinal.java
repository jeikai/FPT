package Final;

class Father {
    final void printFather() {
        System.out.println("Cha của bạn là.....");
    }
}

public class DemoFinal extends Father{
    final String name;
    static final int age;
    DemoFinal() {
        name = "Phúc Trần";
    }
    static {
        age = 10;
    }
    //lỗi không thể override phương thức final
//    @Override
//    void printFather() {
//
//    }
    public static void main(String[] args) {
        DemoFinal demo1 = new DemoFinal();
        System.out.println(demo1.name + " có tuổi là: " + demo1.age);
    }
}
