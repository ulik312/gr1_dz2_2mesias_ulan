public class Main {
    public static void main(String[] args) {
        Printable printable[] ={createObject("iphone8"),createObject("Iphone7"),
                createObject("iphone6")};
        for (Printable print1:printable) {
            print1.print();
        }

    }
    public static Printable createObject(String classNAme){
        switch (classNAme){
            case "iphone8":
                Iphone_8 iphone_8 = new Iphone_8(40,"BM43");
                return iphone_8;
            case "Iphone7":
                Iphone_7 iphone_7 = new Iphone_7(60,"BN68");
                return iphone_7;
            case "iphone6":
                Iphone_6 iphone_6 = new Iphone_6(80,"BN87",87 );
                return iphone_6;
        }
        return  null;
    }
}