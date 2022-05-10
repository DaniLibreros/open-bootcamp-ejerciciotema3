public class Main {
    public static void main(String[] args) {
       //System.out.println(suma( 5, 2, 6 ));

       // Segunda parte
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas(1);
        miCoche.incrementarPuertas(20);
        System.out.println(miCoche.puertas);

    }

    public static int suma ( int par1, int par2, int par3 )  {
        return par1 + par2 + par3;
    }
}