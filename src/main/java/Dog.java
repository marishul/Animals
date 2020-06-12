public class Dog extends Animal {

    Dog(String type, String name, int age) {
        super(type, name, age);
    }

    @Override
    public String toString() {
        return "I am " + type + ", my name is " + name + ", age is " + age;
    }

    public void say() {
        System.out.println("I say Bark!");
    }
}
