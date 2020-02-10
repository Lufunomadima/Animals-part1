public class Main {
    public static void main(String[] args) {
//
        Home home = new Home();
        Dog d = new Dog();
        Cat c = new Cat();

        d.setName("Rax");
        d.eat();
        d.Sound();


        c.setName("Stormy");
        c.eat();
        c.Sound();

        home.makeAllSounds();
        home.adoptPet(d);
        home.makeAllSounds();
        System.out.println(".............");
        home.adoptPet(c);
        home.makeAllSounds();





    }


}


