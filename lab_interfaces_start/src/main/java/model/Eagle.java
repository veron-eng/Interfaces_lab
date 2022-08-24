package model;

import model.interfaces.IAnimal;
import model.interfaces.IFly;
import model.interfaces.IHunt;
import model.interfaces.ISleep;

public class Eagle  implements IFly, IHunt, IAnimal, ISleep {

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

   // @Override
    public void hunt() {
        System.out.println("Eagle is flying");
    }

    public void animal(){
        System.out.println("Eagle is an animal");
    }

    public void eat(){
        System.out.println("eagle is eating");
    }



    public void sleep(){
    System.out.println("eagle is sleeping");
    }
}
