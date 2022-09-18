import java.util.Scanner;

public class conditionals {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Sayıyı Giriniz :");
        int sayi=sc.nextInt();
         if(sayi <15 && sayi>0){
             System.out.println("Sayı 15'ten küçük ve pozitiftir");
         }else if (sayi<15 && sayi<0){
             System.out.println("Sayı 15'ten küçük ve negatiftir.");
         }else if (sayi >15 ){
             System.out.println("Sayı 15'ten büyüktür");
         }else {
             System.out.println("Sayı 15'e eşittir");
         }


         
    }
}
