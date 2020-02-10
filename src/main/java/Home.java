import java.util.ArrayList;
public class Home {
        ArrayList<Animal> pet_Storage = new ArrayList<Animal>();

    public void adoptPet(Animal animal) {
        pet_Storage.add(animal);

    }

      public   void makeAllSounds(){
            for(Animal a: pet_Storage){
                a.Sound();
            }


        }


}

