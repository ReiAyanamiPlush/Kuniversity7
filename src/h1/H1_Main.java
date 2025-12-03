package h1;

public class H1_Main {

    public static void main(String[] args) {

        Zahl z = new Zahl();
        z.num = 200;
        z.setEven();
        z.setPositive();
        z.setSmall();
        System.out.println("even: "+z.even);
        System.out.println("positive: "+z.positive);
        System.out.println("small: "+z.small);

    }

}
