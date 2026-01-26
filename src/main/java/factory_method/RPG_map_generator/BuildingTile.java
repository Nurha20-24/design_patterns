package factory_method.RPG_map_generator;

public class BuildingTile implements Tile {
    public char getCharacter() {
        return 'B';
    }

    public String getType() {
        return "building";
    }
}
