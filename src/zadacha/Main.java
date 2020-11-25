package zadacha;

public class Main {

    public static void PrintOtvet(pryamougolnik ABCD){
        int perimeter = controller.Jaimini(ABCD);
        System.out.println(perimeter + " - периметр.");
        int square = controller.Kalimohan(ABCD);
        System.out.println(square +" - площадь." );
    }

    public static void main(String[] args) {
        pryamougolnik Kali = controller.createABCD();
        PrintOtvet(Kali);
    }

}
