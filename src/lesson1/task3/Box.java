package lesson1.task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit>{

    private ArrayList<T> objectsArrayList = new ArrayList<>();
    private T objectType;
    public Box(T objectType) {
        this.objectType = objectType;
    }

    public void putSomething(T obj, int quantity){
        if (!this.objectType.getClass().equals(obj.getClass())){
            System.err.println("Классы объектов не совместимы!");
            return;
        }
        for (int i = 0; i < quantity; i++) {
            this.objectsArrayList.add(obj);
        }
    }

    public void putSomething(T[] objArr){
        this.objectsArrayList.addAll(Arrays.asList(objArr));
    }

    public float getWeight(){
        return this.objectsArrayList.size() * this.objectType.getWeight();
    }

    public void transferToAnotherBox(Box<T> box, Box<T> newBox){
        newBox.objectsArrayList.addAll(box.objectsArrayList);
        box.objectsArrayList.clear();
    }

    public boolean compareTo(Box<?> box) {
        return this.getWeight() == box.getWeight();
    }
}
