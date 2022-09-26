import java.util.Scanner;
public class Pratik2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fiyat, kdvOran1 = 0.18, kdvOran2= 0.08, kdvFiyat, kdvliFiyat;
        System.out.println("kdv'siz fiyat gir:");
        fiyat = input.nextDouble();

        if (fiyat>=0 && fiyat<=1000){
            kdvFiyat = kdvOran1*fiyat;
            kdvliFiyat = kdvFiyat + fiyat;
        }else{
            kdvFiyat = kdvOran2*fiyat;
            kdvliFiyat = kdvFiyat + fiyat;
        }

        System.out.println(fiyat);
        System.out.println(kdvFiyat);
        System.out.println(kdvliFiyat);

    }
}
