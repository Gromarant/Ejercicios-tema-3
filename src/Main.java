public class Main {
    public static void main(String[] args) {
        int number = sumar(2,9,7);
        System.out.println( number );

        Coche miCoche = new Coche();
        miCoche.addPuerta();
        System.out.println( miCoche.getPuertas());
    }

    public static int sumar(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

}