public class Iphone_6 extends Iphone {
    private int Camera;

    public Iphone_6(int camera, String bata, int camera1) {
        super(camera, bata);
        Camera = camera1;
    }

    @Override
    public int getCamera() {
        return Camera;
    }

    @Override
    public void print() {
        System.out.println(info()+Camera);
    }

}