import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*  calculadoraGenerica suma= new calculadoraGenerica();
        suma.add(23.5,23.76);*/

        ArrayList<Double> listanumeros = new ArrayList<>();
        listanumeros.add(1.0);
        listanumeros.add(1.01);
        listanumeros.add(3.5432);
        listanumeros.add(1.12);
        List<?extends Number> numeros= Arrays.asList(1, 1.01);
        //List<? extends Number> numeros= List.of(2.53, 1.01,3.5432,1.12);

        calculadoraGenerica operacion = new calculadoraGenerica(numeros);
        operacion.sumaGenerica();
        operacion.multiplicaGenerica();
        operacion.restaGenerica();
        operacion.divicionGenerica();
    }
}