package Tutorial7.Q1;

public class Main {
    public static void loadArray(int[] list) {
        for (int i = 1; i < list.length; i++)
        {
            list[i] = list[i] + list[i - 1];
            System.out.println(list[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 0, 4};
        loadArray(arr);
    }
}
