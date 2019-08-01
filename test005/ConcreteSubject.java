class Suuchi extends Subject {
    int SuuchiState;
    int atal;

    public int getState(){
        return SuuchiState;
    }
    public void putValue(int atai){
        if(atai>this.atal){
            this.atal = atai;
            this.tsuuchi();
        }else{
            System.out.println("確認用メッセージ:更新してません");
        }
    }
    public int getValue(){
        return atal;
    }
}