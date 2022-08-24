package model;

import model.interfaces.IAnimal;
import model.interfaces.IFly;
import model.interfaces.IPrey;
import model.interfaces.ISwim;

public class Puffin implements IAnimal, IFly, ISwim, IPrey {
    @Override
    public void eat() {
        System.out.println("Puffin is eating");
    }

    @Override
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

    @Override
    public void flee() {
        System.out.println("Puffin is fleeing from preditor");
    }

    public void animal(){
        System.out.println("Puffin is an animal");
    }
}
