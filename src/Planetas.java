public class Planetas extends CuerpoCeleste{
    //Atrributos
    private float distanciaAuSol;
    private float orbitaSolar;
    private boolean tieneSatelites;

    public Planetas(String nombre, float masa, float diametro, float velocidadAngular, float semiejeMayor){
        super(nombre, masa, diametro, velocidadAngular, semiejeMayor);
        distanciaAuSol = semiejeMayor;
        orbitaSolar = getDistanciaMedia();
        tieneSatelites = true;
        System.out.println(toString());

    }

    public float getDistanciaAuSol(){
        return distanciaAuSol;
    }
    public float getOrbitaSolar(){
        return orbitaSolar;
    }
    public boolean getTieneSatelites(){
        return tieneSatelites;
    }

    @Override
    public String toString(){
        return super.toString() +
                "\nDistancia al sol: " + distanciaAuSol + "m" +
                "\nOrbita solar: " + orbitaSolar + "m" +
                "\nSatelites? " + (tieneSatelites ? "SI" : "NO");
    }

    @Override
    public void muestra() {
        System.out.println(this);
    }


}
