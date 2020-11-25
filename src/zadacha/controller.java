package zadacha;

public class controller {

    public static pryamougolnik createABCD(){
        pryamougolnik ABCD = new pryamougolnik();
        ABCD.a = 2;
        ABCD.b = 6;
        return ABCD;
    }
    public static int Jaimini(pryamougolnik ABCD){
        int perimeter = (ABCD.a + ABCD.b)*2;
        return perimeter;
    }
    public static int Kalimohan(pryamougolnik ABCD){
        int square  = ABCD.a * ABCD.b;
        return square;
    }

}
