package objetoarreglos;

public class Main {
    public static void main(String[] args) {
        
        Frutas [] cestaFrutas = new Frutas [3];

        cestaFrutas[0] = new Frutas();
        cestaFrutas[0].nombre = "Manzan";
        cestaFrutas[0].color = "Rojo";

        cestaFrutas[1] = new Frutas();
        cestaFrutas[1].nombre = "Pera";
        cestaFrutas[1].color = "verde";

        cestaFrutas[2] = new Frutas();
        cestaFrutas[2].nombre = "naranja";
        cestaFrutas[2].color = "naranja";

        for( int i = o; i< cestaFrutas.length; i++){

            if(cestaFrutas[i]!= null) {
                System.out.println("Fruta: " + cestaFrutas[i].nombre+ " Color:" +cestaFrutas[i].color);
            }
        }









    }
}