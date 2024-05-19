public class Main {
    public static void main(String[] args) {

        CuerpoCeleste tierra = new Planetas("tierra" , 5.97e24F, 12742e6F,
                7.27e-5F, 1.496e11F);
        System.out.println("=======================================");

        CuerpoCeleste luna = new Satelite("luna", 7.35e22F, 3474F,
                2.662e-6F, 3.884e8F, "Tierra" );
    }
}