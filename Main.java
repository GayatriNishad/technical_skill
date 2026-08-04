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
class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
    
}