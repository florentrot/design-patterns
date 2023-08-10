import java.util.HashMap;
import java.util.Map;

public class FighterFactory {
    static Map<FighterRank, Fighter> fightersMap = new HashMap<>();

    public static Fighter getFighter(FighterRank rank) {
        Fighter f= fightersMap.get(rank);
        if(f == null) {
            f = new Fighter(rank);
            fightersMap.put(rank,f);
        }
        return f;
    }
}
