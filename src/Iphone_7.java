public class Iphone_7 extends Iphone{
    private int Camera;

    public Iphone_7(int camera, String bata) {
        super(camera, bata);
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