package factory_method.RPG_map_generator;

public class WaterTile implements Tile {
    public char getCharacter() {
        return 'W';
    }

    public String getType() {
        return "water";
    }
}
