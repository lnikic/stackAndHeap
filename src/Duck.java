public class Duck {

    private int kilos = 6;
    private float floatability = 2.1F;
    private String name = "Generic";
    private long[] feathers = {1, 2, 3, 4, 5, 6, 7};
    private boolean canFly = true;
    private int maxSpeed = 25;

    public Duck() {
        super();
        System.out.println("type 1 duck");
    }

    public Duck(boolean fly) {
        canFly = fly;
        System.out.println("type 2 duck");
    }

    public Duck(String n, long[] f) {
        name = n;
        feathers = f;
        System.out.println("type 3 duck");
    }

    public Duck(int w, float f) {
        kilos = w;
        floatability = f;
        System.out.println("type 4 duck");
    }

    public Duck(float density, int k) {
        floatability = density;
        kilos = k;
        System.out.println("type 5 duck");
    }

}
