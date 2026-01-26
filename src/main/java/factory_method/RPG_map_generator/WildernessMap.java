package factory_method.RPG_map_generator;

import java.util.Random;

public class WildernessMap extends Map {
    private static final Random random = new Random();

    public Tile createTile() {
        int choice = random.nextInt(3);

        return switch (choice) {
            case 0 -> new SwampTile();
            case 1 -> new ForestTile();
            case 2 -> new WaterTile();
            default -> throw new IllegalStateException("Unexpected value " + choice);
        };
    }
}
