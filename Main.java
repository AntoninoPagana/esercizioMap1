import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> mappa1 = new HashMap<>();
        mappa1.put("Bibita", "Coca Cola");
        mappa1.put("Cibo", "Panino al Salame");
        mappa1.put("Prodotto", "Tovaglia");

        for (Map.Entry<String, String> element : mappa1.entrySet()) {
            System.out.println("mappa1 element: " + element);
        }

        //

        Map<String, String> mappa2 = Map.of("Bibita", "Sprite", "Cibo", "McFlurry", "Prodotto", "Fazzoletto");
        for (Map.Entry<String, String> element : mappa2.entrySet()) {
            System.out.println("mappa2 element: " + element);

        }

        //

        Map<String, String> mappa3 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Bibita", "Aranciata"),
                new AbstractMap.SimpleEntry<>("Cibo", "Pizza"),
                new AbstractMap.SimpleEntry<>("Prodotto", "Bicchiere")
        );
        for (Map.Entry<String, String> element : mappa3.entrySet()) {
            System.out.println("mappa3 element: " + element);
        }
    }
}
