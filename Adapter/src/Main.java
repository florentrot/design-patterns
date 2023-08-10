import java.util.List;

public class Main {
    public static void main(String[] args) {

        DatabaseDataGenerator dataGenerator = new DatabaseDataGenerator();
        DisplayDataAdapter adapter = new DisplayDataAdapter();

        List<DisplayData3rdParty> legacyData = adapter.convertData(dataGenerator.generateData());

        legacyData.forEach((data) -> data.displayData());
    }
}