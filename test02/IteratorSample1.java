public class IteratorSample1 {
    public static void main(String[] args) {
        GameListAggregate gameListAggregate = new GameListAggregate();
        Iterator iterator = gameListAggregate.createIterator();
        gameListAggregate.add("みんゴル", 4500);
        gameListAggregate.add("monhan", 7800);
        gameListAggregate.add("pawapuro", 9000);
        gameListAggregate.add("saikuro", 3000);

        iterator.first();
        while (!iterator.isDone()) {
            Game game = (Game) iterator.getItem();
            System.out.println(list.getName());
            iterator.next();
        }
    }

}