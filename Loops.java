public class Loops {
    public static void main(String[] args) {

        for (int i=0;i<15;i++){
            System.out.println(i);
        }

        System.out.println("---------------------------");

        for (int y=0;y<25;y+=2){
            System.out.println(y);
        }

        System.out.println("For Döngüsü Bitti");
        System.out.println("--------------------");
        int a=0;
        while ( a<20){
            a+=3;
            System.out.println(a);
        }
        System.out.println("While Döngüsü Bitti!");
        System.out.println("--------------------");
        int b=10;
        do {
            b+=4;
        }while (b<20);
        System.out.println("Do-While Döngüsü Bitti");
    }
}
