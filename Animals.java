package Lesson5;

public class Animals {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.run(500));
        System.out.println(dog.jump(0.5));
        System.out.println(dog.swim(10));
        cat.swim(9);
        System.out.println(cat.jump(2));
        System.out.println(cat.run(200));
    }
}