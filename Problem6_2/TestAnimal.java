package Problem6_2;

public class TestAnimal {
    public static void main(String[] args) {
        // Using the Subclasses
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting();

        // Using Polymorphism
        Animal animal1 = new Cat();
        animal1.greeting();
        Animal animal2 = new Dog();
        animal2.greeting();
        Animal animal3 = new BigDog();
        animal3.greeting();
        //Problem6_2.Animal animal4 = new Problem6_2.Animal(); // ERROR- Problem6_2.Animal class can not create its own object, it is the blueprint that subclasses use to create objects

        // Downcast
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
        // Problem6_2.Cat cat2 = (Problem6_2.Cat)animal2; // ERROR / INVALID CAST - animal2 references a Problem6_2.Dog object and cannot cast to Problem6_2.Cat as Problem6_2.Dog is not a subclass or instance of Problem6_2.Cat
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(bigDog2);
        bigDog2.greeting(dog2);
        bigDog2.greeting(bigDog1);

    }
}
