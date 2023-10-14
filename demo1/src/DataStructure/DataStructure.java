package DataStructure;

enum Season {
    spring, summer, autumn, winter
}
enum Person {
    USERNAME("Phúc"), AGE(10);

    private Object value;

    private Person(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}

public class DataStructure {
    public static void main(String[] args) {
        Season day = Season.autumn;
        System.out.println(day);

        Person username = Person.USERNAME;
        Person age = Person.AGE;

        System.out.println("Username: " + username.getValue());
        System.out.println("Age: " + age.getValue());

    }
}
