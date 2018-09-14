package comp;

class Dog extends Animal{
    @Override
    public void move() {
        System.out.println("Dogs can walk and run");
    }

    public void moveSuper(){
        super.move();
    }
}

class Animal{
    public void move(){
        System.out.println("Animals can move");
    }
}

public class tesInheritance{
    public static void main(String args[]){
        Animal a = new Animal();
        Animal b = new Dog();
        Dog c = new Dog();

        a.move();
        b.move();
        c.move();
        c.moveSuper();

        System.out.println(c instanceof Animal);
        System.out.print("");
    }
}
