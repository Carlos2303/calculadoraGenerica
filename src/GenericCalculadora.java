import java.util.ArrayList;

public class GenericCalculadora<T extends Number> {

    private ArrayList<T>listNumeros=new ArrayList<T>();
    public void add(T numero1, T numero2){
        double v = numero1.doubleValue() + numero2.doubleValue();
        System.out.println(v);
    }
}
