package generics;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    private List<T> list;
    private int dimension;

    public MyList(int dimension) {
        list = new ArrayList<>(dimension);
        this.dimension = dimension;
    }

    public void add (T element){
        if(list.size() == dimension)
            System.out.println("Out of range");
        else
            list.add(element);
    }

    public void print(){
        for(T t : list)
            System.out.println(t);
    }

    @Override
    public String toString() {
        return "MyList{" +
                "list=" + list +
                ", dimension=" + dimension +
                '}';
    }

    public boolean lookup(T element){
        return list.contains(element);
    }
}
