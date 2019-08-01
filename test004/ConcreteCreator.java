import com.sun.javafx.geom.PickRay;

class TvKoujyou extends Koujyou{
    public Seihin factoryMethod(){
        return new Television();
    }
    public void touroku(Seihin s){
        Television t = (Television) s;
        t.numberring();
        t.setDate(Date.today());
    }
}