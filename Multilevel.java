class animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends animal{
    @Override
    void eat(){
        super.eat();
        System.out.println("Dog is barking");
    }
}
class cat extends animal{
    @Override
    void eat(){
        super.eat();
        System.out.println("Cat is meowing");
    }
}
class Multilevel{
    public static void main(String[] args) {
        Dog dog = new Dog();
        cat Cat = new cat();
        dog.eat();
        Cat.eat();
    }
    
}