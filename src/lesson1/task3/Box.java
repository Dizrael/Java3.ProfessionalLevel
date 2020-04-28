package lesson1.task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit>{

    private ArrayList<T> box = new ArrayList<>();

    public Box() {

    }

    public void putSomething(T obj, int quantity){
//        if (!this.getClass().equals(obj.getClass())){
//            System.err.println("Классы объектов не совместимы!");
//            return;
//        }
        for (int i = 0; i < quantity; i++) {
            this.box.add(obj);
        }
    }

    public void putSomething(T[] objArr){
        this.box.addAll(Arrays.asList(objArr));
    }

    public float getWeight(){
        return this.box.size()/T.getWeight();
    }

    public Box<T> transferToAnotherBox (Box<T> box){
        Box<T> newBox = new Box<>();
        newBox.box.addAll(box.box);
        box.box.clear();
        return newBox;
    }

    public boolean compareTo(Box<T> box) {
        return this.getWeight() == box.getWeight();
    }
}
