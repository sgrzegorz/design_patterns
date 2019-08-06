import java.util.*;
import java.util.Enumeration;


public class Main {



    public static void main(String []args){
//        Map<Integer,String> mapa = new HashMap<>();
//        Enumeration<Map<Integer,String>> e = new Enumeration<Map<Integer, String>>(mapa);
//
//        Enumeration paramEnum=getmapaNames();
//        while (paramEnum.hasMoreElements()) {
//            String paramName=paramEnum.nextElement().toString();
//            initParameters.put(paramName,getInitParameter(paramName));
//        }
//
//
//        for (Enumeration<Map<Integer,String>> e = mapa.elements(); mapa.hasMoreElements();)
//            System.out.println(e.nextElement());
//



        Iterator itr = al.iterator();

        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();



        Map<Integer,String> mapa = new HashMap<>();
        mapa.put(1,"jeden");
        mapa.put(2,"dwa");
        mapa.put(3,"trzy");
        mapa.put(4,"cztery");
        Enumeration <Map.Entry<Integer,String>> enm1 = Collections.enumeration(mapa);

        while(enm1.hasMoreElements()){
            System.out.print(enm.nextElement() +" ");
        }



}
}

