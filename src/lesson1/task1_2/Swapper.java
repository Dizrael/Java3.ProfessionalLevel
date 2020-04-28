package lesson1.task1_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Swapper<T> {
    public Swapper() {
    }

    public T[] swap(T[] objArray, int index1, int index2){
        T firstElem = objArray[index1];
        objArray[index1] = objArray[index2];
        objArray[index2] = firstElem;
        return objArray;
    }

    public ArrayList<T> convertToArrLst(T[] objArr){
        return new ArrayList<>(Arrays.asList(objArr));
    }

}
