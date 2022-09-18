import java.util.Scanner;

public class variables {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        String mesaj= "BEŞİKTAŞ";
        int ogrenciSayisi;
        boolean dogruMu= true;
        char karakter ='C';
        double  x=1.5;
        byte y=5;


        System.out.println("Lütfen Öğrenci Sayısını Giriniz :");
        ogrenciSayisi=sc.nextInt();

        System.out.println("Öğrenci Sayısı :" +ogrenciSayisi);

    }
}
