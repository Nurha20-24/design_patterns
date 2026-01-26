package factory_method.RPG_map_generator;

public class ForestTile implements Tile {

    public char getCharacter() {
        return ('F');
    }

    public String getType() {
        return "forest";
    }
}
