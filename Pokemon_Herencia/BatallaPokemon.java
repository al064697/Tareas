package Pokemon_Herencia;

public class BatallaPokemon {
    public static void main(String[] args) {
        PokemonElectrico pokemonElectrico = new PokemonElectrico ("Pikachu", 10);
        PokemonFuego pokemonFuego = new PokemonFuego ("Charmeleon", 10);
        pokemonElectrico.atacar("electrotrueno", pokemonFuego);
        System.out.println("HP = " + pokemonFuego.getHP());
        pokemonFuego.atacar("garra dragon", pokemonElectrico);
        System.out.println("HP = " 
        + pokemonElectrico.getHP());


    }
    
}
