abstract class Subject{
    public ArrayList<Observer>observers;

    Subject(){
        observers = new ArrayList<Observer>();
    }
    public void attch(Observer o){
        observers.add(o);//Observer追加登録
    }
    public void detach(Observer o){
        observers.remove(o);//Observer登録から削除
    }
    public void tsuuchi(){  //notify
        for(Observer observer:observers){
            observers.update(this);
        }
    }
}