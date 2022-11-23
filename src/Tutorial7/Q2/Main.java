package Tutorial7.Q2;

import java.util.ArrayList;

public class Main {
    public static void listDemo(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++)
        {
            int element = list.get(i);
            list.remove(i);
            list.add(0, element + 1);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(4);
        arr.add(5);
        arr.add(10);
        arr.add(15);
        listDemo(arr);
    }
}
