package factory_method.RPG_map_generator;

public class SwampTile implements Tile {

    public char getCharacter() {
       return 'S';
    }

    public String getType() {
        return "swamp";
    }
}
