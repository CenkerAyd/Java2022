public class ReCapDemo1 {
    public static void main(String[] args) {
        int sayi1=17;
        int sayi2=17;
        int sayi3=17;
        int enBuyuk;

        if (sayi1>sayi2 && sayi1>sayi3){
            enBuyuk =sayi1;
            System.out.println("EN büyük sayı:" +enBuyuk);
        }else if (sayi2>sayi3 &&sayi2>sayi1){
            enBuyuk =sayi2;
            System.out.println("En Büyük sayı :" +enBuyuk);
        }else if (sayi3>sayi2 &&sayi3>sayi1){
            enBuyuk=sayi3;
            System.out.println("En büyük sayı :" +enBuyuk);
        }else {
            System.out.println("Bütün Sayılar Eşittir.");
        }

    }
}
