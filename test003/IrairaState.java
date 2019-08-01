class IrairaState extends DogState{
    private static IrairaState s = new IrairaState();
    private IrairaState(){}

    public static DogState getInstance(){
        return s;
    }
    public void tukareta(Dog moto){
        moto.changeState(byoukiState.getInstance());
    }
    
    public void tabeta(Dog moto) {
        moto.changeState(FutsuuState.getInstance());
    }

    public String toString(){
        return "いらいら状態";
    }
}
