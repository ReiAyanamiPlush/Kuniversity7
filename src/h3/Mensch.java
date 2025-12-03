package h3;

public class Mensch {

    int jahr = 2025;

    String name;
    int gebJahr;
    int alter;

    public void setName(String a){
        name=a;
    }
    public void setGebJahr(int a){
        gebJahr=a;
    }
    public void setAlter(){
        alter=jahr-gebJahr;
    }

    public String getName(){
        return name;
    }
    public int getGebJahr(){
        return gebJahr;
    }
    public int getAlter(){
        return alter;
    }

}
