public class Fighter implements Sprite {
    private FighterRank rank;

    public Fighter(FighterRank rank) {
        this.rank = rank;
    }

    public FighterRank getRank() {
        return rank;
    }

    @Override
    public void draw() {
        System.out.println("Drawing fighter");
    }

    @Override
    public void mode(int x, int y) {
        System.out.println("Moving Fighter to position " + x + ", " + y);

    }
}
