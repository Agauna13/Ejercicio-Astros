public class Satelite extends CuerpoCeleste{
    //Atributos
    private float distanciaAlPlaneta;
    private float orbitaPlanetaria;
    private String PlanetaQueOrbita;

    public Satelite(String nombre, float masa, float diametro, float velocidadAngular, float semiejeMayor, String planetaQueOrbita) {
        super(nombre, masa, diametro, velocidadAngular, semiejeMayor);
        this.distanciaAlPlaneta = getDistanciaMedia();
        this.orbitaPlanetaria = getDistanciaMedia();
        this.PlanetaQueOrbita = planetaQueOrbita;
        muestra();

    }
    //Usando el super, el metodo toString va concatenando los atributos del padre sin necesidad de hacer
    //el código de cada clase demasiado extenso
    @Override
    public String toString() {
        return super.toString() +
                "\nDistancia al Planeta: " + distanciaAlPlaneta +
                "\nOrbita Planetaria: " + orbitaPlanetaria +
                "\nPlaneta Que Orbita: " + PlanetaQueOrbita;
    }


    @Override
    public void muestra() {
        System.out.println(toString());
    }
}
