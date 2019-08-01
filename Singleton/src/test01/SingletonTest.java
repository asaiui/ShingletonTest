package test01;

public class SingletonTest {
    public static void main(String[] args) {
        Renban renban1 = new Renban.getNunber();
        renban1.bangou(999);
        renban1.print();
    }
}

class Renban {
    private static Renban jittai = new Renban();
    int Number;

    private Renban() {
        this.Number = 0000;
    }

    public static Renban getNunber() {
        return jittai;
    }

    public void bangou(int Number) {
        Number += bangou;
    }

    public void print() {
        System.out.print("No:" + Number);
    }
}
