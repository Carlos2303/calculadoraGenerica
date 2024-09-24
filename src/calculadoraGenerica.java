import java.util.List;

public class calculadoraGenerica<T extends Number> {

  /*  private ArrayList<T>listNumeros=new ArrayList<T>();
    public void add(T numero1, T numero2){
        double v = numero1.doubleValue() + numero2.doubleValue();
        System.out.println(v);
    }*/

    private List<T> numeros;

    calculadoraGenerica(List<T> numeros){
        this.numeros=numeros;
    }
    public void sumaGenerica(){
        double suma = 0;
        for (T numero:numeros){
            suma = suma +numero.doubleValue();
        }
        System.out.println("Suma: "+suma);
    }

    public void restaGenerica(){
        double resta = numeros.get(0).doubleValue();
        for (int i = 1; i < numeros.size(); i++) {
            resta =resta-numeros.get(i).doubleValue();
        }
        System.out.println("Resta: "+ resta);
    }

    public void multiplicaGenerica(){
        double multiplica =1;
        for (T numero:numeros){
            multiplica = multiplica *numero.doubleValue();
        }
        System.out.println("Multiplicación: "+ multiplica);
    }

    public void divicionGenerica(){
        double divicion = numeros.get(0).doubleValue();
        for (int i = 1; i < numeros.size(); i++) {
            divicion =divicion/numeros.get(i).doubleValue();
        }
        System.out.println("División: "+divicion);
    }
}
