
package ejerciciopokemon;

public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur() {
    }
    
    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque arañazo");
       
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque mordisco");
        
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola, soy Bulbasaur y este es mi ataque Drenaje");
        
    }

    @Override
    public void atacarParalizar() {
      System.out.println("Hola, soy Bulbasaur y este es mi ataque paralizar");

    }
    
}
