import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

public class Main {

    public static void main(String []args){
        Map<Integer,String> mapa = new HashMap<>();
        mapa.put(1,"jeden");
        mapa.put(2,"dwa");
        mapa.put(3,"trzy");
        mapa.put(4,"cztery");

        for(Map.Entry<Integer,String> c : mapa.entrySet()){
            System.out.println(c);
        }

        long i=0;
        Iterator <Map.Entry<Integer,String>> it = mapa.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> pair = it.next();
            i+=pair.getKey();
        }
        System.out.println(i);


    }
}

