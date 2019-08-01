class NishinHyouji implements Observer{
    public void update(Subject s){
        print(((Suuchi)s).getValue());
    }
    private void print(int n){
        System.out.println(n+"２進数で表示");
    }
}

class JyuurokushinHyouji implements Observer{
    public void update(Subject s){
        print(((Suuchi)s).getValue());
    }
    private void print(int n){
        System.out.println(n+"16進数で表示");
    }
}