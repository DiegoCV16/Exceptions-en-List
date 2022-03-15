
import uaslp.objetos.parcial2.Iterator;
import uaslp.objetos.parcial2.List;
import uaslp.objetos.parcial2.arraylist.ArrayList;
import uaslp.objetos.parcial2.linkedlist.LinkedList;
import uaslp.objetos.parcial2.linkedlist.LinkedListIterator;


public class Main {

        public static void main(String[] args) {
            metodo(new ArrayList<>(), new ArrayList<>(),new ArrayList<>());
            metodo(new LinkedList<>(),new LinkedList<>(),new LinkedList<>());
        }
        public static void metodo(List<String> team1, List<String> team2, List<String> team3) {

            List<Double> doubles = new ArrayList<>();

            team1.addAtTail("Jesús");
            team1.addAtTail("Salomón");
            team1.addAtTail("Yael");

            team2.addAtFront("Cristian");
            team2.addAtFront("Daniel");
            team2.addAtFront("Diego");

            team3.addAtFront("Imelda");

            Iterator<String> iterator;

            iterator = team1.getIterator();

            while (iterator.hasNext()) {
                String name = iterator.next();
                System.out.println(name);
            }

            iterator = team2.getIterator();
            while (iterator.hasNext()) {
                String name = iterator.next();
                System.out.println(name);
            }

            team1.remove(0);
            team1.addAtFront("Rebeca");
            System.out.println("Team 1 tiene: " + team1.getSize() + " integrantes");
            iterator = team1.getIterator();
            while (iterator.hasNext()) {
                String name = iterator.next();
                System.out.println(name);
            }

            team2.remove(2);
            team2.addAtTail("Rita");
            System.out.println("Team 2 tiene: " + team2.getSize() + " integrantes");
            iterator = team2.getIterator();
            while (iterator.hasNext()) {
                String name = iterator.next();
                System.out.println(name);
            }

            team3.remove(0);
            team3.remove(0);
            team3.addAtTail("Tadeo");
            team3.addAtFront("Isai");
            System.out.println("Team 3 tiene: " + team3.getSize() + " integrantes");
            iterator = team3.getIterator();
            while (iterator.hasNext()) {
                String name = iterator.next();
                System.out.println(name);
            }

            if (team1.getAt(1).equals("Salomón")) {
                team1.setAt(1, "Luis");
            }
            System.out.println("Team 1 tiene: " + team1.getSize() + " integrantes");
            iterator = team1.getIterator();
            while (iterator.hasNext()) {
                String name = iterator.next();
                System.out.println(name);
            }

    }
}
