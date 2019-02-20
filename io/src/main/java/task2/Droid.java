package task2;

import java.io.*;

public class Droid implements Serializable {
    private String name;
    private int force;
    private transient int number;

    public Droid() {
        this.name = "Nazar";
        this.force = 15;
        this.number = 21;
    }

    @Override
    public String toString() {
        return "task2.Droid{" + "name='" + name + '\'' + ", force=" + force + ", number=" + number + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Droid(String name, int force, int number) {
        this.name = name;
        this.force = force;
        this.number = number;
    }

    public static void main (String[] args) throws Exception {
        Droid input = new Droid();
        // serialization
        FileOutputStream fos = new FileOutputStream("abc.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(input);

        // de-serialization
        FileInputStream fis = new FileInputStream("abc.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Droid output = (Droid) ois.readObject();
        System.out.println("i = " + output.toString());

    }
}
