public abstract class CuerpoCeleste {
    //Atributos
    private String nombre;
    private float masa;
    private float diametro;
    private float periodoRotacion;
    private float periodoTraslacion;
    private float distanciaMedia;
    private final double UA = 1.496e+11;


    public CuerpoCeleste(String nombre, float masa, float diametro, float velocidadAngular, float semiejeMayor) {
            this.nombre = nombre;
            this.masa = masa;
            this.diametro = diametro;
            periodoRotacion = calcularRotacion(velocidadAngular);
            periodoTraslacion = calcularTraslacion(semiejeMayor);
            distanciaMedia = calcularDistanciaMedia(semiejeMayor);


    }

    private float calcularRotacion(float velocidadAngular) {
        double T = velocidadAngular != 0 ? (2 * Math.PI) / velocidadAngular : velocidadAngular;

        return (float) T;
    }

    private float calcularTraslacion(float semiejeMayor) {
        Double P = Math.pow(semiejeMayor, 3);
        return (float) Math.sqrt(P);
    }

    private float calcularDistanciaMedia(float semiejeMayor) {
        double Dm = semiejeMayor * UA;
        return (float) Dm;
    }

    public float getMasa() {
        return masa;
    }

    public float getDiametro() {
        return diametro;
    }

    public float getPeriodoRotacion() {
        return periodoRotacion;

    }

    public float getPeriodoTraslacion() {
        return periodoTraslacion;
    }

    public float getDistanciaMedia() {
        return distanciaMedia;
    }

    public String toString(){
        return "Nuevo Cuerpo: "+
                "\nNombre: " + nombre +
                "\nMasa: " + masa +
                "\nDiametro: " + diametro +
                "\nPeriodo Rotacional : " + periodoRotacion + "Rad/s" +
                "\nPeriodo de Traslación " + periodoTraslacion + "Dias"+
                "\nDistancia Media a la tierra: " + distanciaMedia;
    }

    public abstract void muestra();


}
