package factory_method.RPG_map_generator;

public abstract class Map {
    protected static final int SIZE = 5;

    public void display() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++){
                Tile tile = createTile();
                System.out.print(tile.getCharacter() + " ");
            }
            System.out.println();
        }
    }

    public abstract Tile createTile();
}
