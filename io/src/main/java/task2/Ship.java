package task2;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Ship implements Serializable {
    private  String name;
    private int number;
    private List<Droid> droidList = new LinkedList<Droid>();

    @Override
    public String toString() {
        return "Ship{" + "name='" + name + '\'' + ", number=" + number + ", droidList=" + droidList + '}';
    }

    private void fill (){
        droidList.add(new Droid("nazar",11,1212));
        droidList.add(new Droid("nazar2",12,21212));
        droidList.add(new Droid("nazar3",13,22121));
        droidList.add(new Droid("nazar4",14,21221));
        droidList.add(new Droid("nazar5",15,212));

    }

    //transient не серреалізується


    public static void main(String[] args) throws Exception {
        Ship ship = new Ship();
        ship.fill();
        // serialization
        FileOutputStream fos = new FileOutputStream("a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ship);

        // de-serialization
        FileInputStream fis = new FileInputStream("a.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Ship output = (Ship) ois.readObject();
        System.out.println("i = " + output.toString());
    }


}
