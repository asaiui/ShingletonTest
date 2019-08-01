package test01;

public class SingletonSample1 {
    public static void main(String[] args) {
        TsuuchouS tsuuchou1 = TsuuchouS.getInstance();
        tsuuchou1.torihiki(500);
        tsuuchou1.print();
        TsuuchouS tsuuchou2 = TsuuchouS.getInstance();
        tsuuchou2.torihiki(300);
        tsuuchou2.print();

        if (tsuuchou1 == tsuuchou2)
            System.out.println("通帳1 と2 は同じインスタンス");
        else
            System.out.println("通帳1 と2 は同じインスタンス");
    }
}

class TsuuchouS {
    private static TsuuchouS jittai = new TsuuchouS();
    private String code;
    private String name;
    private int yokingaku;

    private TsuuchouS() {
        this.code = "101-14484";
        this.name = "山田";
    }

    public static TsuuchouS getInstance() {
        return jittai;
    }

    public void torihiki(int kingaku) {
        yokingaku += kingaku;
    }

    public void print() {
        System.out.println("+-------------------------+");
        System.out.println("口座番号：" + code);
        System.out.println("氏名：" + name);
        System.out.println("預金額：" + yokingaku);
    }
}
