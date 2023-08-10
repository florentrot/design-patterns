import java.util.Random;

public class Main {
    public static int totalP = 0;
    private static int totalS = 0;
    private static int totalM = 0;

    public static void main(String[] args) {


        int toDraw = 1000;
        Army army = new Army();
        FighterRank currentRank;
        Random random = new Random();

        for (int i = 0; i < toDraw; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    currentRank = FighterRank.PRIVATE;
                    totalP++;
                    break;
                case 1:
                    currentRank = FighterRank.SERGEANT;
                    totalS++;
                    break;
                default:
                    currentRank = FighterRank.MAJOR;
                    totalM++;
                    break;
            }
            army.spawnFighter(currentRank);
        }

        army.drayArmy();
        countArmy();
    }

    public static void countArmy() {
        System.out.println("");
        System.out.println("Privates: " + totalP);
        System.out.println("Sergeants: " + totalS);
        System.out.println("Majors: " + totalM);
    }
}