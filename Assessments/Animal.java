package Assessments;
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
    }
}



