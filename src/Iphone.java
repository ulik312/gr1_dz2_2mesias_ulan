
public class Iphone implements Printable {

    private int Camera;
    private String Batarey ;

    public int getCamera() {
        return Camera;
    }

    public String getBata() {
        return Batarey;
    }

    public Iphone(int camera, String bata) {
        Camera = camera;
        Batarey = bata;
    }




    public String info(){
        return Camera + Batarey;
    }

    @Override
    public void print() {

    }
}