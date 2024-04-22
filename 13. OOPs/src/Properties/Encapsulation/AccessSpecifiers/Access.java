package Properties.Encapsulation.AccessSpecifiers;

public class Access {
    int var;
    private int num;
    protected String name;
    int[] arr;

    public Access(int var, int num, String name) {
        this.var = var;
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
