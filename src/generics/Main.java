package generics;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>(5);

        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        System.out.println("The element is in the list? " + list.lookup(8));

    }
}
