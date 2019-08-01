package test01;

public class SingletonSampleX {
    public static void main(String[] args) {
        Tsuuchou Tsuuchou1 = new Tsuuchou("202-01784", "山田");
        Tsuuchou Tsuuchou2 = new Tsuuchou("505-02484", "鈴木");
        Tsuuchou Tsuuchou3 = new Tsuuchou("606-06134", "田中");

        Tsuuchou1.torihiki(500);
        Tsuuchou1.torihiki(200);
        Tsuuchou2.torihiki(-400);
        Tsuuchou3.torihiki(300);

        Tsuuchou1.print();
        Tsuuchou2.print();
        Tsuuchou3.print();
    }
}

class Tsuuchou {
    private String code;
    private String name;
    private int yokingaku;

    public Tsuuchou(String code, String name) {
        this.code = code;
        this.name = name;
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