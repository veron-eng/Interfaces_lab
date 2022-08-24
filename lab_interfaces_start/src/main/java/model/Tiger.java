package model;

import model.interfaces.*;

// Hint: missing an interface and a method implementation
public class Tiger implements ISwim, IAnimal, IRun, ISleep, IEat, IHunt {

    @Override
    public void swim() {
        System.out.println("Tiger is swimming");
    }

    public void animal(){
        System.out.println("Tiger is an animal");
    }

    public void run(){
    System.out.println("tiger is running");}

    public void eat(){
    System.out.println("tiger is eating");}

    public void sleep(){
    System.out.println("tiger is sleeping");}

    public void hunt(){
        System.out.println("tiger is hunting");
    }


}
