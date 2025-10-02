package practica1;
import java.util.*;

public class Practica1 {

    //EJERCICIO 1
    public static Set<Integer> multiplos (Iterator<Integer> it) {
        //TODO

        Set<Integer> sol = new HashSet<>();
        List<Integer> lista = new ArrayList<>();

        while (it.hasNext()) {
            int anyadir = it.next();
            if (anyadir != 0) {
                lista.add(anyadir);
            }
        }

        for(int i = 0; i < lista.size(); i++) {
            int actual = lista.get(i);
            boolean multiplo = false;

            for (int j = 0; j < lista.size(); j++) {
                int comprobar = lista.get(j);
                if (i != j) {
                    if ((actual % comprobar) == 0) {
                        multiplo = true;
                        break;
                    }
                }
            }

            if (multiplo) {
                sol.add(actual);
            }

        }
        return sol;
    }

    //EJERCICIO2
    public static void separate (Set<Integer> cuadrados, Set<Integer> noCuadrados)  {

        Set<Integer> elementos = new HashSet<>();
        elementos.addAll(cuadrados);
        elementos.addAll(noCuadrados);

        Set<Integer> cuadrado_elementos = new HashSet<>();
        for(int elem : elementos){
            cuadrado_elementos.add(elem * elem);
        }



        //TODO

    }

    //EJERCICIO 3
    public static<T> Collection<Set<T>> divideInSets (Iterator<T> it) {
        //TODO
        return null;
    }

    //EJERCICIO 4
    public static<T> Collection<Set<T>> coverageSet2 (Set<T> u,ArrayList<Set<T>> col) {
        //TODO
        return null;
    }



}
