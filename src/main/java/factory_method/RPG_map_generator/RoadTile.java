package factory_method.RPG_map_generator;

public class RoadTile implements Tile {

    public char getCharacter() {
        return 'R';
    }

    public String getType() {
        return "road";
    }
}
