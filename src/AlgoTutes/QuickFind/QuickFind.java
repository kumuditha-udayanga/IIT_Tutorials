package AlgoTutes.QuickFind;

public class QuickFind {
    private int[] id;
    public QuickFind (int n) {
        this.id = new int[n];
    }

    public boolean connected (int p, int q) {
        if (this.id[p] == this.id[q]) {
            return true;
        }else {
            return false;
        }
    }

    public void union (int p, int q) {
        int pid = id[p];
        int qid = id[q];

        for (int i= 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

    public void displayArray () {
        System.out.println(id.toString());
    }
    public static void main(String[] args) {
        QuickFind Obj = new QuickFind(10);
        System.out.println("Original Array");
        Obj.displayArray();

        Obj.union(3,8);
        Obj.union(5,2);
        Obj.union(2,3);
        Obj.union(9,1);
        Obj.union(7,4);
        Obj.union(3,9);

        System.out.println("After Union");
        Obj.displayArray();
    }
}
