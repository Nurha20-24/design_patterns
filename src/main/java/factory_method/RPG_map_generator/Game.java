package factory_method.RPG_map_generator;
/*
 Assignment: RPG Map Generator:
 The goal is to design an application that generates a random map
 for a role-playing game using the Factory Method design pattern.
 */

public class Game {

    public Map createMap(String mapType){
        if (mapType.equalsIgnoreCase("city")){
            return new CityMap();
        } else if (mapType.equalsIgnoreCase("wilderness")) {
            return new WildernessMap();
        } else {
            throw new IllegalArgumentException("Unknown map type " + mapType);
        }
    }


    public static void main(String[] args) {
              Game game = new Game();
              Map map = game.createMap("Wilderness");
              map.display();
    }
}
