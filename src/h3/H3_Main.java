package h3;

public class H3_Main {

    public static void main(String[] args) {

        Mensch m = new Mensch();
        m.setName("Jonas");
        m.setGebJahr(1999);
        m.setAlter();

        System.out.println("Name: " + m.getName());
        System.out.println("Geburtsjahr: " + m.getGebJahr());
        System.out.println("Alter: " + m.getAlter());

    }

}
