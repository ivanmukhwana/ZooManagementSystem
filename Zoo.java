public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Lion("Leo", 5);
        Animal elephant = new Elephant("Dumbo", 10);
        Animal monkey = new Monkey("George", 3);

        lion.makeSound();
        lion.eat();
        elephant.makeSound();
        elephant.eat();
        monkey.makeSound();
        monkey.eat();

        // Demonstrating polymorphism with overloaded methods
        lion.makeSound(3);
        elephant.eat("leaves");
        monkey.eat("nuts");
    }
}


