package model;

import model.interfaces.*;

public class Puffin implements IAnimal, IFly, ISwim, IPrey, ISleep {
    //@Override
    public void eat() {
        System.out.println("Puffin is eating");
    }

    //@Override
    public void sleep() {
        System.out.println("Puffin is eating");
    }



    @Override
    public void fly() {
        System.out.println("Puffin is flying");
    }

    @Override
    public void swim() {
        System.out.println("Puffin is swimming");
    }

    //@Override
    public void flee() {
        System.out.println("Puffin is fleeing from preditor");
    }

    public void animal(){
        System.out.println("Puffin is an animal");
    }

    public void prey(){
        System.out.println("puffin is being hunted");
    }
}
